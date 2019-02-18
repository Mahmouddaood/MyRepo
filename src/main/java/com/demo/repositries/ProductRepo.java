package com.demo.repositries;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Product;

@Repository("ProductRepo")
public interface ProductRepo extends CrudRepository<Product, Integer> {

	@Query(value="select * from Product order by id  limit :limit " , nativeQuery= true )
	List<Product> findLatest(@Param("limit")  int limit);
	
	@Query(value="select * from Product where featured =:featured order by id  limit :limit " , nativeQuery= true )
	List<Product> findFeatured(@Param("featured") boolean featured , @Param("limit") int limit );
	
	
	@Query(value="select * from Product where id =:id" , nativeQuery=true)
	Product findOne(@Param("id") int id);
	
	@Query(value="select p from Product p  where p.id !=:proId and p.category.id =:catId")
	List<Product> findRelated(@Param("proId")int proId , @Param("catId")int catId );
	
	
	@Query(value="select p from Product p  where p.featured = :featured ")
	List<Product> findFeatured(@Param("featured") boolean featured);
	
}
