package writesampletestcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readFromExcel {
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void excelfile() throws IOException {
		//Create an object of File class to open xlsx file
	    File file =    new File("//Users//vinanimje//Desktop//Automationpractice//com//testdata//Workbook2.xlsx");
	    
	  //Create an object of FileInputStream class to read excel file
	    FileInputStream inputStream = new FileInputStream(file);
	    
	  //Creating workbook instance that refers to .xls file
	    XSSFWorkbook wb = new XSSFWorkbook(inputStream);
	    
	    
	  //Creating a Sheet object using the sheet Name
	    XSSFSheet sheet =  wb.getSheet("RegistrationData");
	    
	  /*//Create a row object to retrieve row at index 1
        XSSFRow row2=sheet.getRow(2);
	    
	   //Create a cell object to retrieve cell at index 5
        XSSFCell cell = row2.getCell(0);
        
       //String name= cell.getStringCellValue();
        
       //int phnum =  (int) cell.getNumericCellValue();*/ 
        
      //Get all rows in the sheet
        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
        for(int i=0;i<=rowCount;i++) {
        	
        	//get cell count in a row
        	int cellCount = sheet.getRow(i).getLastCellNum();
        	System.out.println("Row" +i+ "data is: ");
        	XSSFRow row=sheet.getRow(i);
        	for(int j=0; j<cellCount;j++) {
        		
        		XSSFCell cell =row.getCell(j);
        		
        		//if(cell.getCellType())
        		
        		System.out.println(cell);
    
        	System.out.println();
        }
        }
        
	    
	}
	

}
