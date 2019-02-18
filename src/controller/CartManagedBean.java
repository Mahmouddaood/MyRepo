package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Item;
import entities.Product;

@ManagedBean(name = "CartManagedBean")
@SessionScoped
public class CartManagedBean {

	private List<Item> cart = new ArrayList<Item>();

	public String cart() {
		return "cart?faces-redirect=true";
	}

	
	public String buyProduct(Product pro) {
		int index = isExsisting(pro.getId(), cart);
		if (index != -1) {
			int quantity = this.cart.get(index).getQuantity() + 1;
			this.cart.get(index).setQuantity(quantity);
		}else {
			this.cart.add(new Item(pro, 1));
		}
		
		return "cart?faces-redirect=true";
	}
	
	
	public Double total() {
		double s = 0;
		for(Item item: this.cart) {
			s += item.getProduct().getPrice() * item.getQuantity();
		}
		return s;
	}
	
	
	
	public String removeProduct(int index) {
		this.cart.remove(index);
		return "cart?faces-redirect=true";
	}
	
	
	
	public List<Item> getCart() {
		return cart;
	}


	public void setCart(List<Item> cart) {
		this.cart = cart;
	}


	private int isExsisting(int id , List<Item> cart) {
		for(int i=0; i < cart.size(); i++ ) {
			if(cart.get(i).getProduct().getId() == id)
				return i;
			
		}
		return -1;
		
		
	}
	
	
	
}
