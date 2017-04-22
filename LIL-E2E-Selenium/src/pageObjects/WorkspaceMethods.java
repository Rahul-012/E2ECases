package pageObjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

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
	public void bannerImage() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.cssSelector("body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.lil-wizard.p-t-0.ng-scope > div > div > div.col-md-12.wizard-banner.padding-zero > div.bannerImage.add-image > label > i ")).click();
	    Thread.sleep(3000);
     	Boolean imagewizardappear=driver.findElement(By.className("modal-content")).isDisplayed();
	    Boolean expected=true;
        Assert.assertEquals(imagewizardappear, expected);
        
        //**************Upload Different files Format***************************
        //upload docfile
	     String expect="Selected resource type is not valid, only images are allowed.";

	     driver.findElement(By.className("fa-upload")).click();
	     Thread.sleep(5000);
	    
	
	     Runtime.getRuntime().exec("F:\\AutoIT\\docFIileUload.exe");
	     Thread.sleep(2000);
	     String actual =driver.findElement(By.className("error")).getText();
	     Assert.assertEquals(actual, expect);
	     Thread.sleep(8000);
	     logger.info("<<<<<<<<<<<-----------Unable to Upload WordFile--->>>>>>>>>>>>>>>>>");
	     Thread.sleep(5000);
	     
	     //TextFile upload
	     
	     driver.findElement(By.className("fa-upload")).click();
	     Thread.sleep(5000);
	     
	     
	  
	     String textfileExpect="Selected resource type is not valid, only images are allowed.";
	     Runtime.getRuntime().exec("F:\\AutoIT\\textFileupload.exe");
	     Thread.sleep(2000);
	    
	     String textFileActual=driver.findElement(By.className("error")).getText();
	      Assert.assertEquals(textFileActual,textfileExpect);
	      Thread.sleep(7000);
	     logger.info("<<<<<<<<<<<-----------Unable to Upload TextFile--->>>>>>>>>>>>>>>>>");
	     Thread.sleep(5000);
	     
	     //upload PFD File 
	    
	     driver.findElement(By.className("fa-upload")).click();
	     Thread.sleep(5000);
	     
	     String pdffileExpect="Selected resource type is not valid, only images are allowed.";
	     Runtime.getRuntime().exec("F:\\AutoIT\\pdfFileUpload.exe");
	     Thread.sleep(2000);
	    
	     String pdfFileActual=driver.findElement(By.className("error")).getText();
	     Assert.assertEquals(pdfFileActual,pdffileExpect);
	     Thread.sleep(7000);
	     logger.info("<<<<<<<<<<<-----------Unable to Upload PDFFile--->>>>>>>>>>>>>>>>>");
	     Thread.sleep(5000);
	     
	     //mp3 File
	     driver.findElement(By.className("fa-upload")).click();
	     String mp3fileExpect="Selected resource type is not valid, only images are allowed.";
	     Runtime.getRuntime().exec("F:\\AutoIT\\mp3Fileupload.exe");
	     Thread.sleep(2000);
	    
	     String mp3FileActual=driver.findElement(By.className("error")).getText();
	     Assert.assertEquals(mp3FileActual,mp3fileExpect);
	     Thread.sleep(7000);
	     logger.info("<<<<<<<<<<<-----------Unable to Upload Mp3 File--->>>>>>>>>>>>>>>>>");
	     Thread.sleep(5000);
	     
	     //Image File 
	     driver.findElement(By.className("fa-upload")).click();
	     Thread.sleep(3000);
	//     String ImagefileExpect="Resource uploaded successfully!!";
	     Runtime.getRuntime().exec("F:\\AutoIT\\Resourceupload.exe");
	     Thread.sleep(5000);
	    
	 //    String ImageFileActual=driver.findElement(By.className("success")).getText();
	  //   Assert.assertEquals(ImageFileActual,ImagefileExpect);
	   //  Thread.sleep(7000);
	     logger.info("<<<<<<<<<<<----------Image upload Successfully-->>>>>>>>>>>>>>>>>");
	     Thread.sleep(5000);
		
	}

	@Override
	public void baseImage() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.cssSelector("body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.lil-wizard.p-t-0.ng-scope > div > div > div:nth-child(2) > div.col-md-4 > div > div > div > label > i")).click();
	    Thread.sleep(3000);
     	Boolean imagewizardappear=driver.findElement(By.className("modal-content")).isDisplayed();
	    Boolean expected=true;
        Assert.assertEquals(imagewizardappear, expected);
        
        //**************Upload Different files Format***************************
        //upload docfile
	     String expect="Selected resource type is not valid, only images are allowed.";

	     driver.findElement(By.className("fa-upload")).click();
	     Thread.sleep(5000);
	    
	
	     Runtime.getRuntime().exec("F:\\AutoIT\\docFIileUload.exe");
	     Thread.sleep(2000);
	     String actual =driver.findElement(By.className("error")).getText();
	     Assert.assertEquals(actual, expect);
	     Thread.sleep(8000);
	     logger.info("<<<<<<<<<<<-----------Unable to Upload WordFile--->>>>>>>>>>>>>>>>>");
	     Thread.sleep(5000);
	     
	     //TextFile upload
	     
	     driver.findElement(By.className("fa-upload")).click();
	     Thread.sleep(5000);
	     
	     
	  
	     String textfileExpect="Selected resource type is not valid, only images are allowed.";
	     Runtime.getRuntime().exec("F:\\AutoIT\\textFileupload.exe");
	     Thread.sleep(2000);
	    
	     String textFileActual=driver.findElement(By.className("error")).getText();
	      Assert.assertEquals(textFileActual,textfileExpect);
	      Thread.sleep(7000);
	     logger.info("<<<<<<<<<<<-----------Unable to Upload TextFile--->>>>>>>>>>>>>>>>>");
	     Thread.sleep(5000);
	     
	     //upload PFD File 
	    
	     driver.findElement(By.className("fa-upload")).click();
	     Thread.sleep(5000);
	     
	     String pdffileExpect="Selected resource type is not valid, only images are allowed.";
	     Runtime.getRuntime().exec("F:\\AutoIT\\pdfFileUpload.exe");
	     Thread.sleep(2000);
	    
	     String pdfFileActual=driver.findElement(By.className("error")).getText();
	     Assert.assertEquals(pdfFileActual,pdffileExpect);
	     Thread.sleep(7000);
	     logger.info("<<<<<<<<<<<-----------Unable to Upload PDFFile--->>>>>>>>>>>>>>>>>");
	     Thread.sleep(5000);
	     
	     //mp3 File
	     driver.findElement(By.className("fa-upload")).click();
	     String mp3fileExpect="Selected resource type is not valid, only images are allowed.";
	     Runtime.getRuntime().exec("F:\\AutoIT\\mp3Fileupload.exe");
	     Thread.sleep(2000);
	    
	     String mp3FileActual=driver.findElement(By.className("error")).getText();
	     Assert.assertEquals(mp3FileActual,mp3fileExpect);
	     Thread.sleep(7000);
	     logger.info("<<<<<<<<<<<-----------Unable to Upload Mp3 File--->>>>>>>>>>>>>>>>>");
	     Thread.sleep(5000);
	     
	     //Image File 
	     driver.findElement(By.className("fa-upload")).click();
	     String ImagefileExpect="Resource uploaded successfully!!";
	     Runtime.getRuntime().exec("F:\\AutoIT\\Resourceupload.exe");
	     Thread.sleep(2000);
	    
	     String ImageFileActual=driver.findElement(By.className("success")).getText();
	     Assert.assertEquals(ImageFileActual,ImagefileExpect);
	     Thread.sleep(7000);
	     logger.info("<<<<<<<<<<<----------Image upload Successfully-->>>>>>>>>>>>>>>>>");
	     Thread.sleep(5000);
	     
	}

	
}
