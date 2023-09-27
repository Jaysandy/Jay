package Project_maven.Facebook1;

import org.openqa.selenium.WebDriver;

import com.Managerclass.Managerfacebook;

public class Facebooktest extends Baseclass {
	public static WebDriver driver;
 public static	Managerfacebook face=new Managerfacebook(driver);
	
	public static void main(String[] args) {
		
		Launchbrowser("chrome");
		
		getURL("https://www.facebook.com/") ;
		sendkeys(face.Login().getEmailorPhone(), "jay1312@gmail.com");

	}

}
