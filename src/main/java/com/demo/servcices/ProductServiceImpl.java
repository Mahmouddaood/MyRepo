package com.demo.servcices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entities.Category;
import com.demo.entities.Product;
import com.demo.repositries.CategotyRepo;
import com.demo.repositries.ProductRepo;

@Service("ProductService")
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;

	@Override
	public List<Product> findLatest(int limit) {
		return productRepo.findLatest(limit);
	}

	@Override
	public List<Product> findFeatured(boolean featured, int limit) {
		return  productRepo.findFeatured(featured, limit);	}

	@Override
	public Product findOne(int id) {
		return productRepo.findOne(id);
	}

	@Override
	public List<Product> findRelated(int proId, int catId) {
		return  productRepo.findRelated(proId, catId) ;
		
	}

	@Override
	public List<Product> findFeatured(boolean featured) {
		
		return productRepo.findFeatured(featured);
	}
	
	
	
	

	
	
	
}
