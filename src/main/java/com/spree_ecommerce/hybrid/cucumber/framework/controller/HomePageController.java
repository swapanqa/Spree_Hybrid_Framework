package com.spree_ecommerce.hybrid.cucumber.framework.controller;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.spree_ecommerce.hybrid.cucumber.framework.basePage.BasePage;
import com.spree_ecommerce.hybrid.cucumber.framework.model.HomePageModel;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.DriverFactory;
import com.spree_ecommerce.hybrid.cucumber.framework.utils.PropertyReaderService;



public class HomePageController extends BasePage    {
	
	private WebDriver driver = null;
	
	public HomePageController(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void browseToTheSite() {
		
		driver.navigate().to(PropertyReaderService.getInstance().getProperty("APP_URL"));
		driver.manage().window().maximize();
	}
	
	
	
  public void goToLoginPage() {
	  
	  WebElement loginButton = driver.findElement(HomePageModel.getLoginPage());
	             loginButton.click();
	             
  }
  
  
  public void departmentBox() {
	  
	  WebElement select = driver.findElement(HomePageModel.getDepartmentBox());
	   Select s = new Select(select);
	   s.selectByVisibleText("Brand");
	   
  }
  
  public void goToBagsPage() {
	  WebElement bags = driver.findElement(HomePageModel.getBags());
	             bags.click();
	             
	  
  }
  
  public void goToMugsPage() {
	  WebElement mugs = driver.findElement(HomePageModel.getMugs());
	             mugs.click();
	             
  }
  
  public void goToClothingPage() {
	  WebElement cloth = driver.findElement(HomePageModel.getClothing());
	             cloth.click();
	             
  }
  
  public void goToRubyPage() {
	  WebElement ruby = driver.findElement(HomePageModel.getRuby());
	             ruby.click();
	             
  }
  
  public void goToApachePage() {
	  WebElement apache = driver.findElement(HomePageModel.getApache());
	             apache.click();
	             
  }
  
  public void goToSpreePage() {
	  WebElement spree = driver.findElement(HomePageModel.getSpree());
	             spree.click();
	             
  }
  
  public void goToRailsPage() {
	  WebElement rails = driver.findElement(HomePageModel.getRails());
	             rails.click();
	             
  }
  
  public void verifyHomePageTitle() {
	  
	  String title = DriverFactory.getInstance().getDriver().getTitle();
	  assertThat(title, startsWith("Spree Demo Site"));
  }
  
  public void deleteAllCookies(){
      driver.manage().deleteAllCookies();
  }
  
  public void brokenLinks(){
      List <WebElement> totalLinks = driver.findElements(HomePageModel.getHomePageLinks());
    
      List <String> activeLinks = new ArrayList<String>();

      for(int i = 0; i < totalLinks.size(); i++){
          if(totalLinks.get(i).getAttribute("href") != null){
              activeLinks.add(totalLinks.get(i).getAttribute("href"));
          }
      }
      System.out.println("total number of active links are ----->" + activeLinks.size());

      int count = 1;
      for(int j = 0; j < activeLinks.size(); j++){
          String url = activeLinks.get(j);
          try {
              HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j)).openConnection();
              connection.connect();
              String massage = connection.getResponseMessage();
              connection.disconnect();
              System.out.println(count + "--->" + url + "----->" + massage);
              count++;
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
  }

  
  
  
  
  
  
}
