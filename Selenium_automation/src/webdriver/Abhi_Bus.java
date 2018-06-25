package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhi_Bus {
	WebDriver driver;
	
	public void Browser() {
		System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
	}
	public void Login() {
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Goa");
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("//html//div[@class='ui-datepicker-group ui-datepicker-group-first']//tr[4]/td[4]/a[1]")).click();
		
		
	}
		
	
	public static void main(String[] args) {
		Abhi_Bus ab=new Abhi_Bus();
		ab.Browser();
	}

	}


