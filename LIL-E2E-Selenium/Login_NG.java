package TestCase;

import initial.TestBase;

import org.junit.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ReadWrite.Read_XLS;
import common.credentials;
import userDefinedMethods.Login;

public class Login_NG {
	
  
  @Test(priority=1)
  public void openUrl() throws InterruptedException {
	  TestBase.launchBrowser();
	  Thread.sleep(4000);
  }
 @Test(priority=2)
  public void openLoginModal() throws InterruptedException
  {
	  Login.validCredentials();
  }
  @Test(priority=3)
//  @Test(priority=3,dataProvider="credentials")
  public void enterCredentials() throws InterruptedException
  {
	    
	  //   getCellData("TestData.xlsx","Login");
	   //  Login.validCredentials();
	     Login.enterCredentials();
		// Thread.sleep(10000);
		//  Login.datePicker();
	    
  }
  
  @Test(priority=4)
  public void displayDate() throws InterruptedException
  {
	  Login.datePicker();
  }
  
  public Object[][] getCellData(String ExcelName,String Testcase)
  {
	  System.out.println("In Get celldata Test NG");
	  Read_XLS data=new Read_XLS(System.getProperty("user.dir")+"//src//TestData//"+ExcelName);
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
  
}
