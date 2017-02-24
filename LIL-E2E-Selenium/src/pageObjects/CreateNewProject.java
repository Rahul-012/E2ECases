package pageObjects;




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
				
				//click on Done Button
				  driver.findElement(By.name("button")).click();
	         //validation Message
				 String actualSubject=driver.findElement(By.className("show")).getText();
				  String expectSubject="please select subject";
				  Assert.assertEquals(actualSubject, expectSubject);
				  
		    		  
				
		//select Subject
		 Select subject=new Select(driver.findElement(By.name("subject")));
		   subject.selectByIndex(1);
		   
		 //click on Done Button
			  driver.findElement(By.name("button")).click();
			//validation Message
				 String actualLanguage=driver.findElement(By.className("show")).getText();
				  String expectLanguage="please select language";
				  Assert.assertEquals(actualLanguage, expectLanguage);
		   
		   
		 //select Language
		   Select language=new Select(driver.findElement(By.name("lang")));
		   language.selectByIndex(1); 
		   
		 //click on Done Button
			  driver.findElement(By.name("button")).click();
			//validation Message
				 String actualExpertise=driver.findElement(By.className("show")).getText();
				  String expectExpertise="please select expertiseLevel";
				  Assert.assertEquals(actualExpertise, expectExpertise);
		   
		   
		  //Select Expertise Level
		    Select expertise=new Select(driver.findElement(By.cssSelector("body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(1) > div:nth-child(5) > select")));
		    expertise.selectByIndex(1);
		   
		    //click on Done Button
			  driver.findElement(By.name("button")).click();
			//validation Message
				 String actualDomain=driver.findElement(By.className("show")).getText();
				  String expectDomain="please select domain";
				  Assert.assertEquals(actualDomain, expectDomain);
		    
		    
           //select Domain
		    Select domain=new Select(driver.findElement(By.cssSelector("body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(1) > div:nth-child(6) > select")));
		        domain.selectByIndex(1);
		        
  
		        
		   //select License
		        Select license=new Select(driver.findElement(By.cssSelector("body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(1) > div:nth-child(7) > select")));
		        license.selectByVisibleText("Udaipur QA Institute");
		        
		        //click on Done Button
				  driver.findElement(By.name("button")).click();
				//validation Message
					 String actualTopic=driver.findElement(By.className("show")).getText();
					  String expectTopic="please select topic";
					  Assert.assertEquals(actualTopic, expectTopic);
					 	        
		        
		 
		     //select Topic   
		        Select topic=new Select(driver.findElement(By.cssSelector("body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > form > div.modal-body > div > div:nth-child(1) > div:nth-child(8) > select")));
		      topic.selectByVisibleText("Coal Handling");

		
		
		
	}
	
}


