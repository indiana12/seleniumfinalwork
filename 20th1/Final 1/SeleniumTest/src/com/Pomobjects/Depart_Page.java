package com.Pomobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Depart_Page {
	
	public static WebElement element = null;
	
public static WebElement btn3(WebDriver driver) {
	element = driver.findElement(By.xpath("//input[@name='reserveFlights']"));
	return element;
}

}
