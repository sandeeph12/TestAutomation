package com.sgtesting.objectmap;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
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
	
	static void createUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("createuser")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(objectmap.getLocator("adduser")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("fname")).sendKeys("demo");
			oBrowser.findElement(objectmap.getLocator("lname")).sendKeys("User1");
			oBrowser.findElement(objectmap.getLocator("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(objectmap.getLocator("username")).sendKeys("demoUser2");
			oBrowser.findElement(objectmap.getLocator("password")).sendKeys("Welcome123");
			oBrowser.findElement(objectmap.getLocator("passwordcopy")).sendKeys("Welcome123");
			oBrowser.findElement(objectmap.getLocator("commitbtn")).click();
			Thread.sleep(3000); 
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("userclick")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("deletebtn")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
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
