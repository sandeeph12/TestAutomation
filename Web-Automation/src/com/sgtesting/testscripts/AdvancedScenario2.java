package com.sgtesting.testscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenario2 {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		logout();
		loginuser1();
		createuser2();
		logout2();
		loginuser2();
		createuser3();
		logout3();
	    loginuser3();
	    logoutuser3();
//create users done
//again login user2	    ------------------------------------------
		loginbyuser22();
		modifyuser3();
		logoutmdfuser3();
		loginbyuser3();
		logoutbyuser3();
//again login user1     -----------------------------------
		loginasuser1();
		 modifypassworduser2();
		 logoutagainuser2();
		 loginbyuser2s();
		 logoutagainuser22();
		 loginasadmin();
		 modifypassworduser1();
		 logoutagainuser11();
		 againloginuser1();
		 againlogoutuser1();
		 againloginuser2();
//delete operation
		 deleteUser3();
		 logoutdeleteuser3();
		 againloginuser1delete();
		 deleteUser2();
		 logoutdeleteuser2();
		 loginadmin();
		 deleteUser1();
		 logoutdeleteuser1();
		 closeApplication();
	}
	static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			obrowser.navigate().to("http://localhost:82/login.do");
			obrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("sandeep");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("san1");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo1@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user1");
			Thread.sleep(2000); 
			obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome123");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome123");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
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
			obrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginuser1() 
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser2()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("sandeep2");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("san2");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo2@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user2");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome12345");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome12345");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout2()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginuser2()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome12345");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser3()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("sandeep3");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("san3");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo3@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user3");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome1234567");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome1234567");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout3()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginuser3()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("user3");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome1234567");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser3()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginbyuser22()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome12345");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyuser3()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("678");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("678");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	static void logoutmdfuser3()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginbyuser3()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("user3");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("678");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutbyuser3()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginasuser1() 
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifypassworduser2()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		    obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
		    Thread.sleep(2000);
	      	obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("45678");
		    Thread.sleep(2000);
		    obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("45678");
		    Thread.sleep(2000);
	    	obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		    Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutagainuser2()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginbyuser2s()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("45678");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutagainuser22()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginasadmin()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifypassworduser1()
	{
		try
		{
		obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();
		Thread.sleep(2000);
		obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");
		Thread.sleep(2000);
		obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345");
		Thread.sleep(2000);
		obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutagainuser11()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void againloginuser1() 
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("12345");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void againlogoutuser1()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void againloginuser2()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("45678");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser3()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		    Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert=obrowser.switchTo().alert();
			String str=oAlert.getText(); 
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logoutdeleteuser3()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}static void againloginuser1delete() 
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("12345");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser2()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		    Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert=obrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logoutdeleteuser2()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	
	}
	static void loginadmin()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteUser1()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		    Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert=obrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logoutdeleteuser1()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
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
			obrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}


}
