package elixir_Settings;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Hsptl_Reg {
	WebDriver driver;
  @Test(priority=0)
  public void Login() {
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
  }
  
  @Test(priority=1)
  public void HsptlReg() {
	  driver.findElement(By.xpath("//html//ul[@class='navigation navigation-main navigation-accordion']/li[3]/a[1]")).click();
	  
  }
  @BeforeTest
  public void Ebrowser() {
	  System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php"); 
	  driver.manage().window().maximize();
  }
}


