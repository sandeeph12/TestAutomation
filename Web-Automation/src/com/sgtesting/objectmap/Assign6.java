package com.sgtesting.objectmap;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign6 {

	public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginusernametxtfield")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpasswordtxtfield")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginloginbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageminimizeflyoutwin")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickonTasks")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(objectmap.getLocator("addnew")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("newcustomer")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(objectmap.getLocator("customername")).sendKeys("sandeep");
			oBrowser.findElement(objectmap.getLocator("description")).sendKeys("selenium");
			oBrowser.findElement(objectmap.getLocator("commitcustomer")).click();
			Thread.sleep(3000);
			
			Thread.sleep(3000); 
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("addnew")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addproject")).click();
			Thread.sleep(2000);
		
			oBrowser.findElement(objectmap.getLocator("projectname")).sendKeys("Selenium");
			
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("commitproject")).click();
			Thread.sleep(2000);
		
			}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void modifyProject()
	{
		
		try
		{
			
			oBrowser.findElement(objectmap.getLocator("clickonproject")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(objectmap.getLocator("desc")).sendKeys("website");
			Thread.sleep(2000);
						
			oBrowser.findElement(objectmap.getLocator("clickonproject")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void deleteProject()
	{
		try
		{
			
			oBrowser.findElement(objectmap.getLocator("clickonproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("actions2")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("deleteproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("confirmproject")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

		
	
	static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickoncustomer")).click();
			Thread.sleep(3000);
	
			oBrowser.findElement(objectmap.getLocator("actions")).click();
			
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("deletecustomer")).click();
			
			Thread.sleep(3000);
		
			oBrowser.findElement(objectmap.getLocator("deleteconfirm")).click();
			Thread.sleep(3000);
				
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	
	static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}


static void closeApplication()
{
	
	try
	{
		oBrowser.quit();
	}catch(Exception e)
	{
		e.printStackTrace();		
	}
}
}
