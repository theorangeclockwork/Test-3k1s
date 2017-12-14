package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHelper extends HelperBase {
	
	public LoginHelper(ApplicationManager manager) {
		super(manager);
	}
	
	public void logIn(LoginForm form) throws Exception {
		if (isLoggedIn() == false) {
		Thread.sleep(1000);
		driver.findElement(By.linkText("Войти")).click();
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys(form.login);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(form.password);
	    driver.findElement(By.id("login-submit")).click();
		} else if (isLoggedIn(form) == false) {
			logOut();
			logIn(form);
		}
	}
	
	public void logOut() throws Exception {
		Thread.sleep(2000);
		if (isLoggedIn()) {
	    driver.findElement(By.linkText(getLoggedUserName())).click();
	    driver.findElement(By.linkText("Выход")).click();
			}
	}
	
	public boolean isLoggedIn() throws Exception {
		Thread.sleep(300);
		return !isElementPresent(By.linkText("Войти"));
	}
	
	public String getLoggedUserName() {
		String text = driver.findElement(By.xpath("//*[@class='hidden-xs']")).getText();
		System.out.println(text);
		return text;
	}
	
	public boolean isLoggedIn(LoginForm form) throws Exception {
		try {
		return (isLoggedIn() && (getLoggedUserName().equals(form.getUsername())));
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	

}