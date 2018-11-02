package com.SelPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Login_Page {
	private static WebElement element = null;
	public static WebDriver driver;
	
	Random ran = new Random();
	

	void selectFlights(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath="//select[@name='passCount']")
	WebElement passCount;
	
	@FindBy(xpath="//select[@name='fromPort']")
	WebElement fromPort;
	
	@FindBy(xpath="//select[@name='fromDay']")
	WebElement fromDay;
	
	@FindBy(xpath="//select[@name='toPort']")
	WebElement toPort;
	
	@FindBy(xpath="//select[@name='toMonth']")
	WebElement toMonth;
	
	@FindBy(xpath="//select[@name='toDay']")
	WebElement toDay;
	
	@FindBy(xpath="//input[@name='findFlights']")
	WebElement findFlights;
	
	
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	public void selectFlights() {
		Select s1 = new Select(passCount);
		s1.selectByIndex(ran.nextInt(10));
		
	}
	public void selectFlights1() {
		Select s2 = new Select(fromPort);
		s2.selectByIndex(ran.nextInt(10));
	}
	public void selectFlights2() {
		Select s3 = new Select(fromDay);
		s3.selectByIndex(ran.nextInt(10));
		
	}
	public void selectFlights3() {
		Select s4 = new Select(toPort);
		s4.selectByIndex(ran.nextInt(10));
		
	}
	public void selectFlights4() {
		Select s5 = new Select(toMonth);
		s5.selectByIndex(ran.nextInt(10));
	}
	
	public void selectFlights5() {
		Select s6 = new Select(toDay);
		s6.selectByIndex(ran.nextInt(10));
	}
	public void clickLogin1() {
		findFlights.click();
	}
	public void findtoTours() {
		this.selectFlights();
		
		this.selectFlights1();
		
		this.selectFlights2();
		
		this.selectFlights3();
		
		this.selectFlights4();
		
		this.selectFlights5();
		
		this.clickLogin1();
	}
	
}
	

