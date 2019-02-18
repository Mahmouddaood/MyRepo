package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@Table(name="product")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String describation;

	private String photo;

	private double price;

	private String prodname;
	
	@Column(name="featured")
	private boolean featured;

	
	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="categoryid")
	private Category category;

	

	
	

	public Product() {
	}

	public int getId() {
		return this.id;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public String getDescribation() {
		return this.describation;
	}

	public void setDescribation(String describation) {
		this.describation = describation;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProdname() {
		return this.prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public boolean isFeatured() {
		return featured;
	}

	public void setFeatured(boolean featured) {
		this.featured = featured;
	}

}