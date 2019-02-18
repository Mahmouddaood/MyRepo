package com.demo.servcices;

import com.demo.entities.Category;

public interface CategoryService {

	Iterable<Category> findAll();
	
	Category  findOne(int id);
	
    
}
