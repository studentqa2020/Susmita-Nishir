package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	MasterPageFactory(WebDriver driver){ //to remove null pointer exception
	PageFactory.initElements(driver, this);	
	}

@FindBy(xpath = "//*[@class='login']")	
private	WebElement SigninBtn;

@FindBy(xpath = "//*[@id='email']")	
private	WebElement Email;

@FindBy(xpath = "//*[@name='passwd']")	
private	WebElement Pass;

@FindBy(xpath = "///*[@id='SubmitLogin']")	
private	WebElement FinalSigninBtn;

public WebElement getSigninBtn() {
	return SigninBtn;
}

public WebElement getEmail() {
	return Email;
}

public WebElement getPass() {
	return Pass;
}

public WebElement getFinalSigninBtn() {
	return FinalSigninBtn;
}

}
