package com.pagelibrary.com.ranford;


import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Homepage extends Base

{

	public static WebElement username_element()
	{
		return driver.findElement(getelement("username"));
	}
	public static WebElement password_element()
	{
		return driver.findElement(getelement("password"));
	}
	public static WebElement login_element()
	{
		return driver.findElement(getelement("login"));
	}
}
