package com.sgtesting.pom.assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenario2 {

	public static WebDriver oBrowser=null;

	public static ActiTimeMainPage oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
    	login();
		minimize();
		createUser1();
		logout();
		
		loginUser1();
		createUser2();
		logout();
		
		loginUser2();
		createUser3();
		logout();
		loginUser3();
		logout();
		
		loginAgainUser2();
		MfyUser3();
		logout();
		loginMfyUser3();
		logout();
		
		loginAgainUser1();
		MfyUser2();
		logout();
		loginMfyUser2();
		logout();
		
		login();
		MfyUser1();
		logout();
		loginMfyUser1();
		logout();   
		
		loginMfyUser2();
		deleteUser3();
		logout();  
		
		loginMfyUser1();
		deleteUser2();
		logout();
		
		login();
		deleteUser1();
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
			oBrowser.navigate().to("http://localhost:82/user/submit_tt.do");
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
	static void createUser1()
	{
		try
		{
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
			oPage.addUsers().click();
			Thread.sleep(2000);
			oPage.clickOnFName().sendKeys("user1");
			oPage.clickOnLastname().sendKeys("Demo1");
			oPage.userNameFelid().sendKeys("user1");
			oPage.emailFeild().sendKeys("user1@gmail");
			oPage.pwd().sendKeys("welcome");
			oPage.retypePwd().sendKeys("welcome");
			oPage.submitButton().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser2()
	{
		try
		{
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
			oPage.addUsers().click();
			Thread.sleep(2000);
			oPage.clickOnFName().sendKeys("user2");
			oPage.clickOnLastname().sendKeys("Demo2");
			oPage.userNameFelid().sendKeys("user2");
			oPage.emailFeild().sendKeys("user2@gmail");
			oPage.pwd().sendKeys("welcome");
			oPage.retypePwd().sendKeys("welcome");
			oPage.submitButton().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser3()
	{
		try
		{
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
			oPage.addUsers().click();
			Thread.sleep(2000);
			oPage.clickOnFName().sendKeys("user3");
			oPage.clickOnLastname().sendKeys("Demo3");
			oPage.userNameFelid().sendKeys("user3");
			oPage.emailFeild().sendKeys("user3@gmail");
			oPage.pwd().sendKeys("welcome");
			oPage.retypePwd().sendKeys("welcome");
			oPage.submitButton().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginUser1()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("welcome");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			oPage.getClickOnStart().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginUser2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			oPage.getPassword().sendKeys("welcome");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			oPage.getClickOnStart().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginUser3()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			oPage.getPassword().sendKeys("welcome");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			oPage.getClickOnStart().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void MfyUser1()
	{
		try
		{
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
			oPage.getUser1().click();
			Thread.sleep(2000);
			oPage.getWritePwd().sendKeys("123");
			oPage.getWritePwd2().sendKeys("123");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void MfyUser2()
	{
		try
		{
			
			oPage.getUser2().click();
			Thread.sleep(2000);
			oPage.getWritePwd().sendKeys("123");
			oPage.getWritePwd2().sendKeys("123");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void MfyUser3()
	{
		try
		{
			
			oPage.getUser3().click();
			Thread.sleep(2000);
			oPage.getWritePwd().sendKeys("123");
			oPage.getWritePwd2().sendKeys("123");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginMfyUser1()
	{
		try
		{
			
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("123");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginMfyUser2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			oPage.getPassword().sendKeys("123");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginMfyUser3()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			oPage.getPassword().sendKeys("123");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser1()
	{
		try
		{
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
			
			oPage.getUser1().click();
			Thread.sleep(2000);
			oPage.d2User1().click();
			Thread.sleep(2000);
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
	static void deleteUser2()
	{
		try
		{
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
			oPage.getUser2().click();
			Thread.sleep(2000);
			
			oPage.d2User1().click();
			Thread.sleep(2000);
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
	static void deleteUser3()
	{
		try
		{
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
			
			oPage.getAgainUser3toDelete().click();
			Thread.sleep(2000);
			oPage.d2User1().click();
			Thread.sleep(2000);
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
	static void loginAgainUser1()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("welcome");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAgainUser2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			oPage.getPassword().sendKeys("welcome");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
