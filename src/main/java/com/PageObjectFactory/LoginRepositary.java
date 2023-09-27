package com.PageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Project_maven.Facebook1.Baseclass;

public class LoginRepositary {
	
public static WebDriver driver;	
	

	public LoginRepositary(WebDriver driver2) {
		this.driver=driver2;
	PageFactory.initElements(Baseclass.driver, this);	
		
	}

	public  void setEmailorPhone(WebElement emailorPhone) {
		this.EmailorPhone = emailorPhone;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}

	public void setCreateaccount(WebElement createaccount) {
		this.createaccount = createaccount;
	}

	@FindBy(id= "email")
private WebElement EmailorPhone;	

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailorPhone() {
		return EmailorPhone;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getCreateaccount() {
		return createaccount;
	}

	@FindBy(id= "pass")
private WebElement password;	
	
	@FindBy(name= "login")
	private WebElement loginbutton;
	
	@FindBy(xpath= "open-registration-form-button")
private WebElement createaccount;
	
	
	
	
}
