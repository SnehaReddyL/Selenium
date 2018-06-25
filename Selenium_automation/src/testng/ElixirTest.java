package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ElixirTest {
	static WebDriver driver;

  @Test
  public void f() {
	
			driver.findElement(By.xpath("//*[@id=\"UserLogin_username\"]")).sendKeys("admin");
			driver.findElement(By.xpath("//*[@id=\"UserLogin_password\"]")).sendKeys("admin");
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/form/div[4]/input")).click();	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.elixiraid.com/index.php");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest()throws Exception {
			driver.quit();
  }

}
