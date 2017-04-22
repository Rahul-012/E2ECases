package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.DigitalBookWizard;

public class DigitalBookWizardTestNG {
	DigitalBookWizard digitalbook=new DigitalBookWizard();
  
	@Test(priority=1)
  public void listOfWizards() throws InterruptedException 
  {
		digitalbook.listofWizards();
  }
	@Test(priority=2)
	public void digitalBookWizrdOpen()
	{
		digitalbook.digitalBookWizard();
	}
	
	@Test(priority=3)
	public void uploadBaseImage() throws IOException, InterruptedException
	{
		digitalbook.baseImage();
	}
	
	@Test(priority=4)
	public void uploadBannerImage() throws IOException,InterruptedException
	{
		digitalbook.bannerImage();
	}
	
}
