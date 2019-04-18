package com.spree_ecommerce.hybrid.cucumber.framework.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by Debajyoti Paul on 4/17/2018 at 5:55 PM
 */
public class ScreenShotUtils extends UtilsController {

    public ScreenShotUtils(WebDriver driver) {
        super(driver);
    }

    //Method to capture ScreenShot
    public void captureScreenShot(WebDriver driver, String ssName){
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File("./src/ScreenShots/" + ssName + ".png")); //Copying the file from "source" to our preferred "destination"
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("ScreenShot taken...");
    }

}
