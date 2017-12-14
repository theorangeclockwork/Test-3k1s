package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProductDietCreator extends AuthBase {
	
	DiaryPostForm diaryPostForm = new DiaryPostForm("—≈√ŒƒÕﬂ «Œ∆ «¿¬“–¿ Ã¿ —  Œ–∆", "20", "21", "22", "23", "24");	
	
	@Test
	public void toLogInAndCreateProductDietAndLogOut() throws Exception {
		manager.getNavigationHelper().openHomePage();	
		manager.getNavigationHelper().getToTheDiaryAndChooseADay();
		manager.getPostHelper().fillSpaces(diaryPostForm);
		manager.getPostHelper().submitAndSave();
		manager.getLoginHelper().logOut();
	}

}
