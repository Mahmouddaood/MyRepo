package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Category;
import entities.Product;
import model.CategoryModel;
import model.ProductModel;

@ManagedBean(name="HomeManagedBean" )
@SessionScoped 
public class HomeManagedBean {

	private String title;
	private CategoryModel categoryModel = new CategoryModel();
	private ProductModel productModel = new ProductModel();
	
	public String index() {
		return "index?faces-redirect=true";
	}
	
	
	public List<Category> categories() {
		 
		return categoryModel.findAll();
	}
	
	
	public List<Product> findNewProducts() {
		
      return productModel.findNewProducts(2);
	}
	
	
	public List<Product> findFeaturedProducts() {
		return productModel.findFeatured(3);
	}
	
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
}
