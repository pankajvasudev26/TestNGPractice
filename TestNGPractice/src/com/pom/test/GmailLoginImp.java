package com.pom.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.io.IOException;
import java.util.Set;
import java.util.Iterator;
import java.lang.reflect.Method;

import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Factory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Optional;

public class GmailLoginImp {
	
	WebDriver w1;
	
	
	@BeforeTest
	public void setUp() {
		String baseUrl = "https://gmail.com";
		System.setProperty("webdriver.firefox.marionette", "c://geckodriver.exe");
		w1 = new FirefoxDriver();
		w1.manage().window().maximize();
		w1.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//WebDriverWait myWaitVar = new WebDriverWait(w1,10);
		//myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xxxx")));
		
		w1.navigate().to(baseUrl);
	}
	
	@Test
	public void loginToGmail() {
		
		GmailLoginPOM objLoginPOM = new GmailLoginPOM(w1);
		
		objLoginPOM.LoginToGmail("pankajvasudev26", "9816382929");
		
		
		
		
		
	}
	

}
