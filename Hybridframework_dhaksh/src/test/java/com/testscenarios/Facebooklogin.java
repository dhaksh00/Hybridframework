package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin {
	@Test
	  public void f() {
		
		WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("9845671233");
			driver.findElement(By.id("pass")).sendKeys("1234567890");
			driver.findElement(By.name("login")).click();
	  }
}
