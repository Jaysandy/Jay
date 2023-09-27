package Project_maven.Facebook1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
public static WebDriver driver;
public static Select s ;
 public static Actions a;
public static Robot r ;
public	static JavascriptExecutor js;
	
public static WebDriver Launchbrowser(String drivername) {
	if(drivername.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\jay\\Facebook1\\Project_Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	return driver;
}
	public static void getURL(String url) {
		driver.get(url);
		
	}
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
	public static void navigate_back() {
		driver.navigate().back();
	}
	public static void navigate_forward() {
		driver.navigate().forward();
	}
	public static void navigate_refresh() {
		driver.navigate().refresh();
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void select(WebElement ss) {
		Select s =new Select(ss);
		s.deselectAll();
	}
	public static void select_index() {
		s.selectByIndex(0);
	}
	
	public static void select_value() {
		s.selectByValue(null);
	}
	public  static void select_text() {
		s.selectByVisibleText(null);
	}
	public static void Alert_accept() {
		driver.switchTo().alert().accept();
	}
	public static void Alert_dismiss() {
		driver.switchTo().alert().dismiss();
	}
	public static void Alert_Sendkeys() {
		driver.switchTo().alert().sendKeys("");
	}
	public static void Action_click (WebElement aa) {
		Actions a = new Actions(driver);
		a.click(aa).build().perform();
	}
	public void Action_rightclick (WebElement aa) {
		a.contextClick(aa).build().perform();
		
	}
public static void Action_doubleclick(WebElement aa) {
	a.doubleClick(aa).build().perform();
}
	public static void Action_MovetoElement (WebElement aa) {
		a.moveToElement(aa).build().perform();
	}
	public static void drag_drop() {
		a.dragAndDrop(null, null).build().perform();
	}
	public static void Frame (WebElement f) {
		driver.switchTo().frame(f);
	}
	public static void Frame_default() {
		driver.switchTo().defaultContent();
	}
	public  static void Robot_kp() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	public  static void Robot_kr () {
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void Windows_handle () {
		driver.getWindowHandles();
	}
	public static void implict_wait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void Explicit_wait (WebElement time) {
		WebDriverWait w = new WebDriverWait(driver, 0);
		w.until(ExpectedConditions.visibilityOf(time));
	}
	public static void Thread_sleep() throws InterruptedException {
		Thread.sleep(0);
	}
	public static void Get_title ( ) {
		driver.getTitle();
	}
	public static void Get_currentUrl() {
		driver.getCurrentUrl();
	}
	public static void scroll_up(WebElement sc) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",sc);
	}

	public static void scroll_down() {
		
		js.executeScript("window.scrollby(0,-2000)", "");
	}
	public static void Screenshots (String name) throws IOException {
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\hp\\eclipse-workspace\\jay\\Facebook1\\Screenshott\\"+name +".png");
		FileUtils.copyDirectory(src, dst);
	}
	public static void sendkeys(WebElement element, String value) {
		Actions a = new Actions(driver);
		a.sendKeys(element, value).build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
