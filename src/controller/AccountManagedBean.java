package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Account;
import model.AccountModel;
import net.bytebuddy.asm.Advice.This;

@ManagedBean(name = "AccountManagedBean")
@SessionScoped
public class AccountManagedBean {

	private String title;
	private String msg;
	private Account account;
	private AccountModel accountModel = new AccountModel();

	public String myaccount() {
		this.account= new Account();
        this.msg ="";
		return "myaccount?faces-redirect=true";
	}
	
	
	public String register() {
		this.account= new Account();
		return "register?faces-redirect=true";
	}
	
	
	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public AccountModel getAccountModel() {
		return accountModel;
	}


	public void setAccountModel(AccountModel accountModel) {
		this.accountModel = accountModel;
	}


	public String save() {
		this.accountModel.create(this.account);
		return "myaccount?faces-redirect=true";
	}
	
	
	public String login() {
		Account account2 = accountModel.find(this.account.getUsername(), this.account.getPassword());
		if (account2 == null) {
			this.msg = "Invalid Data";
			return "myaccount?faces-redirect=true";
		}else {
			return "welcome?faces-redirect=true";
		}
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
