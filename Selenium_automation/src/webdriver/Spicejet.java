package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Spicejet {
	WebDriver driver;
	
	
	public void browser()	{
		//launch browser
		System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
		driver = new ChromeDriver();
		//pass the URL
		driver.get("http://www.spicejet.com");
		//maximize window
		driver.manage().window().maximize();
		
	}
	public void Moveover() {
		//mouseover action
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		driver.findElement(By.partialLinkText("Ho")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			}
	public void menu() {
		Actions s=new Actions(driver);
		//s.moveToElement(driver.findElement(By.id("burger-bread"))).build().perform();
		s.moveToElement(driver.findElement(By.xpath(".//*[@id='highlight-addons']/span[1]"))).build().perform();
		
	}
	
	public void KeyBoard() {
		//page to scroll down
		Actions s = new Actions(driver);
		s.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		try {
		Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		driver.findElement(By.linkText("January 2018")).click();
		//wait
		try {
			Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		//page to scroll down
		s.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		//wait
		try {
			Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		//page to scroll up
		//s.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		//driver.close();//close the browser
		
	}
	public static void main(String[] args)  {
		Spicejet s= new Spicejet();
		s.browser();
		//s.Moveover();
		//s.KeyBoard();
		s.menu();

	}

}
