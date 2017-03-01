package testcase;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AddResources;

public class AddResourceTestNG { 
	AddResources addresources;
 
	@Test(priority=2)
  public void googleSearch() throws InterruptedException {
	  addresources.googleSearch();
  }
  
  
  @Test(priority=1)
  public void callClass()
  {
	  addresources=new AddResources();
  }
  
  @Test(priority=3)
  public void dragnDropGoogleElement() throws InterruptedException
  {
	  addresources.dragNDropGoogleSrch();
  }
}
