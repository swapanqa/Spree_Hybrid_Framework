package com.spree_ecommerce.hybrid.cucumber.framework.testLayer;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.spree_ecommerce.hybrid.cucumber.framework.utils.PropertyReaderService;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class SikuliTest {
	

	WebDriver driver = null;
	
	@Before
	public void Setup() {
	
		ChromeDriverManager.getInstance().arch32().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to(PropertyReaderService.getInstance().getProperty("APP_URL"));
		
	}
	
	@Test
	
	public void test1() throws FindFailed {
		
		Screen screen = new Screen();
		
		Pattern loginLink = new Pattern("C:\\MyProject\\hybrid.bdd_cucumber.automation_framework\\src\\test\\resources\\screenshots\\loginLink.PNG");
		Pattern emailTextBox = new Pattern("C:\\MyProject\\hybrid.bdd_cucumber.automation_framework\\src\\test\\resources\\screenshots\\emailTextBOx.PNG");
		Pattern passwordTextBox = new Pattern("C:\\MyProject/hybrid.bdd_cucumber.automation_framework\\src\\test\\resources\\screenshots\\passwordTextBox.PNG");
	    Pattern loginButton = new Pattern("C:\\MyProject\\hybrid.bdd_cucumber.automation_framework\\src\\test\\resources\\screenshots\\loginButton.PNG");
		
		
		
		
		
		screen.wait(loginLink, 1);
		screen.click(loginLink);
		
		
		screen.type(emailTextBox, "swapanny79@yahoo.com");
		//screen.wait(emailTextBox, 1);
		
		
		screen.type(passwordTextBox,"swapan");
		//screen.wait(passwordTextBox, 1);
		
		screen.wait(loginButton,1);
		screen.click(loginButton);
		
	}

	
	
	
	
	
	
	
	
	
	
	

}
