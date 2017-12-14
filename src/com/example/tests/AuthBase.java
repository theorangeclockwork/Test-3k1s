package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthBase extends TestBase {
	
	private LoginForm form = new LoginForm("AlpientGould@gmail.com", "Terrabite1", "Руслан");	
	
	//private WebDriver driver;
	
	@Before	
	public void loggingIn() throws Exception {	
		manager.getLoginHelper().logIn(form);
	}
		
}
