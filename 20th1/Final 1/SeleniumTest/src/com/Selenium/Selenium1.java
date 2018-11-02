package com.Selenium;

import java.util.Random;


import org.openqa.selenium.By; //Path according to the xpath and by class import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver; //Import selenium web driver
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; //import chrome Driver
import org.openqa.selenium.support.ui.Select;

public class Selenium1 {
	private static WebDriver driver;
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		//set the path of chrome driver:
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prahalad\\Desktop\\eclipse\\project selenium\\chrome driver\\chromedriver.exe");
		
		//method for chrome driver
		driver=new ChromeDriver();
		
		//navigation to w3schools
		driver.navigate().to("http://www.newtours.demoaut.com");
		
		//first step is to click on my account
		//driver.findElement(By.xpath("//a[@class='account_icon']")).click();
		
		//opening the site and finding the first text element from the site
		driver.findElement(By.xpath("//input[@name='userName']")).click();
		
		//giving the username of the textfield as testuser_1
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("readonly");
		
		//finding the textfield for password and entering
		driver.findElement(By.xpath("//input[@name='password']")).click();
		
		//entering the password for the given site
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("readonly");
		
		//clicking the login button after entering the credientials
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		
		Thread.sleep(5000);
		
		/* Creating a checkbox select code */
		//Setting the random number of the function
		Random rd = new Random();
		//setting the random number to integer
		int a =rd.nextInt(4);
		//creating a method to store checkbox web elements
		WebElement wb = driver.findElement(By.xpath("//select[@name='passCount']"));
		//web element click;
		//selects the value from the checkboxes (method).
		Select s1 = new Select(wb);
		//creating a string which takes a value and converts the given string into an integer.
		String ddvalue = Integer.toString(a);
		//setting the visible task of checkbox values into the given elements.
		s1.selectByVisibleText(ddvalue);
		
		
		 
		WebElement wb1 = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select s2=new Select(wb1);
		//String ddvalue1= Integer.toString(a1); 
		s2.selectByIndex(4);//(ddvalue1);
		
		
		
		WebElement wb2 = driver.findElement(By.xpath("//select[@name='fromMonth']"));
		Select s3=new Select(wb2);
		//String ddvalue1= Integer.toString(a1); 
		s3.selectByIndex(4);//(ddvalue1);
		
		//Taking the second random function
		Random rd1 = new Random();
		int a1 = rd1.nextInt(4);
		WebElement wb3 = driver.findElement(By.xpath("//select[@name='fromDay']"));
		Select s4 = new Select(wb3);
		String ddvalue1 = Integer.toString(a1);
		s4.selectByVisibleText(ddvalue1);
		
		//Arriving Function to be declared
		WebElement wb4 = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select s5 = new Select(wb4);
		s5.selectByIndex(6);
		
		
		/*
		//Returning month
		WebElement wb5 = driver.findElement(By.xpath("//select[@name='toMonth'"));
		Select s6=new Select(wb5);
		s6.selectByIndex(1);
		
		
		//Returning date of arrival
		Random rd2 = new Random();
		int a2 = rd2.nextInt(3);
		WebElement wb6 = driver.findElement(By.xpath("//select[@name='toDay']"));
		Select s7 = new Select(wb6);
		String ddvalue2 = Integer.toString(a2);
		s7.selectByVisibleText(ddvalue2);
		
		*/
		
		//Airline Preference
		//WebElement wb7 = driver.findElement(By.xpath("//select[@name='airline']"));
		//Select s8 = new Select(wb7);
		//s8.selectByIndex(4);
		
		
		//Click continue button
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		
		
		
		Thread.sleep(2000);
		//First Radio Elements on the page of the file
		//Webdriver radio1 = driver.findElement(By.xpath("//input[@type='radio']"))
		
		//navigate to book a flight
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		
		Thread.sleep(1000);
		
		//Resgistration form 1 first name
		driver.findElement(By.xpath("//input[@name='passFirst0']")).click();
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Prahalad");
		
		//Last name of the registration
		driver.findElement(By.xpath("//input[@name='passLast0']")).click();
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Lucky");
		
		
		//selecting the type of meal
		WebElement nb1 = driver.findElement(By.xpath("//select[@name='pass.0.meal']"));
		Select ns1= new Select(nb1);
		ns1.selectByIndex(5);
		
		
		//Selecting the type of card preference
		WebElement nb2 = driver.findElement(By.xpath("//select[@name='creditCard']"));
		Select ns2 = new Select(nb2);
		ns2.selectByIndex(4);
		
		//Entering the card Number
		driver.findElement(By.xpath("//input[@name='creditnumber']")).click();
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("2323566545241");
		
		//Entering the card expiry date.
		/* WebElement nb3 = driver.findElement(By.xpath("//select[@name='cc_exp_dt_mm']"));
		Select ns3 = new Select(nb3);
		ns3.selectByIndex(4);
		
		//Entering the card details of year
		WebElement nb4 = driver.findElement(By.xpath("//select[@name='cc_exp-dt-mn']"));
		Select ns4 = new Select(nb4);
		ns4.selectByIndex(5); */
		
		//Billing Address
		driver.findElement(By.xpath("//input[@name='billAddress2']")).click();
		driver.findElement(By.xpath("//input[@name='billAddress2']")).sendKeys("2-2-1133/5/8,New Nallakunta,Hyd");
		
		//Select Country of Billing Address
		WebElement nb3 = driver.findElement(By.xpath("//select[@name='billCountry']"));
		Select ns3 = new Select(nb3);
		ns3.selectByIndex(5);
		
		//Delivery Address
		driver.findElement(By.xpath("//input[@name='delAddress2']")).click();
		driver.findElement(By.xpath("//input[@name='delAddress2']")).sendKeys("1-2-343/B,Domalguda");
		
		//Select Country of Deleivery Address
		//WebElement nb4 = driver.findElement(By.xpath("//select[@name='delCountry']"));
		//Select ns4 = new Select(nb4);
		//ns4.selectByIndex(5);
		
		//Secure Purchase
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		
		
		//Logout of the page
		driver.findElement(By.linkText("LOG OUT")).click();
		
		
		
		
		System.out.println("opened the browser");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
		
	}

	