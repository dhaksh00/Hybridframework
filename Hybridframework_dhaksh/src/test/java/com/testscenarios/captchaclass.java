package com.testscenarios;

import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

public class captchaclass {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Check the JRI home page will display without errors
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

				driver.get("https://www.justrechargeit.com/SignIn.aspx");

				Scanner s = new Scanner(System.in);
				String captcha = s.next();

				Thread.sleep(5000);

				driver.findElement(By.id("txtCaptcha")).sendKeys(captcha);
				//driver.close();
				

	}

}
