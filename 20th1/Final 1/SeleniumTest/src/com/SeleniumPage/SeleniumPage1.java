package com.SeleniumPage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SelPageFactory.Book_Flights;
import com.SelPageFactory.Home_Page;
import com.SelPageFactory.Login_Page;
import com.SelPageFactory.Reserve_Flights;

public class SeleniumPage1 {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Plucky\\Desktop\\jars and files\\selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://newtours.demoaut.com");
		
	}
	
	@Test
	public void test() {
		
		
		
		Home_Page home = new Home_Page(driver);
		home.logintoTours("readonly","readonly");
		Login_Page login = new Login_Page(driver);
		login.findtoTours();
		Reserve_Flights reserve = new Reserve_Flights(driver);
		reserve.reserve1();
		Book_Flights book = new Book_Flights(driver);
		
		book.register("lucky reddy","prahalad","1234","ABC","XYZ");	
		
		
	}

}
