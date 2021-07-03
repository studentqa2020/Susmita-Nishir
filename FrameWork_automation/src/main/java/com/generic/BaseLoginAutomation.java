package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.HighlighterAutomation;
import com.util.ScreenshotAutomation;

public class BaseLoginAutomation implements GmailLogin {

@Override
public void getLoginH() {
	System.setProperty("webdriver.driver.firefox", "./Driver/geckodriver.exe");	
	WebDriver driver = new FirefoxDriver();	
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	//sign in
	
	ScreenshotAutomation.getscreenshot(driver, "signinscreenshot");//screenshot
	WebElement Signin =  driver.findElement(By.xpath("//*[@class='login']"));;
	HighlighterAutomation.getcolour(driver, Signin);//highlighter
	Signin.click();
	//email
	
	ScreenshotAutomation.getscreenshot(driver, "EmailScreenshot"); //screenshot
	WebElement email =driver.findElement(By.xpath("//*[@id='email']"));
	HighlighterAutomation.getcolour(driver, email);//highlighter
	email.sendKeys("sarowerny@gmail.com");
	//pass
	WebElement pass = driver.findElement(By.xpath("//*[@name='passwd']"));
	HighlighterAutomation.getcolour(driver, pass);
	pass.sendKeys("student");
	//finalsignin
	WebElement finalsignin = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
	HighlighterAutomation.getcolour(driver, finalsignin);
	finalsignin.click();
	
	driver.quit();
}
}
