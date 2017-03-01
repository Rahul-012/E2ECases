package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import initial.TestBase;
import workspaceInterface.Workspace;

public class AddResources extends TestBase implements Workspace {
	
	
	public void openProject()
	{
		
	}
	
	@Override
	public void googleSearch() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.className("fa-google")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.className("search-auto-suggest")).click();
		driver.findElement(By.cssSelector("body > div.ng-scope > section.workspace-view.ng-scope > div.row-fluid.ng-scope > div.w-resource-search-section.intro-resource-search.ng-scope > div > div > div.tab-pane.ng-scope.active > div > div > div.tab-pane.ng-scope.active > div > div > div > div > form > div > input")).sendKeys("Maths");
        driver.findElement(By.cssSelector("body > div.ng-scope > section.workspace-view.ng-scope > div.row-fluid.ng-scope > div.w-resource-search-section.intro-resource-search.ng-scope > div > div > div.tab-pane.ng-scope.active > div > div > div.tab-pane.ng-scope.active > div > div > div > div > form > div > span > i")).click();
		//    driver.findElement(By.className("fa-search")).click();
	    Thread.sleep(3000);
	    boolean expectGoogleSearch=true;
	    boolean actualGoogleSearch  =   driver.findElement(By.className("search-resource-container")).isDisplayed(); 
	    Assert.assertEquals(actualGoogleSearch, expectGoogleSearch);
	    Thread.sleep(3000);
		

	}

	@Override
	public void dragNDropGoogleSrch() throws InterruptedException {
		// TODO Auto-generated method stub
	//	List<WebElement> searchContainer=driver.findElements(By.className("search-resource-container"));
	//	WebElement drag=searchContainer.
	//	WebElement container=driver.findElement(By.className("search-resource-container"));
		WebElement drag=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div[1]/div[1]/img"));
		WebElement drop=driver.findElement(By.className("resource-drop-card"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag,drop).build().perform();
		Thread.sleep(4000);
		 
		
	}

	@Override
	public void addImages() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addURL() {
		// TODO Auto-generated method stub
		
	}
	
             
}
