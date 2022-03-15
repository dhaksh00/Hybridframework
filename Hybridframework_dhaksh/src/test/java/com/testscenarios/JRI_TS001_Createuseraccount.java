package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.GenericWrapper;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class JRI_TS001_Createuseraccount extends GenericWrapper {
	Locators LOC = new Locators();
	Properties prop = new Properties();	

	@BeforeClass
	public void beforeClass() {
		chromeBrowserLaunch();

	}

	@Test
	public void TC_004() throws Exception {

		// Getting vlaues from property file
		FileInputStream file = new FileInputStream("./src/test/resources/testdata/input.properties");	
		prop.load(file);

		driver.get(prop.getProperty("JRI_Signup_Url"));
		// For Name Textbox
		clickByAnyLocator(LOC.CreateNewAccount_CreateAccount_Button);
		//Thread.sleep(5000);
		String textname = driver.findElement(LOC.CreateNewAccount_Name_Errormessage).getText();
		System.out.println(textname);
		sendkeysByAnyLocator(LOC.CreateNewAccount_Name_EditBox, prop.getProperty("Name_InvalidInput"));
		clickByAnyLocator(LOC.CreateNewAccount_CreateAccount_Button);
		//Thread.sleep(5000);
		// String msg = driver.findElement(LOC.CreateNewAccount_Name_EditBox).getText();
		// System.out.println(msg);
		String err = driver.findElement(LOC.CreateNewAccount_Name_Errormessage).getText();
		System.out.println(err);
		//Thread.sleep(5000);
		sendkeysByAnyLocator(LOC.CreateNewAccount_Name_EditBox, prop.getProperty("Name_ValidInput"));

		// For Mobile number Textbox
		clickByAnyLocator(LOC.CreateNewAccount_CreateAccount_Button);
		//Thread.sleep(5000);
		String mobile = driver.findElement(LOC.CreateNewAccount_Mobilenumber_Errormessage).getText();
		System.out.println(mobile);
		sendkeysByAnyLocator(LOC.CreateNewAccount_Mobilenumber_Editbox, prop.getProperty("Mobile_InvalidInput"));
		clickByAnyLocator(LOC.CreateNewAccount_CreateAccount_Button);
		//Thread.sleep(5000);

		String errmobile = driver.findElement(LOC.CreateNewAccount_Mobilenumber_Errormessage).getText();
		System.out.println(errmobile);
		//Thread.sleep(5000);
		sendkeysByAnyLocator(LOC.CreateNewAccount_Mobilenumber_Editbox, prop.getProperty("Mobile_ValidInput"));

		// For Email Textbox
		clickByAnyLocator(LOC.CreateNewAccount_CreateAccount_Button);
		//Thread.sleep(5000);
		String Email = driver.findElement(LOC.CreateNewAccount_Email_Errormessage).getText();
		System.out.println(Email);
		sendkeysByAnyLocator(LOC.CreateNewAccount_Email_EditBox, prop.getProperty("Email_InvalidInput"));
		clickByAnyLocator(LOC.CreateNewAccount_CreateAccount_Button);
		//Thread.sleep(5000);

		String erremail = driver.findElement(LOC.CreateNewAccount_Email_Errormessage).getText();
		System.out.println(erremail);
		//Thread.sleep(5000);
		sendkeysByAnyLocator(LOC.CreateNewAccount_Email_EditBox, prop.getProperty("Email_ValidInput"));
		
		// For Password Textbox
		clickByAnyLocator(LOC.CreateNewAccount_CreateAccount_Button);
		//Thread.sleep(5000);
		String pswd = driver.findElement(LOC.CreateNewAccount_Password_Errormessage).getText();
		System.out.println(pswd);
		sendkeysByAnyLocator(LOC.CreateNewAccount_Password_EditBox, prop.getProperty("Password_InvalidInput"));
		clickByAnyLocator(LOC.CreateNewAccount_CreateAccount_Button);
		//Thread.sleep(5000);		
		String errpwd = driver.findElement(LOC.CreateNewAccount_Password_Errormessage).getText();
		System.out.println(errpwd);
		//Thread.sleep(5000);
		sendkeysByAnyLocator(LOC.CreateNewAccount_Password_EditBox, prop.getProperty("Password_ValidInput"));
		
		
		// For Checkbox
		clickByAnyLocator(LOC.CreateNewAccount_CreateAccount_Button);
		Thread.sleep(5000);
		String chkbox = driver.findElement(LOC.CreateNewAccount_Agreeterms_Errormessage).getText();
		System.out.println(chkbox);
		clickByAnyLocator(LOC.CreateNewAccount_CreateAccount_Button);		

	
	}

	@Test
	public void TC_005() throws Exception {
		// Check the user will able to Create an account with valid data
		
		clearByAnyLocator(LOC.CreateNewAccount_Name_EditBox);
		clearByAnyLocator(LOC.CreateNewAccount_Mobilenumber_Editbox);
		clearByAnyLocator(LOC.CreateNewAccount_Email_EditBox);
		clearByAnyLocator(LOC.CreateNewAccount_Password_EditBox);
		
		
		FileInputStream file = new FileInputStream("./src/test/resources/testdata/input.properties");
		
		prop.load(file);
		
		
		sendkeysByAnyLocator(LOC.CreateNewAccount_Name_EditBox, prop.getProperty("Name_ValidInput"));
		sendkeysByAnyLocator(LOC.CreateNewAccount_Mobilenumber_Editbox, prop.getProperty("Mobile_ValidInput"));
		sendkeysByAnyLocator(LOC.CreateNewAccount_Email_EditBox, prop.getProperty("Email_ValidInput"));
		sendkeysByAnyLocator(LOC.CreateNewAccount_Password_EditBox, prop.getProperty("Password_ValidInput"));
		clickByAnyLocator(LOC.CreateNewAccount_Agreeterms_checkbox);
	
		clickByAnyLocator(LOC.CreateNewAccount_CreateAccount_Button);
		
		
		

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
