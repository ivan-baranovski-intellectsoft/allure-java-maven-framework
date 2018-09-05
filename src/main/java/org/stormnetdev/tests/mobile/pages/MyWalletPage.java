package org.stormnetdev.tests.mobile.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static org.stormnetdev.webdriver.WebDriverWrapper.clickOnElement;
import static org.stormnetdev.webdriver.WebDriverWrapper.waitAndfindElement;

/**
 * Class for Login to email page Cirrus app.
 * @author i.baranovski
 */

public class MyWalletPage extends MainPage {

	/**
	 * Page locators
	 */

   private static String coinsLblName = "Coins";


    /** Go to coins page **/
    @Step("Go to coins page")
    public void goToCoinsPage() {
        clickOnElement(waitAndfindElement(By.xpath("//*[@text=\"" + coinsLblName + "\"]")));
        CoinsPage.loaded();
    }
}
