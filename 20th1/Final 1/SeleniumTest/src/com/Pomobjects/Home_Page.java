package com.Pomobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	private static WebElement element = null;
	
	
	public static WebElement text_feild1(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='userName']"));
		return element;
	}
	
	public static WebElement text_feild2(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='password']"));
		return element;
	}
	
	public static WebElement btn1(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='login']")); 
		return element;
	}

}
