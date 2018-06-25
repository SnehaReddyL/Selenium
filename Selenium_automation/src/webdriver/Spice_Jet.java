package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Spice_Jet {
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
	public void options() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXTaction\"]")).click();
		driver.findElement(By.xpath("//html//div[@class='left1']//div[@id='dropdownGroup2']//ul[1]/li[1]/a[1]")).click();
		//To
		driver.findElement(By.xpath("//html//div[@class='right1']//ul[1]/li[3]/a[1]")).click();
		//date
		driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'15')]")).click();
		//click on adult
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class='paxinfo'][contains(text),'1 Adult'")).click();
	//new Select(driver.findElement(By.xpath("//*[@class='row1 adult-infant-child']"))).selectByVisibleText("1 Adult");
        driver.findElement(By.xpath(".//div[@id='divpaxinfo']")).click();
		//	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[6]/div[2]")).click();
		//driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		/*driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();*/
		//driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Spice_Jet j=new Spice_Jet();
		j.browser();
		j.options();
		

	}

}
