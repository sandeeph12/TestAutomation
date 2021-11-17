package com.sgtesting.Testng.scenarios;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign1 {
	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("Automation");

	@Test(priority=1)
	public void launchBrowser()
	{
     	try
	   {
     	log.info("Launch Browser has Started");
       	System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
        oBrowser=new ChromeDriver();
	   }catch(Exception e)
	   {
		e.printStackTrace();		
	   }
    }
	
	@Test(priority=2)
	public void navigate()
	{
	    try
	   {
	    oBrowser.navigate().to("http://localhost:82/user/submit_tt.do");
		oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		log.info("Browser Navigation done");
	   }catch(Exception e)
	   {
		e.printStackTrace();		
	   }
    }
	
	@Test(priority=3)
	public void login()
	{
	    try
	   {
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(6000);
		log.info("Login done");

	   }catch (Exception e) 
	   {
		e.printStackTrace();		
	   }
    }
	
	@Test(priority=4)
	public void minimizeFlyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			log.info("Minimized the Flyout Window");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	public void CreateUser()
	{
	    try
	   {
		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();	
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("demo");
		oBrowser.findElement(By.name("lastName")).sendKeys("User");
		oBrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("demoUser");
		oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
		log.info("Created the user");
		Thread.sleep(2000);
		
	   }catch(Exception e)
	   {
		e.printStackTrace();		
	   }
	}
	
	@Test(priority=6)
	public void deleteUser()
	{
	   try
	   {
		oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
		Thread.sleep(3000);
		Alert oAlert=oBrowser.switchTo().alert();
		String str=oAlert.getText();
		System.out.println(str);
		oAlert.accept();
		log.info("Deleted the user");
		Thread.sleep(2000);
	   }catch(Exception e)
	   {
		e.printStackTrace();
	   }
	}
	
	@Test(priority=7)
	public void logout()
	{
	   try
	   {
		oBrowser.findElement(By.id("logoutLink")).click();
		log.info("Logged out");
		Thread.sleep(2000);
	   }catch(Exception e)
	   {
		e.printStackTrace();
	   }
	}
	
	@Test(priority=8)
	public void closeApplication()
	{
	   try
	   {
		oBrowser.quit();
		log.info("Closed the Application");
	   }catch(Exception e)
	   {
		e.printStackTrace();
	   }
	}
}

