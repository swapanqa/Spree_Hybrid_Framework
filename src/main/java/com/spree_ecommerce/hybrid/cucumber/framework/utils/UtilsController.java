package com.spree_ecommerce.hybrid.cucumber.framework.utils;

import org.openqa.selenium.WebDriver;

/**
 * Created by Debajyoti Paul on 4/17/2018 at 1:23 PM
 */
public class UtilsController {

    protected WebDriver driver = null;

    public UtilsController(WebDriver driver) {
        this.driver = driver;
    }

    public JavascriptUtils javascriptUtils(){
        return new JavascriptUtils(driver);
    }

    public WebDriverUtils webDriverUtils(){
        return new WebDriverUtils(driver);
    }

    public MouseUtils mouseUtils(){
        return new MouseUtils(driver);
    }

    public WindowUtils windowUtils(){
        return new WindowUtils(driver);
    }

    public TableUtils tableUtils(){
        return new TableUtils(driver);
    }

    public ExplicitWaitUtils explicitWait(){
        return new ExplicitWaitUtils(driver);
    }

    public ScreenShotUtils screenShotUtils(){
        return new ScreenShotUtils(driver);
    }

    public SendEmailUtils sendEmailUtils(){
        return new SendEmailUtils(driver);
    }

    public LinkConnectionUtils brokenLinkUtils(){
        return new LinkConnectionUtils(driver);
    }

    public void delay(int timeInMilli){
        try {
            Thread.sleep(timeInMilli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
