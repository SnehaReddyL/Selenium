package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static WebDriver driver;

	@BeforeClass
	public static void browser() throws Exception {
		System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
		 /*FirefoxOptions options=new FirefoxOptions();
		 options.addArguments("--disable-notifications");
		 driver = new FirefoxDriver(options);*/
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void close() throws Exception {
		driver.quit();
	}

	@Test
	public void login() {
		driver.findElement(By.id("email")).sendKeys("snehareddy530@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("lokasany");
		driver.findElement(By.id("loginbutton")).click();
		
	}

}
