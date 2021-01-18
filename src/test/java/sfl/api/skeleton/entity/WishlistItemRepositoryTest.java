package sfl.api.skeleton.entity;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import sfl.api.wl.entity.WishlistItem;
import sfl.api.wl.repository.WishlistItemRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class WishlistItemRepositoryTest {

	@Autowired
	private WishlistItemRepository wliRepository;
	
	@BeforeEach
	void setUp() throws Exception {
		// clean it up
		this.wliRepository.deleteAll();
		
		WishlistItem i1 = new WishlistItem("SCARPE"    ,1);
		WishlistItem i2 = new WishlistItem("PANTALONI" ,1);
		WishlistItem i3 = new WishlistItem("MUTANDONI" ,1);

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
		Iterable<WishlistItem> items = wliRepository.findAll();
		String itemId = "";
		for(WishlistItem it: items) {
			itemId = it.getItemId();
			break;
		}
		Optional<WishlistItem> ii = wliRepository.findById(itemId);
		assertEquals(ii.get().getItemId(),itemId);
	}

	@Test
	void test_deleteItemById() {
		wliRepository.deleteById("SCARPE");
		Iterable<WishlistItem> items = wliRepository.findAll();
		int i=0;
		for(WishlistItem it: items) {
			i++;
		}
		assertEquals(i,2);
	}
	
}
