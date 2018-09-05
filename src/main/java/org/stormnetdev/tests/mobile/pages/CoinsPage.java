package org.stormnetdev.tests.mobile.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static org.stormnetdev.webdriver.WebDriverWrapper.*;

/**
 * Class for Login to email page Cirrus app.
 * @author i.baranovski
 */

public class CoinsPage {
	
	/**
	 * Page locators
	 */

   private static String coinsCountLblId = "com.alibaba.aliexpresshd:id/tv_coins_count";
   private static String oneCentLblName = "FOR US $0.01";
   private static String tomorrowPageLblName = "picks with US $0.01";
   private static String viewMoreLblName = "View More";

  	/** Verify that CoinsPage is displayed**/

    @Step("Verify that CoinsPage was loaded")
   public static void loaded() {
       waitForElement(By.id(coinsCountLblId));
   }

    /** Open 0.01$ tomorrow page**/

    @Step("Open 0.01$ tomorrow page")
    public void openDiscountPage() {
        swipeYAxis(90, 20, 0.5);
        swipeYAxis(90, 20, 0.5);
        swipeYAxis(90, 20, 0.5);
        sleep(2);
        clickOnElement(waitAndfindElement(By.xpath("//*[@text='FOR US $0.01']")));
        swipeYAxis(30, 60, 0.5);
        sleep(1);
        waitForElement(By.xpath("//android.widget.TextView[contains(@text,'" + tomorrowPageLblName + "')]"));
        clickOnElement(waitAndfindElement(By.xpath("//*[@text=\"" + viewMoreLblName + "\"]")));
        ProductsPage.loaded();
    }
}
