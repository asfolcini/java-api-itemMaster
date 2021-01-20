package sfl.api.wl.repository;

import org.springframework.data.repository.CrudRepository;

import sfl.api.wl.entity.WishlistItem;
import sfl.api.wl.entity.wliID;

public interface WishlistItemRepository extends CrudRepository<WishlistItem,wliID>{
	
}
