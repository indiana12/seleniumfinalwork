package com.appModules;

import org.openqa.selenium.WebDriver;

import com.Pomobjects.Home_Page;
import com.Pomobjects.Login_Page;

import com.SelExcel.ExcelUtils;

public class Signin_Action {
	public static void Execute(WebDriver driver) throws Exception{
		 
		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

		String sUserName = ExcelUtils.getCellData(1, 1);

		String sPassword = ExcelUtils.getCellData(1, 2);
		
		
		System.out.println("sUserName "+sUserName);
		System.out.println("sPassword "+sPassword);


		Home_Page.text_feild1(driver).sendKeys(sUserName);

		Home_Page.text_feild2(driver).sendKeys(sPassword);

		Home_Page.btn1(driver).click();

    }

}
