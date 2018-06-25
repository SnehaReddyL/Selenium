package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertsHandling_sbi {
	WebDriver driver;
	
	public void browser()	{
		//launch browser
		System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
		driver = new ChromeDriver();
		//pass the URL
		driver.get("http://www.onlinesbi.com");
		//maximize window
		driver.manage().window().maximize();
	}
	public void alert() throws Exception {
		driver.findElement(By.xpath(".//span[@class='classicTxt']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='banner']/div[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='login_fields']/div[1]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("New User ? Register here")).click();
		// to print the alert message
		String str=driver.switchTo().alert().getText();// alert message stored in str variable
		System.out.println(str);
		/* to click on ok button*/
		driver.switchTo().alert().accept();
		// to cancel the alert message
		//driver.switchTo().alert().dismiss();
		driver.quit();
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AlertsHandling_sbi s=new AlertsHandling_sbi();
		s.browser();
		s.alert();

	}

}
