package com.sgtesting.pom.assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign6 {

	public static WebDriver oBrowser=null;
	public static ActiTimeMainPage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		createCustomer();
		createProject();
		modifyProject();
     	deleteProject() ;
		deleteCustomer();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimeMainPage(oBrowser);
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
			oPage.getLogIn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimize()
	{
		try
		{
			oPage.minimizeFlyoutWindow().click();
			Thread.sleep(2000);
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
	static void createCustomer()
	{
		try
		{
			oPage.getClickOnTasks().click();
			Thread.sleep(2000);
			oPage.getAddnewButton().click();
			Thread.sleep(2000);
			oPage.getCeateNewcustomer().click();
			Thread.sleep(2000);
			oPage.getWriteCustomerName().sendKeys("sandeep");
			oPage.getCreateButton().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{
			oPage.getAddnewButton().click();
			Thread.sleep(2000);
			oPage.getNewProjectButton().click();
			Thread.sleep(2000);
			oPage.getPNameField().sendKeys("ActiTime Project");
			oPage.getCreatePButton().click();
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
			oPage.getSettingButton().click();
			Thread.sleep(2000);
			oPage.getDescription().click();
			Thread.sleep(2000);
			oPage.getDescription().sendKeys("SG Testing");
			Thread.sleep(2000);
			oPage.getSettingButton().click();
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
			oPage.getSettingButton().click();
			Thread.sleep(2000);
			oPage.getPActionButton().click();
			Thread.sleep(2000);
			oPage.getProjectDelete1().click();
			Thread.sleep(2000);
			oPage.getProjectDelete2().click();
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
			oPage.getDelete().click();
			Thread.sleep(2000);
			oPage.getActionsButton().click();
			Thread.sleep(2000);
			oPage.getDelete1().click();
			Thread.sleep(2000);
			oPage.getDelete2().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}