package com.Pomobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flights_Page {
	public static WebElement element = null;
	
	public static WebElement passFirst(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@name='passFirst0']"));
		return element;
	}
	
	public static WebElement passLast(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@name='passLast0']"));
		return element;
	}
	
	public static WebElement cardNumber(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@name='creditnumber']"));
		return element;
	}
	
	public static WebElement billAddress(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@name='billAddress2']"));
		return element;
	}
	
	public static WebElement delAddress(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@name='delAddress2']"));
		return element;
	}
	
	public static WebElement secure(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@name='billAddress2']"));
		return element;
	}
}
