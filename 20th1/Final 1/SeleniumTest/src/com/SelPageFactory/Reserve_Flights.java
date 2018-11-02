package com.SelPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Reserve_Flights {
	private static WebElement element = null;
	public static WebDriver driver;

	Random ran = new Random();
	
	void selectFlights(WebDriver driver){
		this.driver = driver;
	}
	
	
	@FindBys(@FindBy(xpath="//input[@name='outFlight']"))
	List <WebElement> outFlight;
	
	@FindBys(@FindBy(xpath="//input[@name='inFlight']"))
	List <WebElement> inFlight;
	
	@FindBy(xpath="//input[@name='reserveFlights']")
	WebElement reserveFlights;
	
	public Reserve_Flights(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void reserve1() {
		this.outFlight.get(ran.nextInt(this.outFlight.size())).click();
		
		this.inFlight.get(ran.nextInt(this.inFlight.size())).click();
		
		this.reserveFlights.click();
		
	}
	
	

	
	
	
}
