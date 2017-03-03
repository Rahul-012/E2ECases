package testcase;

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
	
}
