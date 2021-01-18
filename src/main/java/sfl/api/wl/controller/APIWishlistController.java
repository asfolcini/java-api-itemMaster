package sfl.api.wl.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sfl.api.wl.entity.Wishlist;
import sfl.api.wl.entity.WishlistItem;
import sfl.api.wl.repository.WishlistItemRepository;
import sfl.api.wl.repository.WishlistRepository;

@RestController
@RequestMapping("/v1/wl")
public class APIWishlistController {
	
	private static final Logger log =LoggerFactory.getLogger(APIWishlistController.class);
	
	@Autowired
	private WishlistRepository wlRepo;
	@Autowired
	private WishlistItemRepository wliRepo;
	
	@GetMapping
	public Iterable<Wishlist> getAll() {	
		return wlRepo.findAll();
	}

	@GetMapping("/user/{uid}")
	public Iterable<Wishlist> getByUserId(@PathVariable("uid") String uid) {
		return wlRepo.findByUserId(uid);
	}
	
	@GetMapping("/{id}")
	public Object getById(@PathVariable("id") Integer id) {
		return wlRepo.findById(id);
	}

	@PostMapping
	public Wishlist create(@RequestBody Wishlist wl) {
		return wlRepo.save(wl);
	}

	@PostMapping("/{id}/add")
	public Object addItem(@PathVariable("id") Integer id,  @RequestBody WishlistItem wli) {
		log.info("POST su WL "+id);
		return wlRepo.findById(id).map(w -> {
            wli.setWishlistId(id);
            return wliRepo.save(wli);
        });
				
	}
	
	@PutMapping("/{id}")
	public Object update(@PathVariable("id") Integer id, @RequestBody Wishlist wl) {
		return wlRepo.findById(id)
				.map(
					w -> {
				        w.setTitle(wl.getTitle());
				        w.setDescription(wl.getDescription());
				        w.setPublic(wl.isPublic());
				        return wlRepo.save(w);
				      });
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable("id") Integer id) {
		wlRepo.deleteById(id);
		return wlRepo.findById(id);
	}

	
}
