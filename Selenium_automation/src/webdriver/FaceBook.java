package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FaceBook {
	WebDriver driver;
	
 public void browser() {
	 System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
	 //FirefoxOptions options=new FirefoxOptions();
	 //options.addArguments("--disable-notifications");
	 //driver = new FirefoxDriver(options);
	 ChromeOptions c= new ChromeOptions();
	 c.addArguments("--disable-notifications");
	 driver=new ChromeDriver(c);
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
 }
	
 public void login() {
		
		driver.findElement(By.id("email")).sendKeys("snehareddy530@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("lokasany");
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
 }
		public static void main(String[] args) {
			FaceBook f = new FaceBook();
			f.browser();
			f.login();
			
	}

}




