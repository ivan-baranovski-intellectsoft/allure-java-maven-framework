package org.stormnetdev.tests.mobile.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static org.stormnetdev.webdriver.WebDriverWrapper.*;

/**
 * Class for Folder page Cirrus app.
 * @author i.baranovski
 */

public class MainPage {

	/**
	 * Page locators
	 */
	
	private static String searchFieldId = "com.alibaba.aliexpresshd:id/floating_search_view";
	private static String profileImageId = "com.alibaba.aliexpresshd:id/profile_image";

  	/** Verify that Folder form is displayed**/

  	@Step("Verify that Main form was loaded")
   public static void loaded() {
	   waitInvisible(By.id("com.alibaba.aliexpresshd:id/iv_logo"));
	   waitForElementLong(By.id(searchFieldId));
   }

	/** Verify that selected in menu page is displayed**/

	@Step("Verify that selected in menu page is displayed")
	public void loadedPage(String name) {
		waitForElementLong(By.xpath("//*[@text=\"" + name + "\"]"));
	}

 	/** Go to Menu page **/

	@Step("Go to Menu Form")
	protected void goToMenuForm() {
		swipeXAxis(1, 99);
	}

	/** Go to selected in menu page **/

	@Step("Go to {pageName} page")
	public void goToPage(String pageName) {
		goToMenuForm();
		clickOnElement(waitAndfindElement(By.xpath("//*[@text=\"" + pageName + "\"]")));
		loadedPage(pageName);
	}

	/** Go to folder Login page **/

	@Step("Go to Login page")
	public void goToLoginPage() {
		goToMenuForm();
		clickOnElement(waitAndfindElement(By.id(profileImageId)));
		SelectLoginPage.loaded();
	}
}
