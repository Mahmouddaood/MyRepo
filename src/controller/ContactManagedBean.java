package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "ContactManagedBean")
@SessionScoped
public class ContactManagedBean {

	private String title;

	public String index() {
		return "contact?faces-redirect=true";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
