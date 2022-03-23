package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {
	
	//Pagename_Elementname_Elementtype
	//Create New Account WebElements
	public final By CreateNewAccount_Signup_Button = By.id("signup-link9");
	public final By CreateNewAccount_CreateAccount_Button = By.id("imgbtnSubmit");
	public final By CreateNewAccount_Name_Errormessage = By.id("nameTD");
	public final By CreateNewAccount_Name_EditBox = By.id("signup_name");
	public final By CreateNewAccount_Mobilenumber_Errormessage = By.id("mobilenoTD");
	public final By CreateNewAccount_Mobilenumber_Editbox= By.id("signup_mobileno");
	public final By CreateNewAccount_Email_Errormessage= By.id("emailTD");
	public final By CreateNewAccount_Email_EditBox= By.id("signup_email");
	public final By CreateNewAccount_Password_Errormessage = By.id("passwordTD");
	public final By CreateNewAccount_Password_EditBox= By.id("signup_password");
	public final By CreateNewAccount_Agreeterms_checkbox = By.id("checkbox");
	public final By CreateNewAccount_Agreeterms_Errormessage = By.id("tdcondition");
	//Sign in page Webelements
	public final By Signin_Signin_Label = By.id("jriTop_signin9");
	public final By Signin_Email_Editbox = By.id("txtUserName");
	public final By Signin_Email_Errormessage = By.id("MessageCaption2");
	public final By Signin_Password_Editbox = By.id("txtPasswd");
	public final By Signin_Password_Errormessage = By.id("MessageCaption3");
	public final By Signin_Captcha_Editbox = By.id("txtCaptcha");
	public final By Signin_Captcha_Errormessage = By.id("MessageCaption4");
	public final By Sigin_Signin_Button = By.id("imgbtnSignin");
	
	
	
	
			
	
			
}