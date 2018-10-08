package com.pagelibrary.com.ranford;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Adminpage extends Base
{
	public static WebElement home_element()
	{
		return driver.findElement(getelement("Home"));
	}
	public static WebElement changepassword_element()
	{
		return driver.findElement(getelement("Changepassword"));
	}
	public static WebElement logout_element()
	{
		return driver.findElement(getelement("Logout"));
	}
	public static WebElement branches_element()
	{
		return driver.findElement(getelement("Branches"));
	}
	public static WebElement roles_element()
	{
		return driver.findElement(getelement("Roles"));
	}
	public static WebElement users_element()
	{
		return driver.findElement(getelement("Users"));
	}
	public static WebElement employee_element()
	{
		return driver.findElement(getelement("Employee"));
	}
	
}
