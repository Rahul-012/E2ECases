package testcase;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import initial.TestBase;
import pageObjects.CreateNewProject;

public class CreateNewProjectTestNG extends TestBase {
 
 @Test(priority=1)
  public void clickOnProjWizard() throws InterruptedException 
  {
    CreateNewProject.projectWizard(driver.findElement(By.className("fa-times")),"createProject");
  }
 
 @Test(priority=2)
 public void projectWizardAppear() throws InterruptedException
 {
	 CreateNewProject.projWizardDisplay();
 }
 @Test(priority=3)
 public void metaInformation() throws InterruptedException
 {
	 CreateNewProject.meataInforPrjWizard();
 }
 @Test(priority=4)
 public void uploadProjectThumbnail() throws Exception
 {
	 CreateNewProject.projectThumbnail();
 }
 @Test(priority=5)
 public void countProjectCreation() throws IOException, InterruptedException
 {
	 CreateNewProject.projectCreatedSuccesfuly();
 }
 @Test(priority=6)
 public void openCreatedProject() throws IOException, InterruptedException
 {
	 CreateNewProject.openProjectAddResources();
 }
 
 @AfterClass
 public void close()
 {
	 TestBase.closeBrowser();
 }

}
