package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import TestBase.Base;

public class table extends Base
{
	public static Boolean status=false;
	public static void tablehandle(String operation,String id)
	{
		
		try {
			Boolean flag=false;
			WebElement table= driver.findElement(getelement("tableid1"));
			List<WebElement> rows= table.findElements(By.tagName("tr"));
			String[] pagelinks=rows.get(rows.size()-1).getText().split(" ");
			for(int i=1;i<pagelinks.length;i++)
			{
				
				try {
					if(pagelinks[i].contains("...") && status==true)
					{
						driver.findElement(By.xpath("//a[text()='...'][2]")).click();
					}
					else
					{
						table.findElement(By.linkText(pagelinks[i])).click();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(pagelinks[i].contains("..."))
				{
					status=true;
					tablehandle(operation, id);
				}
				table= driver.findElement(getelement("tableid1"));
				rows= table.findElements(By.tagName("tr"));
				for(WebElement r:rows)
				{
					List<WebElement> columns= r.findElements(By.tagName("td"));
					for(WebElement c:columns)
					{
						String text=c.getText();
						//System.out.println(text);
						if(text.matches("18"))
						{
							if(operation.equalsIgnoreCase("edit"))
							{
								columns.get(columns.size()-2).findElement(By.tagName("a")).click();
								driver.findElement(getelement("update1")).click();
								driver.switchTo().alert().accept();
							}
							else if(operation.equalsIgnoreCase("delete"))
							{
								columns.get(columns.size()-1).findElement(By.tagName("a")).click();
								driver.switchTo().alert().accept();
								if(driver.switchTo().alert().getText().contains("its a shared record can not be deleted"))
								{
									Reporter.log("shared record can not be deleted");
									driver.switchTo().alert().accept();
									
								}
								else
								{
									Reporter.log("deleted successfully");
									driver.switchTo().alert().accept();
								}
							}
							else
							{
								System.out.println("operation is failed");
							}
							flag=true;
							break;
						}
					}
					if(flag==true)
					{
						break;
					}
					
				}
				if(flag==true)
				{
					break;
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
	
}
