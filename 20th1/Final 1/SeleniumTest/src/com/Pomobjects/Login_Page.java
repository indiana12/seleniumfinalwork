package com.Pomobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	public static WebElement element = null;
	
	public static WebElement btn2(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='findFlights']"));
		return element;
	}

}
