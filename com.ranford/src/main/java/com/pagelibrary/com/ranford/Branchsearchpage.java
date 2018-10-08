package com.pagelibrary.com.ranford;


import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Branchsearchpage extends Base
 {
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
	public static WebElement search_element()
	{
		return driver.findElement(getelement("Search"));
	}
	public static WebElement clear_element()
	{
		return driver.findElement(getelement("Clear"));
	}
	public static WebElement newbranch_element()
	{
		return driver.findElement(getelement("Newbranch"));
	}
 }
