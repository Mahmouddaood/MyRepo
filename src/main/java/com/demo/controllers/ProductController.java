package com.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.entities.Category;
import com.demo.servcices.CategoryService;
import com.demo.servcices.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/flowers", method = RequestMethod.GET)
	public String flowers() {

		return "product.flowers";
	}

	@RequestMapping(value = "/specails", method = RequestMethod.GET)
	public String specials(ModelMap modelMap) {
		modelMap.put("SpecialProducts", productService.findFeatured(false));
		return "product.specials";
	}

	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String details() {
		return "product.details";
	}

	@RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
	public String category(@PathVariable(value = "id") int id, ModelMap modelMap) {
		Category category = new Category();
		category = categoryService.findOne(id);
		modelMap.put("CategoryProducts", category.getProducts());
		modelMap.put("Category", category);
		return "product.flowers";
	}

	@RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
	public String details(@PathVariable(value = "id") int id, ModelMap modelMap) {
		modelMap.put("Product", productService.findOne(id));
		modelMap.put("RelatedProducts", productService.findRelated(productService.findOne(id).getId(),
				productService.findOne(id).getCategory().getId()));
		return "product.details";
	}

}
