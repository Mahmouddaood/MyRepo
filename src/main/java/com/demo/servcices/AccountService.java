package com.demo.servcices;

import com.demo.entities.Account;

public interface AccountService {

	void saveAccount(Account account);
   	
	Account login(String username , int password);
    
}
