package sfl.api.wl.repository;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import sfl.api.wl.entity.Wishlist;
import sfl.api.wl.entity.WishlistItem;
import sfl.api.wl.entity.wliID;


@RunWith(SpringRunner.class)
@SpringBootTest
class WishlistItemRepositoryTest {

	@Autowired
	private WishlistItemRepository wliRepository;
	@Autowired
	private WishlistRepository wRepo;
	
	@BeforeEach
	void setUp() throws Exception {
		// clean it up
		this.wliRepository.deleteAll();
		this.wliRepository.deleteAll();
		
		Wishlist wl1 = new Wishlist("a.sfolcini@gmail.com","Articoli da viaggio","Uella uella",true);
		wRepo.save(wl1);
		
		WishlistItem i1 = new WishlistItem(new wliID("Sneakers44",1));
		WishlistItem i2 = new WishlistItem(new wliID("Sneakers42",1));
		WishlistItem i3 = new WishlistItem(new wliID("MutandoniXL",1));

		wliRepository.save(i1);
		wliRepository.save(i2);
		wliRepository.save(i3);
	}

	@Test
	void test_getAllItems() {
		Iterable<WishlistItem> items = wliRepository.findAll();
		int i=0;
		for(WishlistItem it: items) {
			i++;
		}
		assertEquals(i,3);
	}
	
	@Test
	void test_getItemById() {
		wliID wid = new wliID("Sneakers42",1);
		Optional<WishlistItem> ii = wliRepository.findById(wid);
		assertEquals(ii.get().getId().getItemId(),"Sneakers42");
	}

	@Test
	void test_deleteItemById() {
		wliRepository.deleteById(new wliID("Sneakers42",1));
		Iterable<WishlistItem> items = wliRepository.findAll();
		int i=0;
		for(WishlistItem it: items) {
			i++;
		}
		assertEquals(i,2);
	}
	
}
