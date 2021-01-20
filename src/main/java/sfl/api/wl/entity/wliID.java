package sfl.api.wl.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * WishlistItem compositive ID
 * @author alberto.sfolcini
 *
 */
@Embeddable
public class wliID implements Serializable{
    
	public String itemId;
    public int wishlistId;
    
    public wliID() {};
    
    public wliID(String itemId, int wishlistId) {
    	this.itemId = itemId;
    	this.wishlistId = wishlistId;
    };
    
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	public int getWishlistId() {
		return wishlistId;
	}
	public void setWishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
	}

    
    
}