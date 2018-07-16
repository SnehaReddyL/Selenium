package webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbhiBus {
	WebDriver driver;
	
	public void Browser() {
		System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
		 ChromeOptions c= new ChromeOptions();
		 c.addArguments("--disable-notifications");
		driver=new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
	}
	public void Login() throws IOException {
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Goa");
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		//File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("G:\\EduBridge\\screenshot\\fileload.png"));
		driver.findElement(By.xpath("//html//div[@class='ui-datepicker-group ui-datepicker-group-first']//tr[4]/td[4]/a[1]")).click();
		
	}
	
	public static void main(String[] args) {
		AbhiBus ab=new AbhiBus();
		ab.Browser();
	}

	}


