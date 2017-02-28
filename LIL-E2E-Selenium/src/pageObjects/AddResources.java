package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
	    driver.findElement(By.className("fa-search")).click();
	    Thread.sleep(3000);
	 
		

	}
	
             
}
