package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProductDietDestroyer extends AuthBase {
		
		@Test
		public void toLogInAndCreateProductDietAndLogOut() throws Exception {;
			manager.getNavigationHelper().getToTheDiaryAndChooseADay();
			manager.getPostHelper().deletePost();
			manager.getLoginHelper().logOut();
		}

}
