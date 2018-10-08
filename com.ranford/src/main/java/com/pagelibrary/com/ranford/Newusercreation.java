package com.pagelibrary.com.ranford;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Newusercreation extends Base
{
	public static WebElement role_element()
	{
		return driver.findElement(getelement("Role-u"));
	}
	public static WebElement branch_element()
	{
		return driver.findElement(getelement("Branchs-u"));
	}
	public static WebElement customerid_element()
	{
		return driver.findElement(getelement("Customerid"));
	}
	public static WebElement customername_element()
	{
		return driver.findElement(getelement("Customername"));
	}
	public static WebElement username_element()
	{
		return driver.findElement(getelement("Username-u"));
	}
	public static WebElement loginpassword_element()
	{
		return driver.findElement(getelement("Loginpassword"));
	}
	public static WebElement transcationpassword_element()
	{
		return driver.findElement(getelement("Transcationpassword"));
	}
	public static WebElement submit_element()
	{
		return driver.findElement(getelement("Submit-u"));
	}
	public static WebElement reset_element()
	{
		return driver.findElement(getelement("Reset"));
	}
	public static WebElement cancel_element()
	{
		return driver.findElement(getelement("Cancel"));
	}

}
