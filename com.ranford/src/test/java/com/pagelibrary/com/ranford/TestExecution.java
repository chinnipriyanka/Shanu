package com.pagelibrary.com.ranford;


import org.testng.annotations.Test;

import Excel.Excel_class;

public class TestExecution extends Reprository
{
	@Test(priority=0)
	public void verify_lunch()
	{
		launch();
	}
	@Test(priority=1)
	public void verify_login()
	{
		login();
	} 
	@Test(priority=2)
	public void verify_branchclick()
	{
		branchclick();
	}
	
	/*@Test(priority=3)
	public void verify_branchcreationpage()
	{
		branchcreationpage();
	}*/
	@Test(priority=4)
	public void verify_branchsearchpage()
	{
		branchsearchpage();
	}
	 @Test(priority=3)
	 public void verify_excel() throws Exception
	 {
		 Excel_class.excelconnection("Book1.xls", "Sheet1");
		 Excel_class.outputexcelconnection("Book1.xls", "output.xls", "Sheet1");
		 int c=Excel_class.ccount();
		 for(int r=1;r<Excel_class.rcount();r++)
		{
			
			 branchcreationpage(Excel_class.readdata(0, r), Excel_class.readdata(1, r), Excel_class.readdata(2, r), Excel_class.readdata(3, r), Excel_class.readdata(4, r), Excel_class.readdata(5, r), Excel_class.readdata(6, r), Excel_class.readdata(7, r), Excel_class.readdata(8, r));
			 Thread.sleep(10000);
			 String text=driver.switchTo().alert().getText();
			 driver.switchTo().alert().dismiss();
			 if(text.contains("already Exists"))
			 {
				 Excel_class.writedata(c++, r, text);
				 c--;
			 }
			 else if(text.contains("created successfully"))
			 {
				 Excel_class.writedata(c++, r, text);
				 c--;
			 }
			 else
			 {
				 Excel_class.writedata(c++, r, "n/a");
				 c--;
			 }
		 }
		 Excel_class.saveworkbook();
	 }
	 
	 }
	/*@Test(priority=4)
	public void verify_rolesclick()
	{
		rolesclick();
	}
	@Test(priority=5)
	public void verify_roleinsertionpage()
	{
		roleinsertionpage();
	}
	@Test(priority=6)
	public void verify_tableedit()
	{
		tableedit();
	}*/

