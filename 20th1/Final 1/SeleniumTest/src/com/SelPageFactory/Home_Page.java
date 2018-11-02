package com.SelPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class Home_Page {
	
	private static WebElement element = null;
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement txt1;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt2;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement btn1;
	
	public Home_Page(WebDriver driver) {
		
		this.driver = driver;
		//This init elements will create all web elements
		
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String strUserName) {
		txt1.sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword) {
		txt2.sendKeys(strPassword);
	}
	
	public void clickLogin() {
		btn1.click();
	}
	
	public void logintoTours(String strUserName, String strPassword) {
		
		this.setUserName(strUserName);
		
		this.setPassword(strPassword);
		
		this.clickLogin();
	}
}
