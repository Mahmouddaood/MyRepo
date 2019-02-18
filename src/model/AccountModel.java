package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Account;


public class AccountModel extends AbstractModel<Account> {

	
	
	
	public AccountModel() {
		super(Account.class);
		// TODO Auto-generated constructor stub
	}

	public Account find(String username , int password) {
		Account account = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			account =  (Account) session.createQuery("select a from Account a where a.username=:username and a.password=:password").
					setString("username", username).
					setInteger("password", password);
			
			transaction.commit();
		} catch (Exception e) {
			account = null;
			if(transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return account;
	}
	
}
