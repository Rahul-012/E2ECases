package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import initial.TestBase;

public class No_ofProject extends TestBase {
	private static WebElement element = null;
	
	public static void openProjectTab() throws Exception
	{
		driver.findElement(By.linkText("Workspace")).click();
		Thread.sleep(3000);
	}
	public static void projectVisible()
	{
		WebElement project;
		project=driver.findElement(By.className("project-container"));
		Assert.assertEquals(true, project.isDisplayed());
	}
       
}
