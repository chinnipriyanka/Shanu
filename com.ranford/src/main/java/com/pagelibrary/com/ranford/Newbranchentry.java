package com.pagelibrary.com.ranford;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Newbranchentry extends Base

{
	public static WebElement branchname_element()
	{
		return driver.findElement(getelement("Branchname"));
	}

	public static WebElement address1_element()
	{
		return driver.findElement(getelement("Address1"));
	}

	public static WebElement address2_element()
	{
		return driver.findElement(getelement("Address2"));
	}

	public static WebElement address3_element()
	{
		return driver.findElement(getelement("Address3"));
	}
	public static WebElement area_element()
	{
		return driver.findElement(getelement("Area"));
	}
	public static WebElement zipCode_element()
	{
		return driver.findElement(getelement("ZipCode"));
	}
	public static WebElement country_element()
	{
		return driver.findElement(getelement("Country"));
	}
	public static WebElement state_element()
	{
		return driver.findElement(getelement("State"));
	}
	public static WebElement city_element()
	{
		return driver.findElement(getelement("City"));
	}
	public static WebElement submit_element()
	{
		return driver.findElement(getelement("Submit"));
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
