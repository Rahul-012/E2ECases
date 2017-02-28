package pageObjects;




import java.io.IOException;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import initial.TestBase;

public class CreateNewProject extends TestBase {
	
	public static void  projectWizard(WebElement mainElement, String subelement) throws InterruptedException
	{
		 Actions action = new Actions(driver);
		 
   //   action.moveToElement(driver.findElement(By.className("fa-times"))).perform();
		  action.moveToElement(mainElement).perform();
      Thread.sleep(3000);
         if(subelement.equals("createProject"))
         {
        //	action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/ul/li/ul/li[1]/a/i")));
        //	 action.moveToElement(driver.findElement(By.className("fa-th-large")));
         driver.findElement(By.className("fa-th-large")).click();
         
        	
        	 
         }
         else if(subelement.equals("Blog"))
         {
        	// action.moveToElement(driver.findElement(By.className("fa-rss"))).click();
        	 driver.findElement(By.className("fa-rss")).click();
        	 
         }
         else
         {
        	 System.out.println("No Element Found");
         }
         
         
         Thread.sleep(3000);
      
				 
			 
	 }
	public static  void projWizardDisplay() throws InterruptedException
	{
		WebElement wizard= driver.findElement(By.className("modal-content"));
		   boolean actual= wizard.isDisplayed();
		  Assert.assertEquals(true, actual); 
		  Thread.sleep(3000);
	}
	
	public static void  meataInforPrjWizard() throws InterruptedException
	{
	    
		
		// Select Project type
		Select dropdown=new Select(driver.findElement(By.name("projectType")));
		dropdown.selectByIndex(1);
		//click on Done Button
		  driver.findElement(By.name("button")).click();
		  String actualLearning=driver.findElement(By.className("show")).getText();
		  String expectLearning="please select learning level";
		  Assert.assertEquals(actualLearning, expectLearning);
          
		
		//Select Learning Levels
			    Select learningLevel=new Select(driver.findElement(By.name("learningLevel")));
				learningLevel.selectByIndex(1);
				Thread.sleep(2000);
		logger.info("Learning Level Selected ");
				//click on Done Button
				  driver.findElement(By.name("button")).click();
	         //validation Message
				 String actualSubject=driver.findElement(By.className("show")).getText();
				  String expectSubject="please select subject";
				  Assert.assertEquals(actualSubject, expectSubject);
				  
		    		  
				
		//select Subject
		 Select subject=new Select(driver.findElement(By.name("subject")));
		   subject.selectByIndex(1);
		   logger.info("Subject Selected Successfully!!!!");
		 //click on Done Button
			  driver.findElement(By.name("button")).click();
			//validation Message
				 String actualLanguage=driver.findElement(By.className("show")).getText();
				  String expectLanguage="please select language";
				  Assert.assertEquals(actualLanguage, expectLanguage);
		          Thread.sleep(3000);
		   
		 //select Language
		   Select language=new Select(driver.findElement(By.name("lang")));
		   language.selectByIndex(1); 
		   logger.info("Language Selected Successfully!!!!");
		 //click on Done Button
			  driver.findElement(By.name("button")).click();
			//validation Message
				 String actualExpertise=driver.findElement(By.className("show")).getText();
				  String expectExpertise="please select expertiseLevel";
				  Assert.assertEquals(actualExpertise, expectExpertise);
		         Thread.sleep(3000);
		   
		  //Select Expertise Level
		 //   Select expertise=new Select(driver.findElement(By.cssSelector("body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(1) > div:nth-child(5) > select")));
	         Select expertise=new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/div/div[1]/div[5]/select")));
		         expertise.selectByIndex(1);
		         logger.info("Expertise level Selected Successfully!!!!");
		    //click on Done Button
			  driver.findElement(By.name("button")).click();
			//validation Message
				 String actualDomain=driver.findElement(By.className("show")).getText();
				  String expectDomain="please select domain";
				  Assert.assertEquals(actualDomain, expectDomain);
		    
		    
           //select Domain
		    Select domain=new Select(driver.findElement(By.cssSelector("body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(1) > div:nth-child(6) > select")));
		        domain.selectByIndex(1);
		       logger.info("Domain Selected Successfully!!!!");
  
		        
		   //select License
		        Select license=new Select(driver.findElement(By.cssSelector("body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(1) > div:nth-child(7) > select")));
		        license.selectByVisibleText("Udaipur QA Institute");
		        logger.info("License Selected Successfully!!!!");
		        //click on Done Button
				  driver.findElement(By.name("button")).click();
				//validation Message
					 String actualTopic=driver.findElement(By.className("show")).getText();
					  String expectTopic="please select topic";
					  Assert.assertEquals(actualTopic, expectTopic);
					 	        
		        
		 
		     //select Topic   
		        Select topic=new Select(driver.findElement(By.cssSelector("body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(1) > div:nth-child(8) > select")));
		      topic.selectByVisibleText("Coal Handling");
		      logger.info("Topic  Selected Successfully!!!!");

		
		
		
	}
	
