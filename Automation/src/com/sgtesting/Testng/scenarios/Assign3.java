package com.sgtesting.Testng.scenarios;


import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign3{
	public static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		/*launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
	    CreateCustomer();
	    deleteCustomer();
		logout();
		closeApplication();*/
		
	}
	
	public static Logger log=Logger.getLogger("Automation");
	@Test(priority=1)
	public void launchBrowser()
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
	@Test(priority=2)
	public void navigate()
	{
	    try
	   {
		oBrowser.navigate().to("http://localhost:82/user/submit_tt.do");
		oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public void CreateCustomer()
	{
	    try
	   {
		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Sandeep");
		oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
		Thread.sleep(5000);
	   }catch(Exception e)
	   {
		e.printStackTrace();		
	   }
	}
	@Test(priority=6)
	public void deleteCustomer()
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
	@Test(priority=7)
	public void logout()
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
	@Test(priority=8)
	public void closeApplication()
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
