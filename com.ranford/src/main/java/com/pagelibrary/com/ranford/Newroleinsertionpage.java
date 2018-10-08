package com.pagelibrary.com.ranford;


import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Newroleinsertionpage extends Base

{
	public static WebElement newroles_element()
	{
		return driver.findElement(getelement("NewRole"));
	}
	public static WebElement rolename_element()
	{
		return driver.findElement(getelement("Rolename"));
	}
	public static WebElement roledesc_element()
	{
		return driver.findElement(getelement("Roledesc"));
	}
	public static WebElement roletype_element()
	{
		return driver.findElement(getelement("Roletype"));
	}
	public static WebElement submit_element()
	{
		return driver.findElement(getelement("Submit1"));
	}
	public static WebElement reset_element()
	{
		return driver.findElement(getelement("Reset1"));
	}
	public static WebElement cancel_element()
	{
		return driver.findElement(getelement("Cancel1"));
	}

}
