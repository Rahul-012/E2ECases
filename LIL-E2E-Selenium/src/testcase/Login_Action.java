package testcase;

import org.testng.annotations.Test;

import ReadExcel.Read_XLS;
import initial.TestBase;
import pageObjects.Login_Page;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;

public class Login_Action {
	
  
  @Test(priority=1)
  public void modal_open() throws InterruptedException {
	  Login_Page.login_Modal();
	 // Thread.sleep(4000);
	  
  }
 
  @Test(priority=2,dataProvider="credentials")
  public void enterCredentials(String username,String password) throws InterruptedException
  {
	
	 Login_Page.validCredentials(username,password);
  }
 
  @BeforeClass
  public void beforeClass() {
	//  login=new Login_Page();
	  TestBase.launchBrowser();
  }
  
  public Object[][] getCellData(String ExcelName,String Testcase)
  {
	  System.out.println("In Get celldata Test NG");
	  Read_XLS data=new Read_XLS(System.getProperty("user.dir")+"//src//testdata//"+ExcelName);
	   int rowNum=data.getRowCount(Testcase);
	   int colNum=data.getColumnCount(Testcase);
	   System.out.println("Number of Rows in Sheet are "+rowNum);
	   System.out.println("Number of Column in Sheet are "+colNum);
	   
	   Object[][] sampleData=new Object[rowNum-1][colNum];
	   for(int i= 2; i <=rowNum; i++)
	   {
	      for(int j=0; j<colNum;j ++)
	      {
	    	  sampleData[i-2][j]=data.getCellData(Testcase, j, i);  
	      }
	   }
	     System.out.println("close getcell data");
	     return sampleData;
  }
    @DataProvider
    public Object[][] credentials()
    {
    	Object[][] logindata=getCellData("TestData.xlsx","Login");
    	return logindata;
    }
    

  @AfterClass
  public void afterClass() {
	//  TestBase.closeBrowser();
	  
  }

}
