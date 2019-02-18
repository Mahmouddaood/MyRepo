package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Category;
import entities.Product;
import model.ProductModel;

@ManagedBean(name = "ProductManagedBean")
@SessionScoped
public class ProductManagedBean {

	private List<Product> products;
	private List<Product> specialProducts;
	private Product product;
	private String catName;
	
	ProductModel productModel = new ProductModel();

	
	
	@PostConstruct
	public void init() {
		specialProducts = new ArrayList<>();
		products = new ArrayList<>();
		product = new Product();
	}
	
	public String category(Category category) {
		this.products = category.getProducts();
		this.catName = category.getCatname();
		return "category?faces-redirect=true";
	}
	
	public String category() {
	
		return "category?faces-redirect=true";
	}
	
    public String details(Product p) {
		
		this.product = p;
		this.products = productModel.findRelated(p);
		return "details?faces-redirect=true";
	}
	

	public String prices() {
		return "details?faces-redirect=true";
	}

	public String specilas() {
		this.specialProducts = productModel.findSpecialProducts(false);
		return "specials?faces-redirect=true";
	}
	
	
	
	
	
	
	
	
	///////////////////
	
	
	
	
	public List<Product> getSpecialProducts() {
		return specialProducts;
	}

	public void setSpecialProducts(List<Product> specialProducts) {
		this.specialProducts = specialProducts;
	}

	public ProductModel getProductModel() {
		return productModel;
	}

	public void setProductModel(ProductModel productModel) {
		this.productModel = productModel;
	}

	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}


}
