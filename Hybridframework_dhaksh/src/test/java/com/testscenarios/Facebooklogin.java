package com.testscenarios;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.utilities.GenericWrapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin extends GenericWrapper{ 
	

	@Test
	public void f() throws Exception {

		chromeBrowserLaunch();
		driver.get("https://www.facebook.com/");
		sendkeysByAnyLocator(By.id("email"), "9845671233");
		sendkeysByAnyLocator(By.id("pass"), "1234567890");
		clickByAnyLocator(By.name("login"));
			
	
	}

	@AfterMethod
	public void screenshot() throws IOException

	{
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("./screenshots/test.png"));

	}

}
