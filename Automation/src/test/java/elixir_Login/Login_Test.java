package elixir_Login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_promotedby']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_promotedby']")).sendKeys("xyz");
	  
	  //choose file
	  //driver.findElement(By.xpath("//input[@id='Hospitalregistration_logo']")).click();
	  //Runtime.getRuntime().exec("")

	  Actions a = new Actions(driver);
	  a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	  //Staff
	  driver.findElement(By.xpath("//span[contains(text(),'Staff')]")).click();
	  driver.findElement(By.xpath("//a[@href='/index.php/core/staffregistration/create']")).click();
      //switch to other window	
			for (String handle : driver.getWindowHandles()) {
				 
			    driver.switchTo().window(handle);}
	  
	 // Select type = new Select(driver.findElement(By.xpath("//select[@id='Staffregistration_employeetypeid']")));
	  //type.selectByIndex(1);
	  driver.findElement(By.xpath("//input[@id='Staffregistration_employeecode']")).clear();
	  driver.findElement(By.xpath("//input[@id='Staffregistration_employeecode']")).sendKeys("123456");
	  driver.findElement(By.xpath("//input[@id='Staffregistration_firstname']")).sendKeys("sam");
	  a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	  driver.findElement(By.xpath("//input[@class='btn bg-teal']")).click(); 
  }
  @BeforeTest
  public void Ebrowser() {
	  System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php"); 
	  driver.manage().window().maximize();
  }

}
