package com.demo.servcices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entities.Account;
import com.demo.repositries.AccountRepo;

@Service("AccountService")
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepo accountRepo;

	@Override
	public void saveAccount(Account account) {
		this.accountRepo.save(account);
		
	}

	@Override
	public Account login(String username, int password) {
		return this.accountRepo.login(username, password);
	}

	
	
	


	
	
	
}
