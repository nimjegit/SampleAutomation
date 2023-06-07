package com.datadriven.testng;

import java.util.ArrayList;
import com.excel.utility.Xls_Reader;

public class TestUtil {
		
		static Xls_Reader reader;
	/**	
		public static ArrayList<Object[]> getDataFromExcel(){
			
			ArrayList<Object[]> myData= new ArrayList<Object[]>();
			try{
				reader = new Xls_Reader("/Users/vinanimje/Desktop/Automationpractice/com/testdata/Workbook2.xlsx");
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			for(int rowNum=2; rowNum<=reader.getRowCount("RegistrationData"); rowNum++) {
				
				String emailId = reader.getCellData("RegistrationData", "EmailId", rowNum);
				String firstName = reader.getCellData("RegistrationData", "FirstName", rowNum);
				String lastName = reader.getCellData("RegistrationData", "LastName", rowNum);
				String  phNum= reader.getCellData("RegistrationData", "PhoneNumber", rowNum);
				String  pwd= reader.getCellData("RegistrationData", "Password", rowNum);
				
				
				Object ob[] = {emailId,firstName,lastName, phNum, pwd};
				myData.add(ob);
				}
			
			
			return myData;
			
			
				
			}*/
			}
			
			
			
		


