package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper extends HelperBase {
	
	private String baseUrl;
	
	public void openHomePage() throws Exception {
		driver.get(baseUrl + "/");
	}
	
	public void getToTheDiaryAndChooseADay() throws Exception {
		driver.findElement(By.linkText("Дневник питания")).click();
	    driver.findElement(By.linkText("15")).click();
	}
	
	public NavigationHelper(ApplicationManager manager, String baseURL) {
		super(manager);
		this.baseUrl = baseURL;
	}

}
