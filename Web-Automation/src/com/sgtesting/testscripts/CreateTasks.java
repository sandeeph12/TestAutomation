package com.sgtesting.testscripts;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTasks {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
	    CreateCustomer();
        createProject();
        createTask();
        deleteTask();
        deleteProject();
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
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(3000);
	   }catch (Exception e) 
	   {
		e.printStackTrace();		
	   }
    }
	static void minimizeFlyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void CreateCustomer()
	{
	    try
	   {
	    	oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("sandeep");
			oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(5000);
	   }catch(Exception e)
	   {
		e.printStackTrace();	
	   }
    }
	static void createProject()
	   {
		   try
		   {
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("selenium");
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
		   }catch(Exception e)
		   {
			e.printStackTrace();
			
		   }
	   }	 
	static void createTask()
	 {
		 try
		 {
		  oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
		  Thread.sleep(2000);
		  oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
		  Thread.sleep(2000);
		  oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("TASK1");
		  oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_commitBtn\"]/div/span")).click();
		  Thread.sleep(2000);
		  
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 static void deleteTask()
	 {
		 try
		 {
			 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id=\"taskPanel_deleteConfirm_submitTitle\"]")).click();
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
			 oBrowser.findElement(By.xpath ("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
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
			 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			 Thread.sleep(2000);
		     oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			 Thread.sleep(5000);
		   }catch(Exception e)
		   {
			 e.printStackTrace();
		   }
	   }
	 static void logout()
		{
		   try
		   {
			oBrowser.findElement(By.id("logoutLink")).click();
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
