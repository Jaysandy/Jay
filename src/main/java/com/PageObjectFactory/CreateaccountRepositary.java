package com.PageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Project_maven.Facebook1.Baseclass;

public class CreateaccountRepositary {
	public static WebDriver driver;	

public CreateaccountRepositary(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(Baseclass.driver, this);	
}
@FindBy(name = "firstname")	
	private WebElement firstname; 

@FindBy(name = "lastname")
	private WebElement lastname;

@FindBy	(name="reg_email__")
	private WebElement phonenum;

@FindBy(id="password_step_input")	
private  WebElement password;
	
	
}
