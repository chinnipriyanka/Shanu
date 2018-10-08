package com.pagelibrary.com.ranford;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import TestBase.Base;

public class Generic extends Base
{
	public static Select dropdownhandle(By prop)
	{
		Select s=new Select(driver.findElement(prop));
		return s;
	}
	public static Select dropdownoptions(By prop, String exp)
	{
		Select s=new Select(driver.findElement(prop));
		
		List<WebElement> options=s.getOptions();
		for(WebElement op:options)
		{
		String actualtext=op.getText();
		Reporter.log(actualtext);
		if(actualtext.contains(exp))
		{
			s.selectByVisibleText(exp);
			break;
		}
		}
		return s;
		
	}
	public static Alert  alertbutton()
	{
		Alert a=driver.switchTo().alert();
		return a;
	}
}
