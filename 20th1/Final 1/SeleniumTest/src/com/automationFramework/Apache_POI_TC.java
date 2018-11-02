package com.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Pomobjects.Home_Page;
import com.SelExcel.ExcelUtils;
import com.SelExcel.SeleniumWrite;

import com.appModules.Signin_Action;

public class Apache_POI_TC {

	private static WebDriver driver = null;

public static void main(String[] args) throws Exception {


	//ExcelUtils.setExcelFile(SeleniumWrite.first + SeleniumWrite.second);
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Plucky\\Desktop\\jars and files\\selenium\\chromedriver\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get(SeleniumWrite.URL);
	
	Signin_Action.Execute(driver);
	
	System.out.println("Executed successfully, thank you");
	
	driver.quit();
	
	//ExcelUtils.setCellData("Pass", 1, 3);
	
	
}

}
