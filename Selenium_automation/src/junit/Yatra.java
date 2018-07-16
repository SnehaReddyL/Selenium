package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yatra {
	 static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).sendKeys("Hyderabad, India (HYD)");
		driver.findElement(By.xpath("//li[@class='w225']//div//input[@id='BE_flight_arrival_city']")).sendKeys("Goa, India (GOI)");
		//Select b = new Select(driver.findElement(By.xpath("//span[@class='txt-ellipses flight_passengerBox']")));
		 // b.selectByVisibleText("");
		
	}

}
