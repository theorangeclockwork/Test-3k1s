package com.example.tests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import com.example.tests.ApplicationManager;

public class PostHelper extends HelperBase {

	public void fillSpaces(DiaryPostForm form) throws Exception {
		driver.findElement(By.id("nutInput")).clear();
	    driver.findElement(By.id("nutInput")).sendKeys(form.name);
	    driver.findElement(By.id("nutProtInput")).clear();
	    driver.findElement(By.id("nutProtInput")).sendKeys(form.proteins);
	    driver.findElement(By.id("nutFatInput")).clear();
	    driver.findElement(By.id("nutFatInput")).sendKeys(form.fat);
	    driver.findElement(By.id("nutCarbInput")).clear();
	    driver.findElement(By.id("nutCarbInput")).sendKeys(form.carbohydrates);
	    driver.findElement(By.id("nutCalInput")).clear();
	    driver.findElement(By.id("nutCalInput")).sendKeys(form.kkal);
	    driver.findElement(By.id("nutWeightInput")).clear();
	    driver.findElement(By.id("nutWeightInput")).sendKeys(form.weight);
	}
	
	public void submitAndSave() throws Exception {
		driver.findElement(By.id("nutSubmit")).click();
	}
	
	public void deletePost() throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ббедхре мнлеп");
		String temp = r.readLine();
		System.out.println("яоюяхан");
	    driver.findElement(By.xpath("//div[@id='nutrition']/div[2]/div/div/ul/li["+temp+"]/a/i")).click();
	}

    public PostHelper(ApplicationManager manager) {
    	super(manager);
    }
	
}

