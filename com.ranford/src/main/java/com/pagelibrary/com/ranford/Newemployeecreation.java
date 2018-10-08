package com.pagelibrary.com.ranford;


import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Newemployeecreation extends Base
{

	public static WebElement newemployee_element()
	{
		return driver.findElement(getelement("Newemployee"));
	}
	public static WebElement employername_element()
	{
		return driver.findElement(getelement("Employername"));
	}
	public static WebElement loginpassword_element()
	{
		return driver.findElement(getelement("Loginpassword"));
	}
	public static WebElement role_element()
	{
		return driver.findElement(getelement("Role"));
	}
	public static WebElement branch_element()
	{
		return driver.findElement(getelement("Branch"));
	}
	public static WebElement submit_element()
	{
		return driver.findElement(getelement("Submit2"));
	}
	public static WebElement reset_element()
	{
		return driver.findElement(getelement("Reset2"));
	}
	public static WebElement cancel_element()
	{
		return driver.findElement(getelement("Cancel2"));
	}
}
