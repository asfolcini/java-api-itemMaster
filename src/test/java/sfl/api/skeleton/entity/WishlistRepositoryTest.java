package sfl.api.skeleton.entity;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import sfl.api.wl.entity.Wishlist;
import sfl.api.wl.repository.WishlistRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
class WishlistRepositoryTest {
	
	@Autowired
	private WishlistRepository wlRepository;
	
	@BeforeEach
	void setUp() throws Exception {
		// clean it up
		this.wlRepository.deleteAll();
		
		Wishlist wl1 = new Wishlist("a.sfolcini@gmail.com","Chitarre Acustiche","Lista strumenti acustici 2021",true);
		Wishlist wl2 = new Wishlist("ginopomicini@yahoo.it","Pomodori 2021","Lista dei miei pomodori",false);
		Wishlist wl3 = new Wishlist("a.sfolcini@gmail.com","Mutandoni","Per non sentirne mai la mancanza",true);
	
		
		assertNull(wl1.getId());
		assertNull(wl2.getId());
		assertNull(wl3.getId());
		
		this.wlRepository.save(wl1);
		this.wlRepository.save(wl2);
		this.wlRepository.save(wl3);
		
		assertNotNull(wl1.getId());
		assertNotNull(wl2.getId());
		assertNotNull(wl3.getId());
	}

	@Test
	void test_getAllWishlists() {
		Iterable<Wishlist> wls = wlRepository.findAll();
		int i=0;
		for(Wishlist wl: wls) {
			i++;
		}
		assertEquals(i,3);
	}
	

	@Test
	void test_getWishlistsByUserId() {
		Iterable<Wishlist> wwl = wlRepository.findByUserId("a.sfolcini@gmail.com");
		int i=0;
		for(Wishlist w: wwl) {
			i++;
		}
		assertEquals(i,2);
	}
	
	@Test
	void test_getWishlistById() {
		Iterable<Wishlist> wwl = wlRepository.findByUserId("a.sfolcini@gmail.com");
		int id=0;
		String title = null;
		for(Wishlist w: wwl) {
			id = w.getId();
			title = w.getTitle();
			break;
		}
		Optional<Wishlist> wl = wlRepository.findById(id);
		assertEquals(title,wl.get().getTitle());
	}
	
	@Test
	void test_updateWishlistById() {
		Iterable<Wishlist> wwl = wlRepository.findByUserId("a.sfolcini@gmail.com");
		int id=0;
		String title = null;
		for(Wishlist w: wwl) {
			id = w.getId();
			title = w.getTitle();
			break;
		}
		Optional<Wishlist> wl = wlRepository.findById(id);
		wl.get().setTitle("Marameo");
		wlRepository.save(wl.get());
		assertEquals(wlRepository.findById(id).get().getTitle(),"Marameo");	
	}
	
	@Test
	void test_removeWishlistById() {
		Iterable<Wishlist> wwl = wlRepository.findByUserId("a.sfolcini@gmail.com");
		int id=0;
		String title = null;
		for(Wishlist w: wwl) {
			id = w.getId();
			title = w.getTitle();
			break;
		}
		assertNotNull(wlRepository.findById(id).get());
		wlRepository.deleteById(id);;
		assertFalse(wlRepository.findById(id).isPresent());	
	}
	
	
}
