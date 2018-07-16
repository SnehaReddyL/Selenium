package elixir_Login;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jdemo {

	public static void main(String[] args) {
		Logger logger=Logger.getLogger("Log4jdemo");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("browser starting");
		System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		logger.info("URl inserting");
		driver.get("http://www.google.com");
		logger.info("browser maximizing");
		driver.manage().window().maximize();

	}

}