	public static void projectThumbnail() throws IOException, InterruptedException
	{
		 Thread.sleep(9000);
//upload docfile
		  driver.findElement(By.className("fa-upload")).click();
		  Thread.sleep(2000);
		  Runtime.getRuntime().exec("F:\\AutoIT\\docFIileUload.exe");
		  Thread.sleep(2000);
	      String actualDocerror=	driver.findElement(By.className("show")).getText();
	      String expectedDocError="Selected resource type is not valid, only images are allowed.";
	      Assert.assertEquals(actualDocerror, expectedDocError);
	      logger.info("Unable to upload Doc File");
	      Thread.sleep(2000);
//upload mp3file
			driver.findElement(By.className("file-upload-btn")).click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec("F:\\AutoIT\\mp3Fileupload.exe");
	    	String actualMp3error=	driver.findElement(By.className("show")).getText();
	    	String expectedMp3Error="Selected resource type is not valid, only images are allowed.";
	    	Assert.assertEquals(actualMp3error, expectedMp3Error);
		   logger.info("Unable to upload MP3 File");
	//upload PDFFile
		driver.findElement(By.className("file-upload-btn")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("F:\\AutoIT\\mp3Fileupload.exe");
	    String actualPdfError=	driver.findElement(By.className("show")).getText();
	    String expectedPdfError="Selected resource type is not valid, only images are allowed.";
	    Assert.assertEquals(actualPdfError, expectedPdfError);
	    logger.info("Unable to upload PDF File");
	    Thread.sleep(2000);
  //upload TextFile
			driver.findElement(By.className("file-upload-btn")).click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec("F:\\AutoIT\\mp3Fileupload.exe");
	    	String actualTextError=	driver.findElement(By.className("show")).getText();
		    String expectedTextError="Selected resource type is not valid, only images are allowed.";
		    Assert.assertEquals(actualTextError, expectedTextError);
		    logger.info("Unable to upload Text  File");
		    Thread.sleep(2000);
   //upload Image FIle		    
		    driver.findElement(By.className("file-upload-btn")).click();
			Thread.sleep(4000);
			Runtime.getRuntime().exec("F:\\AutoIT\\Resourceupload.exe");
			Thread.sleep(4000);
	    //	String actualImgError=	driver.findElement(By.className("show")).getText();
		 //   String expectedImgError="Selected resource type is not valid, only images are allowed.";
		  //  Assert.assertEquals(actualImgError, expectedImgError);
		     logger.info("Image upload Successfully!!!!");
		     WebElement getClassName=driver.findElement(By.className("thumbImage"));
		     WebElement getTagName=getClassName.findElement(By.tagName("img"));
		     String getAttribute=getTagName.getAttribute("src");
		     System.out.println(getAttribute);
		    	
		        String actualImage="image/jpeg";
		    	String expectImage=URLConnection.guessContentTypeFromName(getAttribute);
		        Assert.assertEquals(actualImage, expectImage);
		        
    // Create Project Successfully
		      driver.findElement(By.name("button")).click();
		      Thread.sleep(4000);
		      String expectedProjedCreated="Project created successfully!!";
		      String actualProjectCreated=driver.findElement(By.className("show")).getText();
		      Assert.assertEquals(actualProjectCreated, expectedProjedCreated);
	
	}
	public static void googleSearch()
	{
		
	}
	
	
	public static void projectCreatedSuccesfuly() throws InterruptedException
	{
		
		Thread.sleep(4000);
		//Count the Project
		driver.findElement(By.className("fa-arrow-left")).click();
		Thread.sleep(4000);
		  List<WebElement> projectcount=driver.findElements(By.className("lil-card-fluid-container"));  
		    System.out.println(projectcount.size());
		    int expectcount=projectcount.size();
		    Assert.assertEquals(expectcount, expectcount);
	}
	public static void openProjectAddResources() throws InterruptedException
	{
		driver.findElement(By.cssSelector("body > div.ng-scope > div:nth-child(3) > section > div:nth-child(1)")).click();
		Thread.sleep(4000);
	}
	
}


