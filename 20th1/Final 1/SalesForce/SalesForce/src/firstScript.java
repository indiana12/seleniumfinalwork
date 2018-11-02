import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class firstScript {

	public static void main(String args[]) throws InterruptedException, IOException {
		String parentWindowId = "";

		File file = new File("C:\\Users\\Spothireddy\\eclipse-workspace\\SalesForce\\excel\\"+"Salesforce.xlsx");

		FileInputStream fi = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fi);

		XSSFSheet sh = wb.getSheet("Sheet1");

		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spothireddy\\Desktop\\Training\\Testing\\chromedriver_win32\\chromedriver.exe");

		for(int i=1;i<=5;i++)
		{
			WebDriver driver = new ChromeDriver();
			Row row = sh.createRow(rowCount+i);
			driver.navigate().to("https://oeh2--ccmsdryrun.cs31.my.salesforce.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("username")).sendKeys("alex.graham@ccms.ccmsdryrun");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("password")).sendKeys("TEST@123456");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("Login")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@title='Cases']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[@title=\"New\"]")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("(//a[contains(text(),'None')])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'E-mail')]")).click();

			driver.findElement(By.xpath("(//div[@class=\"uiInput uiInputTextArea uiInput--default uiInput--textarea\"]/textarea)[1]")).sendKeys("Test");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//div[@class=\"uiInput uiInputTextArea uiInput--default uiInput--textarea\"]/textarea)[2]")).sendKeys("Test");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//div[@class=\"uiInput uiInputTextArea uiInput--default uiInput--textarea\"]/textarea)[3]")).sendKeys("Test");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//div[@class=\"uiInput uiInputTextArea uiInput--default uiInput--textarea\"]/textarea)[4]")).sendKeys("Test");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//div[@class=\"uiInput uiInputTextArea uiInput--default uiInput--textarea\"]/textarea)[5]")).sendKeys("Test");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@title='Save']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a/span[contains(text(),'Legislation')]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[@class=\"actionsContainer\"]/ul/li/a[@title='New']")).click();
			driver.findElement(By.xpath("(//a[@class='select'])[1]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@title='Prior to 25 August 2017']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//a[@class='select'])[2]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@title='Threatened Species']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//a[@class='select'])[3]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//a[@title='Threatened Species'])[2]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//a[@class='select'])[4]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@title=\"National Parks and Wildlife Act 1974\"]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//a[@class='select'])[5]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@title=\"s.45 - Provisions respecting animals in parks and sites\"]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@title='Save']")).click();
			String testCaseNo = driver.findElement(By.xpath("//h1/span")).getText();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//li[@class=\"slds-dropdown-trigger slds-dropdown-trigger--click slds-m-left--x-small\"]/button")).click();
			Thread.sleep(5000);
			String UserName = driver.findElement(By.xpath("//h1[@class='profile-card-name']/a")).getText();
			System.out.println(testCaseNo);
			System.out.println(UserName);
			parentWindowId = driver.getWindowHandle();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@title='Update Suburb']")).click();

			Thread.sleep(10000);
			Set<String> allWinIds = driver.getWindowHandles();
			int count = allWinIds.size();
			System.out.println("The child Win Id  size is "+count);
			for(String child :allWinIds ){
				System.out.println("The child Win Ids are "+child);
				if(!parentWindowId.equalsIgnoreCase(child)){
					driver.switchTo().window(child);
					driver.manage().timeouts().implicitlyWait(330, TimeUnit.SECONDS);
					driver.findElement(By.xpath("//div[@class='autocomplete-input']/input")).sendKeys("SYDNEY OLYMPIC PARK");
					Thread.sleep(10000);			   
					driver.findElement(By.xpath("(//div[@class='panel-scroll-container region-active'])[1]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("(//button[@class='button'])[40]")).click();
					Thread.sleep(45000);
					driver.findElement(By.xpath("//button[@class='wtm-button bound-visible']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//button[@class='list-menu-details']/strong[contains(text(),'Send Suburb Details')]")).click();
					Thread.sleep(15000);
					driver.findElement(By.xpath("(//div[@class='form-btns']/button[contains(text(),'OK')])[8]")).click();
					Thread.sleep(15000);
					driver.findElement(By.xpath("(//button[contains(text(),'Send')])[3]")).click();
					Thread.sleep(30000);
					driver.findElement(By.xpath("(//div[@class='form-btns']/button[contains(text(),'OK')])[8]")).click();
					Thread.sleep(15000);
					driver.switchTo().window(parentWindowId);
					break;
				}
			}
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@title=\"Assign\"]")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//button[contains(text(),'Continue To Assignment')]")).click();
			Thread.sleep(6000);
			WebElement dropdown1 = driver.findElement(By.xpath("(//div[@class=\"uiInput uiInputSelect uiInput--default uiInput--select\"]/select)[1]"));
			Select sel1 = new Select(dropdown1);
			sel1.selectByIndex(1);
			Thread.sleep(3000);
			WebElement dropdown2 = driver.findElement(By.xpath("(//div[@class=\"uiInput uiInputSelect uiInput--default uiInput--select\"]/select)[2]"));
			Select sel2 = new Select(dropdown2);
			sel2.selectByIndex(0);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=\"cCCMS_CaseAssign\"]/button)[1]")).click();
			row.createCell(0).setCellValue(UserName);

			row.createCell(1).setCellValue(testCaseNo);

			FileOutputStream outputStream = new FileOutputStream(file);

			wb.write(outputStream);

			outputStream.close();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[@class='uiImage'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
			Thread.sleep(5000);
			driver.close();
			System.out.println("Iteration "+i+" Completed.");

		}

	}
}
