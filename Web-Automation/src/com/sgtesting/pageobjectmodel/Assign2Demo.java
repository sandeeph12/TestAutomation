package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2Demo {
	public static WebDriver oBrowser=null;
	public static ActiTimeDemo oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\\\ExampleAutomation\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimeDemo(oBrowser);
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createUser()
	{
		try
		{
			oPage.getCreate().click();
			Thread.sleep(1000);	
			oPage.getaddUser().click();
			Thread.sleep(1000);
			oPage.getfirstname().sendKeys("sandeep");
			Thread.sleep(1000);
			oPage.getlastname().sendKeys("san");
			Thread.sleep(1000);
			oPage.getemailfield().sendKeys("demo@gmail.com");
			Thread.sleep(1000);
			oPage.getUserName().sendKeys("userdemo");
			Thread.sleep(1000);
			oPage.getPasswordField().sendKeys("project");
			Thread.sleep(1000);
			oPage.getretypepassword().sendKeys("project");
			Thread.sleep(1000);
			oPage.getusercreated().click();
			Thread.sleep(1000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser()
	{
		try
		{
			oPage.geticonmodify().click();
			Thread.sleep(1000);	
			/*oPage.getlastnameField().clear();
			Thread.sleep(1000);	
			oPage.getlastnameField().sendKeys("user123");
			Thread.sleep(1000);	
			oPage.getmodifybutton().click();*/
			
			oPage.getfirstname().clear();
			
			oPage.getfirstname().sendKeys("sandeep12");
			Thread.sleep(1000);
			oPage.getlastname().clear();
			
			oPage.getlastname().sendKeys("san");
			Thread.sleep(1000);
			oPage.getemailfield().clear();
			oPage.getemailfield().sendKeys("demo123@gmail.com");
			Thread.sleep(1000);
			oPage.getUserName().sendKeys("userdemo");
			Thread.sleep(1000);
			oPage.getPasswordField().sendKeys("project");
			Thread.sleep(1000);
			oPage.getretypepassword().sendKeys("project");
			Thread.sleep(1000);
			oPage.getusercreated().click();
			Thread.sleep(1000);		
	
			
			Thread.sleep(1000);	
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			oPage.geticondeleteUser().click();
			Thread.sleep(1000);
			oPage.getdeleteUser().click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(1000);
		}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	}




