package initial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import common.config;

public class TestBase {
	public static WebDriver driver=null;
	public static String browser=null;
	public static String url=null;
	
	public static void launchBrowser()
	{
		String url=config.url;
		System.out.println(url);
		String browser=config.browser;
		System.out.println(browser);
		
		switch (browser)
		{
			case "Firefox" :
				System.setProperty("webdriver.gecko.driver","D://geckodriver-v0.17.0-win64//geckodriver.exe");
	        	driver = new FirefoxDriver();
		    	 driver.manage().deleteAllCookies();
				
				//driver.get(url);
				System.out.println("Browser launched Successfully");
				break;
			case "chrome":
				System.out.println("launching chrome browser");
				System.setProperty("webdriver.chrome.driver","D://chromedriver_win32//chromedriver.exe");
				//System.setProperty("user.dir")+"//src//TestData//TestData.xlsx";
			//	/PriyaSoftSolutions/driverchrome/chromedriver.exe
				//System.setProperty("webdriver.chrome.driver",("user.dir")+"PriyaSoftSolutions//driverchrome//chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(url);
				break;
				
			case "explorer":
				System.setProperty("webdriver.ie.driver","D://IEDriverServer_x64_3.4.0//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
				break;
			default:
				System.out.println("Browser not lauch");
			
			
		}
		driver.get(url);
		driver.manage().window().maximize();
	}

}
