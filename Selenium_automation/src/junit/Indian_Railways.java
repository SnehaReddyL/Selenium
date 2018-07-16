package junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Indian_Railways {
	static WebDriver dr;

	@BeforeClass
	public static void Login() throws Exception {
		System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("http://www.indianrailways.gov.in");
		dr.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dr.quit();
	}

	@Test
	public void mousehover() throws InterruptedException {
		Actions a= new Actions(dr);
		a.moveToElement(dr.findElement(By.xpath("//li[@size='8']//a[@href='#']"))).build().perform();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//a[@href='http://www.indianrailways.gov.in/railwayboard/']")).click();
		//switch to other window
		for (String handle : dr.getWindowHandles()) {
			 
		    dr.switchTo().window(handle);}
		dr.findElement(By.xpath("//a[@href='http://www.indianrail.gov.in']")).click();
		//switch to other window
		for (String handle : dr.getWindowHandles()) {
			 
		    dr.switchTo().window(handle);}
		//Services
		dr.findElement(By.xpath("//a[@data-toggle='collapse'][contains(text(),'Services')]")).click();
		//Availability at Major Stations
		dr.findElement(By.xpath("//a[@data-toggle='collapse'][contains(text(),'Availability at Major Stations')]")).click();
		//seat availability
		dr.findElement(By.xpath("//a[@href='../SEAT/SeatAvailability.html?locale=en']")).click();
		//driver.quit();
	}

}
