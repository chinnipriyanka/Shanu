package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Validation 
{
	public static boolean Istextpresent(WebDriver driver,String exp)
	{
		boolean b=driver.findElement(By.tagName("tbody")).getText().contains(exp);
		return b;
	}
	public static boolean Istitlepresent(WebDriver driver,String exp)
	{
		boolean b=driver.getTitle().contains(exp);
		return b;
	}
	public static boolean Isaleartpresent(WebDriver driver,String exp)
	{
		boolean b=driver.switchTo().alert().getText().contains(exp);
		return b;
	}

}
