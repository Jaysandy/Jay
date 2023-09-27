package com.Managerclass;

import org.openqa.selenium.WebDriver;

import com.PageObjectFactory.CreateaccountRepositary;
import com.PageObjectFactory.LoginRepositary;

public class Managerfacebook {
public static WebDriver driver;
private LoginRepositary log;
private CreateaccountRepositary acc;


public Managerfacebook(WebDriver driver2) {
	this.driver=driver2;
}

public LoginRepositary   Login() {
	if(log==null) {
		log = new LoginRepositary(driver);
	}
return log	;
}

public CreateaccountRepositary Createacc() {
	if(acc==null) {
	acc = new CreateaccountRepositary(driver);
	}
return acc;	
}



}
