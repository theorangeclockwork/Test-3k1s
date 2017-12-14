package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public ApplicationManager manager;
	
	@Before
	public void SetupTest() throws Exception {
		manager = new ApplicationManager();
		manager.getNavigationHelper().openHomePage();
	}
	
	 @After
	 public void tearDown() throws Exception {
	  manager.stop();
	 }
}
