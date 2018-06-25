package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Indian_Airlines {
	WebDriver driver;
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.airindia.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='bookFlight']//a")).click();
	//from
		driver.findElement(By.xpath("//input[@id='from']")).sendKeys("Hyderabad, Rajiv Gandhi International Airport, HYD, India");
		//driver.findElement(By.linkText("Hyderabad, Rajiv Gandhi International Airport, HYD, India")).click();
	//to
		driver.findElement(By.xpath("//input[@id='to']")).sendKeys("Goa, Dabolim Airport, GOI, India");
		//driver.findElement(By.xpath("//input[@id='_retdateeu1']")).click();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='aMnu1']"))).build().perform();
		driver.findElement(By.xpath("//a[@class='firstMenuLiA menuExt'][contains(text(),'Book a Flight')]")).click();
		//switch to window
		for (String win : driver.getWindowHandles()) {
		    driver.switchTo().window(win);}
		
		driver.findElement(By.xpath("//a[@id='TabProfile']")).click();
		driver.findElement(By.linkText("here")).click();
		//switch to window
		for (String win1 : driver.getWindowHandles()) {
		    driver.switchTo().window(win1);}
		driver.findElement(By.xpath("//a[@id='login_form:register_btn']")).click();
		Select d= new Select(driver.findElement(By.xpath("//label[@id='register_form:profile:title_label']")));
		d.selectByValue("MISS");
		//driver.findElement(By.xpath("//input[@id='register_form:profile:firstName']")).sendKeys("sam");
		
	
		
		
	}
	
	
	public static void main(String[] args) {
		Indian_Airlines ia=new Indian_Airlines();
		ia.browser();
		
	}

}
