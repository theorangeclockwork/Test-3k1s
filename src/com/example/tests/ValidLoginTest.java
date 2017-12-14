package com.example.tests;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ValidLoginTest extends TestBase{
	
	 LoginForm validForm = new LoginForm("AlpientGould@gmail.com", "Terrabite1", "Руслан");
	 LoginForm invalidForm = new LoginForm("AlpientGould@gmail.com", "letmein", "Гонзалес");

	 @Test
	 public void doValidAuthTest() throws Exception {
		 manager.getLoginHelper().logIn(validForm);
		 Assert.assertTrue(manager.getLoginHelper().isLoggedIn(validForm));
	 }
	 
	 @Test
	 public void doInvalidAuthTest() throws Exception {
		 manager.getLoginHelper().logOut();
		 manager.getLoginHelper().logIn(invalidForm);
		 
		 Assert.assertFalse(manager.getLoginHelper().isLoggedIn());
	 }

}
