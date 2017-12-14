package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
	
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	
	private NavigationHelper navigationHelper;
	private LoginHelper loginHelper;
	private PostHelper postHelper;
	
	private static ThreadLocal<ApplicationManager> app = new ThreadLocal<ApplicationManager>();

	public ApplicationManager() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Cifer/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		baseUrl = "http://www.gympad.ru";
		verificationErrors = new StringBuffer();
		navigationHelper = new NavigationHelper(this, baseUrl);
		loginHelper = new LoginHelper(this);
		postHelper = new PostHelper(this);
	}
	
	public void stop() {
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public NavigationHelper getNavigationHelper() {
		return navigationHelper;
	}


	public LoginHelper getLoginHelper() {
		return loginHelper;
	}

	public PostHelper getPostHelper() {
		return postHelper;
	}
	
}
