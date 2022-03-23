package com.testscenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.GenericWrapper;

public class JRI_TS002_Signin  extends GenericWrapper {
	Locators LOC = new Locators();
	Properties prop = new Properties();	

	@BeforeClass
	public void beforeClass() {
		chromeBrowserLaunch();

	}	
	
	
  @Test
  public void TC_006() throws Exception {
		//FileInputStream file = new FileInputStream("./src/test/resources/testdata/input.properties");
		//prop.load(file);

		//driver.get(prop.getProperty("JRI_Homepage_Url"));

	}
  
  @Test
  public void TC_007_008() throws Exception {
	  
		FileInputStream file = new FileInputStream("./src/test/resources/testdata/input.properties");
		prop.load(file);
		
		driver.get(prop.getProperty("JRI_Homepage_Url"));
		clickByAnyLocator(LOC.Signin_Signin_Label);
	}
  
  
  @Test
  public void TC_009() throws Exception {
	  
	  	FileInputStream file = new FileInputStream("./src/test/resources/testdata/input.properties");
		prop.load(file);
		clearByAnyLocator(LOC.Signin_Email_Editbox);
		clearByAnyLocator(LOC.Signin_Password_Editbox);
		
		clickByAnyLocator(LOC.Sigin_Signin_Button);
		Thread.sleep(3000);
		String email = driver.findElement(LOC.Signin_Email_Errormessage).getText();
		System.out.println(email);			
		sendkeysByAnyLocator(LOC.Signin_Email_Editbox, prop.getProperty("Email_ValidInput"));
		
		clickByAnyLocator(LOC.Sigin_Signin_Button);
		Thread.sleep(3000);
		String psd = driver.findElement(LOC.Signin_Password_Errormessage).getText();
		System.out.println(psd);
		Thread.sleep(3000);
		sendkeysByAnyLocator(LOC.Signin_Password_Editbox, prop.getProperty("Password_ValidInput"));
		
		clickByAnyLocator(LOC.Sigin_Signin_Button);
		Thread.sleep(3000);
		String captcha = driver.findElement(LOC.Signin_Captcha_Errormessage).getText();
		System.out.println(captcha);
		Thread.sleep(3000);
		
		
  }
  
  
  @SuppressWarnings("resource")
@Test
  public void TC_010() throws Exception {
		FileInputStream file = new FileInputStream("./src/test/resources/testdata/input.properties");
		prop.load(file);
		
		clickByAnyLocator(LOC.Sigin_Signin_Button);
		clearByAnyLocator(LOC.Signin_Email_Editbox);
		clearByAnyLocator(LOC.Signin_Password_Editbox);
		
		sendkeysByAnyLocator(LOC.Signin_Email_Editbox, prop.getProperty("Email_ValidInput"));
		sendkeysByAnyLocator(LOC.Signin_Password_Editbox, prop.getProperty("Password_ValidInput"));
		String captchaerr = driver.findElement(LOC.Signin_Captcha_Errormessage).getText();
		System.out.println(captchaerr);
		// driver.get("https://www.justrechargeit.com/SignIn.aspx");

		Scanner s = new Scanner(System.in);
		String captcha  = s.next();
		Thread.sleep(5000);
		driver.findElement(By.id("txtCaptcha")).sendKeys(captcha);
		System.out.println(captcha);
		
		sendkeysByAnyLocator(LOC.Signin_Captcha_Editbox, captcha);
		clickByAnyLocator(LOC.Sigin_Signin_Button);
		
		
  }
  
  @AfterMethod
	public void screenshot() throws IOException

	{
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("./screenshots/test.png"));

	}

	@AfterClass

	public void afterClass() {
		driver.quit();
	}
}
