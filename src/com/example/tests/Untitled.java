package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Untitled {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Cifer/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		baseUrl = "http://www.gympad.ru";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	  public void testUntitled4() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.linkText("Войти")).click();
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("AlpientGould@gmail.com");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Terrabite1");
	    driver.findElement(By.id("login-submit")).click();
	    driver.findElement(By.linkText("Дневник питания")).click();
	    driver.findElement(By.linkText("15")).click();
	    driver.findElement(By.id("nutInput")).clear();
	    driver.findElement(By.id("nutInput")).sendKeys("Test");
	    driver.findElement(By.id("nutProtInput")).clear();
	    driver.findElement(By.id("nutProtInput")).sendKeys("15");
	    driver.findElement(By.id("nutFatInput")).clear();
	    driver.findElement(By.id("nutFatInput")).sendKeys("15");
	    driver.findElement(By.id("nutCarbInput")).clear();
	    driver.findElement(By.id("nutCarbInput")).sendKeys("15");
	    driver.findElement(By.id("nutCalInput")).clear();
	    driver.findElement(By.id("nutCalInput")).sendKeys("15");
	    driver.findElement(By.id("nutWeightInput")).clear();
	    driver.findElement(By.id("nutWeightInput")).sendKeys("15");
	    driver.findElement(By.id("nutSubmit")).click();
	    driver.findElement(By.linkText("Руслан")).click();
	    driver.findElement(By.linkText("Выход")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}
