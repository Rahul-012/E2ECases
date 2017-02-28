package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import initial.TestBase;

public class No_ofProject extends TestBase {
	
	
	public static void openProjectTab() throws Exception
	{
		driver.findElement(By.linkText("Workspace")).click();
		Thread.sleep(3000);
	}
	public static void openProject() throws InterruptedException
	{
	driver.findElement(By.className("lil-card-fluid-container")).click();
	Thread.sleep(3000);
     
     }
}
