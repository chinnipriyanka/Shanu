package com.pagelibrary.com.ranford;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import TestBase.Base;
import Utility.Library;
import Utility.Validation;
import Webtable.table;

public class Reprository extends Base
{
	public static ExtentReports extent;
	public static ExtentTest test;
	
	//TestNG Framework
	
	@BeforeSuite
	public static void extentset()
	{
		extent=new ExtentReports(".\\ExtentReport\\ExtentReporthtml.html",true);
	}
	@BeforeMethod
	public void beforemethod(Method method)
	{
		test=extent.startTest(this.getClass().getSimpleName()+" ::"+method.getName());
		test.assignAuthor("author : shanu");
		test.assignCategory("category : regression");
	}
	public void launch() 
	{
		driver=new FirefoxDriver();
		driver.get(FetchDate("buildurl1"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String actualurl=driver.getCurrentUrl();
		String exp="http://srssprojects.in/home.aspx";
		if (actualurl.equals(exp))
		{
			Reporter.log("launch test is passed");
			test.log(LogStatus.PASS,"actual Url is:" +actualurl+" :is matching with exp"+exp,test.addScreenCapture(Library.takescreenshort("launch")));
			test.log(LogStatus.INFO, "Browser Launched Successfully");
		}
		else
		{
			Reporter.log("launch test is failed");
			test.log(LogStatus.FAIL, "actual Url is:" +actualurl+" :is not matching with exp"+exp,Library.takescreenshort("screenname1"));
			
		}
	}
	public void login()
	{
		Homepage.username_element().sendKeys(FetchDate("username"));
		Homepage.password_element().sendKeys(FetchDate("password"));
		Homepage.login_element().click();
		
		if (Validation.Istextpresent(driver, " Welcome to Admin"))
		{
			Reporter.log("Login test is passed");
			test.log(LogStatus.PASS,"Login test is passed. Text is present",test.addScreenCapture(Library.takescreenshort("Login")));
		}
		else
		{
			Reporter.log("login test is failed");
			test.log(LogStatus.FAIL,"Text is not present" ,test.addScreenCapture(Library.takescreenshort("screenname3")));
		}
		
	}
	
	public void branchclick()
	{
		Adminpage.branches_element().click();
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	public void branchcreationpage(String bname, String add1, String add2, String add3, String barea1, String zipcode, String bcontry, String bstate1, String bcity1)
	{
		Branchsearchpage.newbranch_element().click();
		Newbranchentry.branchname_element().sendKeys(bname);
		Newbranchentry.address1_element().sendKeys(add1);
		Newbranchentry.address2_element().sendKeys(add2);
		Newbranchentry.address3_element().sendKeys(add3);
		Newbranchentry.area_element().sendKeys(barea1);
		Newbranchentry.zipCode_element().sendKeys(zipcode);
		Generic.dropdownhandle(getelement("Country")).selectByVisibleText(bcontry);
		Generic.dropdownhandle(getelement("State")).selectByVisibleText(bstate1);
		Generic.dropdownhandle(getelement("City")).selectByVisibleText(bcity1);
		Newbranchentry.submit_element().click();
		/*if (Validation.Isaleartpresent(driver, "Branch name already Exist" ))
		{
			Reporter.log(" Branchcreation test is passed");
			test.log(LogStatus.PASS,"Login test is passed. Text is present"+test.addScreenCapture(Library.takescreenshort("branchcreation")));
			
		}
		else
		{
			Reporter.log("Branchcreation test is failed");
			test.log(LogStatus.FAIL,"Text is not present" ,Library.takescreenshort("screenname3"));
			
		}*/
		Generic.alertbutton().accept();
	}
	public void branchsearchpage()
	{
		Generic.dropdownoptions(getelement("Country1"), "INDIA");
		//Generic.dropdownhandle(getelement("Country1")).selectByVisibleText("INDIA");
		Generic.dropdownhandle(getelement("State1")).selectByVisibleText("Andhra Pradesh");
		Generic.dropdownhandle(getelement("City1")).selectByVisibleText("Hyderabad");
		Branchsearchpage.search_element().click();
	}
	public void tableedit()
	{
		table.tablehandle("Edit", "18");
	}
	public void tabledelete()
	{
		table.tablehandle("delete", "232");
	}
	public void rolesclick()
	{
		Adminpage.roles_element().click();
	}
	public void employeeclick()
	{
		Adminpage.employee_element().click();
	}
	public void usersclick()
	{
		Adminpage.users_element().click();
	}
	public void roleinsertionpage()
	{
		Newroleinsertionpage.newroles_element().click();
		Newroleinsertionpage.rolename_element().sendKeys("priya");
		Newroleinsertionpage.roledesc_element().sendKeys("editer");
		Generic.dropdownhandle(getelement("Roletype")).selectByVisibleText("E");
		Newroleinsertionpage.submit_element().click();
	}
	public void newemployeecreation()
	{
		Newemployeecreation.newemployee_element().click();
		Newemployeecreation.employername_element().sendKeys("chpriya");
		Newemployeecreation.loginpassword_element().sendKeys("ch@123");
		Generic.dropdownhandle(getelement("Role")).selectByVisibleText("trainer");
		Generic.dropdownhandle(getelement("Branch")).selectByVisibleText("125");
		Newemployeecreation.submit_element().click();
	}
	public void userssearchpage()
	{
		Generic.dropdownhandle(getelement("Branch-u1")).selectByVisibleText("125");
		Generic.dropdownhandle(getelement("Roles-u")).selectByVisibleText("employee");
		Usersearchpage.search_element().click();
	}
	public void newusercreation()
	{
		Usersearchpage.newuser_element().click();
		Generic.dropdownhandle(getelement("Role-u")).selectByVisibleText("employee");
		Generic.dropdownhandle(getelement("Branchs-u")).selectByVisibleText("125");
		Generic.dropdownhandle(getelement("Customerid")).selectByIndex(1);
		Newusercreation.customername_element().sendKeys("shanavi");
		Newusercreation.username_element().sendKeys("dhatri");
		Newusercreation.loginpassword_element().sendKeys("12345");
		Newusercreation.transcationpassword_element().sendKeys("123456");
		Newusercreation.submit_element().click();
	}
	@AfterSuite
	public void aftersuite()
	{
		extent.flush();
		
	}
		
}
