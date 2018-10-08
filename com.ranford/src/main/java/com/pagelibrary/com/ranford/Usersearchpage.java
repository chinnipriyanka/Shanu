package com.pagelibrary.com.ranford;


import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Usersearchpage extends Base
{
	public static WebElement branch_element()
	{
		return driver.findElement(getelement("Branch-u"));
	}
	public static WebElement roles_element()
	{
		return driver.findElement(getelement("Roles-u"));
	}
	public static WebElement search_element()
	{
		return driver.findElement(getelement("Search-u"));
	}
	public static WebElement clear_element()
	{
		return driver.findElement(getelement("Clear-u"));
	}
	public static WebElement newuser_element()
	{
		return driver.findElement(getelement("Newuser-u"));
	}
}
