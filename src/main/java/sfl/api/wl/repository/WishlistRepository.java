package sfl.api.wl.repository;

import org.springframework.data.repository.CrudRepository;

import sfl.api.wl.entity.Wishlist;

public interface WishlistRepository extends CrudRepository<Wishlist,Integer>{
	Iterable<Wishlist> findByUserId(String userId);
}
