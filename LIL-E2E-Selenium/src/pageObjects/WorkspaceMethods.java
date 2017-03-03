package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import initial.TestBase;
import workspaceInterface.WizardInterface;

public class WorkspaceMethods extends TestBase implements WizardInterface{

	@Override
	public void listOfWizard() {
		// TODO Auto-generated method stub
		try
		{
			 Actions action=new Actions(driver);
			 WebElement listofwizard  =  driver.findElement(By.className("fa-plus"));
			 action.moveToElement(listofwizard).build().perform();
			 logger.info("List of Wizard will Appear");
			 
		}
		catch(Exception e)
		{
			logger.error("Wizards not Appear");
		}
		
	}

	@Override
	public void clickUponWizard(String xpath) {
		// TODO Auto-generated method stub
		String DigitalBook="/html/body/div[1]/div/ul/li/ul/li[1]/a/i";
		String quiz="/html/body/div[1]/div/ul/li/ul/li[3]/a/i";
		String conceptMap="/html/body/div[1]/div/ul/li/ul/li[5]/a/i";
		String popUp="/html/body/div[1]/div/ul/li/ul/li[2]/a/i";
		String InterImage="/html/body/div[1]/div/ul/li/ul/li[4]/a/i";
		String videoCrse="/html/body/div[1]/div/ul/li/ul/li[8]/a/i";
		
		try
		{
			
			if(xpath==DigitalBook)
			{
				  driver.findElement(By.className("ic-digital-book")).click();
				   WebElement digitalBookupwizard=driver.findElement(By.className("modal-content"));
				   Assert.assertEquals(digitalBookupwizard.isDisplayed(), true);
				   logger.info("Digital Book Wizard Open!!!!!!");
				  
			}
			else if(xpath==quiz)
			{
				  driver.findElement(By.className("ic-quiz")).click();
				   WebElement quizwizard=driver.findElement(By.className("modal-content"));
				   Assert.assertEquals(quizwizard.isDisplayed(), true);
				   logger.info("Quiz Wizard will open!!!!!!");
			}
			
			else if(xpath==conceptMap)
			{
				  driver.findElement(By.className("ic-concept-map")).click();
				   WebElement ConMapwizard=driver.findElement(By.className("modal-content"));
				   Assert.assertEquals(ConMapwizard.isDisplayed(), true);
				   logger.info("Concept Map  Wizard wil Open!!!!!!");
			}
			
			else if(xpath==popUp)
			{
				  driver.findElement(By.className("ic-pop-up")).click();
				   WebElement popUpWizard=driver.findElement(By.className("modal-content"));
				   Assert.assertEquals(popUpWizard.isDisplayed(),true);
				   logger.info("Pop Up  Wizard Open!!!!!!");
			}
			else if(xpath==InterImage)
			{
				  driver.findElement(By.className("ic-interactive-image")).click();
				   WebElement InteractIMage=driver.findElement(By.className("modal-content"));
				   Assert.assertEquals(InteractIMage.isDisplayed(),true);
				   logger.info("Interactive wizard will Wizard Open!!!!!!");
			}
			
			else if(xpath==videoCrse)
			{
				
				   driver.findElement(By.className("ic-video-course")).click();
				   WebElement blogWizrd=driver.findElement(By.className("modal-content"));
				   Assert.assertEquals(blogWizrd.isDisplayed(),true);
				   logger.info("Video Course  Wizard Open!!!!!!");
			}
			else
			{
				logger.error("Unable to Click Upon Wizard");
			}
		}
		catch(Exception e)
		{
			logger.error("Wizards not found ");
		}
		
	}

	@Override
	public void title() {
		
		
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void audienceTargetFrom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void duration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void audienceTargetTo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void googleSearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bannerImage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void baseImage() {
		// TODO Auto-generated method stub
		
	}

	
}
