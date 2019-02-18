package com.demo.servcices;

import java.util.List;


import com.demo.entities.Product;

public interface ProductService {

	List<Product> findLatest(int limit);
	
	List<Product> findFeatured(boolean featured ,int limit);
    
	Product  findOne(int id);
	
	List<Product> findRelated(int proId ,int catId );
	
	
	List<Product> findFeatured(boolean featured);
	
}
