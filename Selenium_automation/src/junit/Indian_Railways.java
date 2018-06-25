package junit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Indian_Railways {
	WebDriver driver;

	/*@BeforeClass
	public void browser() throws Exception {
		System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.indianrailways.gov.in");
		driver.manage().window().maximize();
		}

	@AfterClass
	public void close() throws Exception {
		driver.quit();
	}*/

	@Test
	public void mousehover() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.indianrailways.gov.in");
		driver.manage().window().maximize();
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li[@size='8']//a[@href='#']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='http://www.indianrailways.gov.in/railwayboard/']")).click();
		//switch to other window
		for (String handle : driver.getWindowHandles()) {
			 
		    driver.switchTo().window(handle);}
		driver.findElement(By.xpath("//a[@href='http://www.indianrail.gov.in']")).click();
		//switch to other window
		for (String handle : driver.getWindowHandles()) {
			 
		    driver.switchTo().window(handle);}
		//Services
		driver.findElement(By.xpath("//a[@data-toggle='collapse'][contains(text(),'Services')]")).click();
		//Availability at Major Stations
		driver.findElement(By.xpath("//a[@data-toggle='collapse'][contains(text(),'Availability at Major Stations')]")).click();
		//seat availability
		driver.findElement(By.xpath("//a[@href='../SEAT/SeatAvailability.html?locale=en']")).click();
		
		
		//driver.quit();
		
	}

}
