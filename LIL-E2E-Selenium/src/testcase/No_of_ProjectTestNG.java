package testcase;

import org.junit.AfterClass;
import org.testng.annotations.Test;

import initial.TestBase;
import pageObjects.No_ofProject;





public class No_of_ProjectTestNG {
 

  @Test(priority=1)
  public void clickUponProjectTab() throws Exception {
	  No_ofProject.openProjectTab();
	  
  }
  
  @Test(priority=2)
  public void projectShouldVisible()
  {
	  No_ofProject.projectVisible();
	  
  }
  
  @Test(priority=3)
  public void closeBrowser()
  {
	  TestBase.closeBrowser();
  }
  
  @AfterClass
  public void close()
  {
	  TestBase.closeBrowser();
  }
  

}
