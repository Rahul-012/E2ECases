package initial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.config;

public class TestBase {
	public static WebDriver driver=null;
	public static String url=null;
	public static String browser=null;
	public static Logger logger=null;
	
	
	public static void launchBrowser()
	{
		browser = config.browser;
		url = config.url;
		System.out.println(url);
		System.out.println(browser);
		switch (browser) {
		case "Firefox":
			driver=new FirefoxDriver();
			System.out.println("Firefox Browser launched Successfully!!!!!");
			break;

		case "IE":
			System.out.println("Not Avaliable");
			break;
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "F:\\driver\\chromedriver.exe");
			logger=Logger.getLogger("SampleEntry");
			PropertyConfigurator.configure("log4j.properties");
			
			driver=new ChromeDriver();
			System.out.println("Chrome Launched Successfully!!!!!");
			logger.info("Chrome Launched Successfully");
			break;
			
		default:
			System.out.println("Default");
			break;
		}
		//<------------Launch application------------>
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}
	
}
	
