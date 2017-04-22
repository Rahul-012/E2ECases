package ReadExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import bsh.Parser;



public class Read_XLS {
	public String path;
	 FileInputStream fis;
	 XSSFWorkbook wrkbook;
	 XSSFSheet sheet;
	 XSSFRow row;
	 XSSFCell cell;
	public Read_XLS(String path)
	{
		this.path=path;
		try
		{
			fis=new FileInputStream(path);
			wrkbook=new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getCellData(String sheetname,String colName,int rowNum)
	{
		int index;
		int col_Num=0;
		String number;
		try
		{
			 index=wrkbook.getSheetIndex(sheetname);
			 sheet= wrkbook.getSheetAt(index);		
			  row= sheet.getRow(0);
			  for(int i=0; i<row.getLastCellNum();i++)
			  {
				  if(row.getCell(i).getStringCellValue().equals(colName))
				  {
					  col_Num=i;
					  System.out.println(col_Num);
				  }
			  }
			 row= sheet.getRow(rowNum-1);
			 cell= row.getCell(col_Num);
			 
			 if(cell.getCellType()==Cell.CELL_TYPE_STRING)
			 {
				 return cell.getStringCellValue();
			 }
			 else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
			 
				  return String.valueOf(cell.getNumericCellValue());
			 
			 /*else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
				 return cell.getStringCellValue();*/
			 
			 else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
				 return "";
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public String getCellData(String sheetname,int colName,int rowNum)
	{
		int index;
		int col_Num=0;
		try
		{
			 index=wrkbook.getSheetIndex(sheetname);
			 sheet= wrkbook.getSheetAt(index);		
			  row= sheet.getRow(0);
			
			 row= sheet.getRow(rowNum-1);
			 cell= row.getCell(colName);
			 if(cell.getCellType()==Cell.CELL_TYPE_STRING)
			 {
				 return cell.getStringCellValue();
			 }
			 else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
				 return cell.getStringCellValue();
		
			 else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
				 return "";
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
	public int getRowCount(String sheetname)
	{
	    int index =  wrkbook.getSheetIndex(sheetname);	
	    if(index==-1)
	    {
	    	System.out.println("Sheet Not Found ");
	    	return 0;
	    }
	    else
	    {
	    	sheet= wrkbook.getSheetAt(index);
	    	int number=sheet.getLastRowNum()+1;
	    	return number;
	    }
	    
	 	}
	public int getColumnCount(String sheetname)
    {
		int index =  wrkbook.getSheetIndex(sheetname);	
	    if(index==-1)
	    {
	    	System.out.println("Sheet Not Found ");
	    	return 0;
	    }
	    else
	    {
	    	sheet=wrkbook.getSheet(sheetname);
	    	row= sheet.getRow(0);
	    	return row.getLastCellNum();
	    }
    	
		
    }
	
	
/*	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"//src//testdata//TestData.xlsx";
		Read_XLS obj=new Read_XLS(path);
		System.out.println(obj.getCellData("Sheet1",2,4));
	//	System.out.println(obj.getRowCount("Sheet1"));
	//	System.out.println(obj.getColumnCount("Sheet1"));
	}*/

}
