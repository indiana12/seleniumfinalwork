package com.SelPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;


public class Book_Flights {
	private static WebElement element = null;
	public static WebDriver driver;
	
	Random ran = new Random();
	
	void selectFlights(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath="//input[@name='passFirst0']")
	WebElement passFirst;
	
	@FindBy(xpath="//input[@name='passLast0']")
	WebElement passLast;
	
	@FindBy(xpath="//select[@name='pass.0.meal']")
	WebElement passmeal;
	
	@FindBy(xpath="//input[@name='creditnumber']")
	WebElement creditnumber;
	
	@FindBy(xpath="//input[@name='cc_frst_name']")
	WebElement cc_first_name;
	
	@FindBy(xpath="//input[@name='cc_last_name']")
	WebElement cc_last_name;
	
	@FindBy(xpath="//input[@name='buyFlights']")
	WebElement buyFlights;
	
	@FindBy(xpath="//a[@href='mercurysignoff.php']")
	WebElement mercury;
	
	public Book_Flights(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
/*	public void firstName(String strpassFirst) {
		passFirst.sendKeys(strpassFirst);
	}
	public void lastName(String strpassLast) {
		passLast.sendKeys(strpassLast);

	}
	public void selectMeal() {
		Select s1 = new Select(passmeal);
		s1.selectByIndex(ran.nextInt(10));
	}
	public void card(String strcreditnumber) {
		creditnumber.sendKeys(strcreditnumber);
		
	}
	public void cc_first(String strcc_first_name) {
		cc_first_name.sendKeys(strcc_first_name);
	}
	public void cc_last(String strcc_last_name) {
		cc_last_name.sendKeys(strcc_last_name);
	}
	public void press() {
		buyFlights.click();
	}*/
	/*public void finalTask(String strpassFirst,String strpassLast,String strcreditnumber,String strcc_first_name,String strcc_last_name) {
		this.firstName(strpassFirst);
	
		this.lastName(strpassLast);
		
		this.selectMeal();
		
		this.card(strcreditnumber);
		
		this.cc_first(strcc_first_name);
		
		this.cc_last(strcc_last_name);
		
		this.press();
			
	}*/
	
	public void register(String strpassFirst,String strpassLast,String strcreditnumber,String strcc_first_name,String strcc_last_name) {
		
		passFirst.sendKeys(strpassFirst);
		passLast.sendKeys(strpassLast);
		
		Select s1 = new Select(passmeal);
		s1.selectByIndex(ran.nextInt(10));
		creditnumber.sendKeys(strcreditnumber);
		cc_first_name.sendKeys(strcc_first_name);
		cc_last_name.sendKeys(strcc_last_name);
		buyFlights.click();
	}
}
