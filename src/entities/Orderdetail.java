package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the orderdetail database table.
 * 
 */
@Entity
@NamedQuery(name="Orderdetail.findAll", query="SELECT o FROM Orderdetail o")
public class Orderdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;


	private double price;


	private int quantity;
	
	
	@OneToOne
	@JoinColumn(name="productid")
	private Product product;
	
	
	@ManyToOne
	@JoinColumn(name="orderid")
	private Order order;

	public Orderdetail() {
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public Order getOrder() {
		return order;
	}



	public void setOrder(Order order) {
		this.order = order;
	}



	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

}