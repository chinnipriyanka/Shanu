package TestBase;

import java.io.File;

import java.io.FileReader;

import java.util.Properties;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base2
{
	public static WebDriver driver;
	static Properties p;
	public static String FetchDate(String key)
	{
		ResourceBundle bundle= ResourceBundle.getBundle("configuration.config");
		String x=bundle.getString(key);
		return x;
	}
	//To get the details from properties file
	/*public static void loadproperty() 
	{
		try {
			File f=new File(System.getProperty("user.dir")+"src\\main\\java\\configuration\\config.properties");
			FileReader fr=new FileReader(f);
			p= new Properties();
			p.load(fr);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getconfig(String key)
	{	
		String x=p.getProperty(key);
		return x;
	}*/
	//To get locators from the file
	public static void loadproperty1() 
	{
		try {
			File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\OR.properties");
			FileReader fr=new FileReader(f);
			p= new Properties();
			p.load(fr);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static By getelement(String key)
	{
	
		loadproperty1();
		String value=p.getProperty(key);
		String locType=value.split(":")[0];
		String locValue=value.split(":")[1];
		By loc = null;
		switch (locType)
		{
		case "id": loc=By.id(locValue);
			break;
		case "name": loc=By.name(locValue);
			break;
		case "tagName": loc=By.tagName(locValue);
			break;
		case "linkText": loc=By.linkText(locValue);
			break;
		case "partialLinkText": loc=By.partialLinkText(locValue);
			break;
		case "className": loc=By.className(locValue);
			break;
		case "cssSelector": loc=By.cssSelector(locValue);
			break;
		case "xpath": loc=By.xpath(locValue);
			break;
		}
		return loc;
	}
}
