package elixir_Login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login_Test {
	WebDriver driver;
  @Test
  public void loginFun() {
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  driver.findElement(By.xpath("//html//ul[@class='navigation navigation-main navigation-accordion']/li[3]/a[1]")).click();
	  //driver.findElement()
  }
  @BeforeTest
  public void Ebrowser() {
	  System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php"); 
	  driver.manage().window().maximize();
  }

}
