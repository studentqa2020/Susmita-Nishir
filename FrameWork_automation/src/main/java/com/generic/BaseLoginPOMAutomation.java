package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.BaseConfig;

public class BaseLoginPOMAutomation {
public void baseLogin() {
	System.setProperty("webdriver.driver.firefox", "./Driver/geckodriver.exe");	
	WebDriver driver = new FirefoxDriver();	
	driver.get(BaseConfig.getConfigValue("Pass"));
	driver.manage().window().maximize();
	
	MasterPageFactory obj = new MasterPageFactory(driver);
	obj.getSigninBtn().click();
	obj.getEmail().sendKeys(BaseConfig.getConfigValue("User"));
	obj.getPass().sendKeys(BaseConfig.getConfigValue("Pass"));
	obj.getFinalSigninBtn().click();
	
}
}
