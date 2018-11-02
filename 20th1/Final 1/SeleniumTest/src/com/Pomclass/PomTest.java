package com.Pomclass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//POM Object Classes
import com.Pomobjects.Home_Page;
import com.Pomobjects.Login_Page;
import com.Pomobjects.Depart_Page;
import com.Pomobjects.Flights_Page;



public class PomTest {
	
	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Plucky\\Desktop\\jars and files\\selenium\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.navigate().to("http://www.newtours.demoaut.com");
		
		//Use Objects from the package and library
		Home_Page.text_feild1(driver).click();
		
		Home_Page.text_feild1(driver).sendKeys("readonly");
		
		
		Home_Page.text_feild2(driver).sendKeys("readonly");
		
		Home_Page.btn1(driver).click();
		
		Thread.sleep(3000);
		
		Login_Page.btn2(driver).click();
		
		Depart_Page.btn3(driver).click();
		
		Flights_Page.passFirst(driver).sendKeys("Prahalad");
		
		Flights_Page.passLast(driver).sendKeys("Lucky");
		
		Flights_Page.cardNumber(driver).sendKeys("243433443498834");
		
		Flights_Page.billAddress(driver).sendKeys("2-2-1133/5/8,New Nallakunta,Hyd-44");
		
		Flights_Page.delAddress(driver).sendKeys("1-2-343/B, Domalguda");
		
		Flights_Page.secure(driver).click();
		
		System.out.println("Automation Successful, Thank U!!!");
		//driver.quit();
		
		
	}

}
