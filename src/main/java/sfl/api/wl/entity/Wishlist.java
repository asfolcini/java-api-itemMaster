/**
 * 
 */
package sfl.api.wl.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author alberto.sfolcini
 *
 */

@Entity
@Table(name="wishlist")
public class Wishlist extends BaseEntity{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private String userId;
	private String source;
	private String title;
	private String description;
	private boolean isPublic = true;
	private int	statusId;



	@OneToMany(mappedBy = "id.wishlistId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<WishlistItem> items = new HashSet<WishlistItem>();
 
	
	// default constructor required by Hibernate
	public Wishlist() {}
	
	public Wishlist(String userId,String title,String description,boolean isPublic) {
		this.userId = userId;
		this.title = title;
		this.description = description;
		this.isPublic = isPublic;
		this.statusId = 10;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}


	public Set<WishlistItem> getItems() {
		return items;
	}

	public void setItems(Set<WishlistItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Wishlist [id=" + id + ", userId=" + userId + ", source=" + source + ", title=" + title
				+ ", description=" + description + ", isPublic=" + isPublic + ", statusId=" + statusId + ", items="
				+ items + "]";
	}



	
}
