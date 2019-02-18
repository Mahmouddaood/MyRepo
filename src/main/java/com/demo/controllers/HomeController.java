package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.demo.servcices.CategoryService;
import com.demo.servcices.ProductService;

@Controller
@RequestMapping("home")
public class HomeController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value="/" , method  = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("Categories", categoryService.findAll());
		modelMap.put("NewProducts", productService.findLatest(3));
		modelMap.put("FeaturedProducts", productService.findFeatured(true, 3));
		return "home.index";
	}
	
	
	@RequestMapping(value="/aboutus" , method  = RequestMethod.GET)
	public String aboutus() {
		return "home.aboutus";
	}
	
	
	/*@RequestMapping(value="/checkout" , method  = RequestMethod.GET)
	public String checkout( ModelMap modelMap) {
		
		return "home.checkout";
	}*/
	
	
	
	
}
