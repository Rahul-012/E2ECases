package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import initial.TestBase;
import workspaceInterface.WizardInterface;

public class DigitalBookWizard extends TestBase {

	WorkspaceMethods methods=new WorkspaceMethods();
	
	public void listofWizards() throws InterruptedException
	{
		methods.listOfWizard();
		Thread.sleep(3000);
	}
	public void digitalBookWizard()
	{
		methods.clickUponWizard("/html/body/div[1]/div/ul/li/ul/li[1]/a/i");
	}
	
	public void baseImage() throws IOException, InterruptedException
	{
		methods.baseImage();
	}
	public void bannerImage() throws IOException, InterruptedException
	{
		
		Thread.sleep(3000);
		methods.bannerImage();
	}
	

	

}
