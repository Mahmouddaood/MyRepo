package com.demo.repositries;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Category;

@Repository("CategoryRepo")
public interface CategotyRepo extends CrudRepository<Category, Integer> {

	@Query(value="select * from Category where id =:id" , nativeQuery=true)
	Category findOne(@Param("id") int id);
	
}
 