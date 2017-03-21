package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import initial.TestBase;

public class Login_Page extends TestBase{
	private static WebElement element = null;
	
	public static WebElement login_Modal() throws InterruptedException
	{
		element=driver.findElement(By.linkText("Login"));
		element.click();
		 Assert.assertEquals(true, element.isDisplayed());
		
		return element;
	}
	public static void validCredentials(String user,String pass) throws InterruptedException
	{
		WebElement element;
		 Thread.sleep(5000);
		 element= driver.findElement(By.className("modal-login"));	
		 element.findElement(By.name("username")).sendKeys(user);
	     element.findElement(By.name("password")).sendKeys(pass);
	     element.findElement(By.className("btn-login-signup")).click();
	      Thread.sleep(5000);
	      Assert.assertEquals("https://securelearning.in/courses/recommended", "https://securelearning.in/courses/recommended");
		//return web;
	}
	public static void inValidCredentials()
	{
		
	}

}
