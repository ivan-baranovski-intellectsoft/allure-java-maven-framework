package org.stormnetdev.tests.mobile.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static org.stormnetdev.webdriver.WebDriverWrapper.waitForElement;

/**
 * Class for Login to email page Cirrus app.
 * @author i.baranovski
 */

public class ProfilePage extends MainPage {
	
	/**
	 * Page locators
	 */

   private static String profileInfoLblId = "com.alibaba.aliexpresshd:id/profile_text_info";

  	/** Verify that LoginToEmailForm is displayed**/
	@Step("Verify that ProfilePage was loaded")
   public static void loaded() {
       waitForElement(By.id(profileInfoLblId));
   }
}
