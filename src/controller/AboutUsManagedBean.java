package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "AboutUsManagedBean")
@SessionScoped
public class AboutUsManagedBean {

	private String title;

	public String index() {
		return "aboutus?faces-redirect=true";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
