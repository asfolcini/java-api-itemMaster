package sfl.api.wl.repository;

import org.springframework.data.repository.CrudRepository;

import sfl.api.wl.entity.WishlistItem;

public interface WishlistItemRepository extends CrudRepository<WishlistItem,String>{
	
}
