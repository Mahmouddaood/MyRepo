package com.demo.servcices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entities.Category;
import com.demo.repositries.CategotyRepo;

@Service("CategoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategotyRepo categoryRepo;
	
	
	@Override
	public Iterable<Category> findAll() {
		return categoryRepo.findAll();
	}


	@Override
	public Category findOne(int id) {
		return  categoryRepo.findOne(id);
	}

	
	
	
}
