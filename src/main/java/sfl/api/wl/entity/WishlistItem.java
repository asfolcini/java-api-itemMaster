package sfl.api.wl.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="wishlist_items")
public class WishlistItem extends BaseEntity{

	@Id
	private String itemId;
	private Integer wishlistId;
	private int quantity;
	private int priority;
	private String comment;
	
	
	public WishlistItem() {}

	public WishlistItem(String itemId,int quantity) {
		this.itemId = itemId;
		this.quantity = quantity;
	}
	
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Integer getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(Integer wishlistId) {
		this.wishlistId = wishlistId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "WishlistItem [itemId=" + itemId + ", wishlistId=" + wishlistId + ", quantity=" + quantity
				+ ", priority=" + priority + ", comment=" + comment + "]";
	}



}
