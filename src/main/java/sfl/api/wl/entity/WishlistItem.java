package sfl.api.wl.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="wishlist_items")
public class WishlistItem extends BaseEntity implements Serializable{

	
	@EmbeddedId
	private wliID id;
	
	private int quantity;
	private int priority;
	private String comment;
	
	
	public WishlistItem() {}

	public WishlistItem(wliID id) {
		this.id = id;
	}

	public wliID getId() {
		return id;
	}


	public void setId(wliID id) {
		this.id = id;
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
		return "WishlistItem [id=" + id + ", quantity=" + quantity + ", priority=" + priority + ", comment=" + comment
				+ "]";
	}




}
