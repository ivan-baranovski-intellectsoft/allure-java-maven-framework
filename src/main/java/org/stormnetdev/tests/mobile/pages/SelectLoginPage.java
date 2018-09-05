package org.stormnetdev.tests.mobile.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static org.stormnetdev.webdriver.WebDriverWrapper.clickOnElement;
import static org.stormnetdev.webdriver.WebDriverWrapper.waitAndfindElement;

/**
 * Class for Settings page Cirrus app.
 * @author i.baranovski
 */

public class SelectLoginPage {
	
	/**
	 * Page locators
	 */
	
   private static String signInBtnName = "Sign In";
   private static String registerBtnName = "Register";

   
	/** Verify that SelectLoginPage is displayed**/
	@Step("Verify that Settings form was loaded")
   public static void loaded() {
		waitAndfindElement(By.xpath("//*[@text=\"" + registerBtnName + "\"]"));
   }
	
	/** Login with already logged email **/
	@Step("Login with already logged email")
    public void loginWithLoggedEmail() {
		clickOnElement(waitAndfindElement(By.xpath("//*[@text=\"" + signInBtnName + "\"]")));
		LoginPage.loaded();
    }
}
