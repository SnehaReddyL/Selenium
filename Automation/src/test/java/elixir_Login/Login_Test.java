package elixir_Login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Login_Test {
	WebDriver driver;
  @Test
  public void loginFun() {
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  //settings
	  driver.findElement(By.xpath("//html//ul[@class='navigation navigation-main navigation-accordion']/li[3]/a[1]")).click();
	  
	  driver.findElement(By.xpath("//a[@href='/index.php/core/hospitalregistration/create']")).click();
	  
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).sendKeys("1234");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospitalname']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospitalname']")).sendKeys("krishna Hospital");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_address']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_address']")).sendKeys("panjagutta");
	  //year drop down
	  Select year = new Select(driver.findElement(By.id("Hospitalregistration_yearofestablishment")));
	  year.selectByVisibleText("2018");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_state']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_state']")).sendKeys("Hyderabad");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_country']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_country']")).sendKeys("Australia");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_phone']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_phone']")).sendKeys("9247124200");
	  driver.findElement(By.xpath("//button[@class='btn bg-teal']")).click();
	  //Staff
	  /*driver.findElement(By.xpath("//html//ul[@class='navigation navigation-main navigation-accordion']/li[5]/a[1]")).click();
	  driver.findElement(By.xpath("//a[@href='/index.php/core/staffregistration/create']")).click();
	  Select Type= new Select(driver.findElement(By.id("Staffregistration_employeetypeid")));
	  Type.selectByVisibleText("ste");
	  driver.findElement(By.xpath("//input[@id='Staffregistration_employeecode']")).clear();
	  driver.findElement(By.xpath("Staffregistration_employeetypeid")).sendKeys("01Q201");*/
	  
	  
	  
  }
  @BeforeTest
  public void Ebrowser() {
	  System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php"); 
	  driver.manage().window().maximize();
  }

}
