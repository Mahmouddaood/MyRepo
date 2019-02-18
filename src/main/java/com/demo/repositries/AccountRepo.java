package com.demo.repositries;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Account;

@Repository("AccountRepo")
public interface AccountRepo extends CrudRepository<Account, Integer> {

	@Query(value="select a from Account a where a.username =:username and a.password =:password")
	Account login(@Param("username")String username ,@Param("password") int password);
	
}
 