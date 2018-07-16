package webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenshotFaceBook {
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
	
 public void login() throws IOException {
		
		driver.findElement(By.id("email")).sendKeys("snehareddy530@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("lokasany");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("G:\\EduBridge\\screenshot\\fileload.png"));
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
 }
		public static void main(String[] args) throws IOException {
			ScreenshotFaceBook f = new ScreenshotFaceBook();
			f.browser();
			f.login();
			
	}

}




