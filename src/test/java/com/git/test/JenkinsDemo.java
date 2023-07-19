package com.git.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinsDemo 
{

		public void startBrowser()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			String actualTitle=driver.getTitle();
			String expectedTitle="OrangeHRMS";
			Assert.assertTrue(actualTitle.equals(expectedTitle), "No matches");
			//Assert.assertTrue(driver.getTitle().contains("Orange"),"Title does not match");
			//System.out.println();
			driver.close();
		}
	}

	
}
