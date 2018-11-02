

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class salesforce {

	public static void main(String args[]) throws InterruptedException, IOException{

		String parentWindowId = "";

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Spothireddy\\\\Desktop\\\\Training\\\\Testing\\\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		File file =    new File("C:\\Users\\Spothireddy\\Desktop\\Temp"+"\\"+"Test Case Numbers.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(inputStream);
		Sheet sheet = wb.getSheet("Test Cases");
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

		driver.navigate().to("https://oeh2--ccmsdryrun.cs31.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("alex.graham@ccms.ccmsdryrun");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys("TEST@123456");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		for (int i = 0; i < rowCount+1; i++) {
			Row row = sheet.getRow(i);

			//Create a loop to print cell values in a row
			for (int j = 0; j < row.getLastCellNum(); j++) {

				BigDecimal bd = new BigDecimal(row.getCell(j).getNumericCellValue());
				String TestCase = bd.toString();
				driver.findElement(By.xpath("//a[@title='Cases']")).click();
				Thread.sleep(15000);
				WebElement TestCaseNo;
				try {
					TestCaseNo = driver.findElement(By.xpath("//a[@title='"+TestCase+"']"));
					System.out.println("Trying TestCase "+TestCase);
				}
				catch(NoSuchElementException e) {
					System.out.println("Not Found TestCase "+TestCase);
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollBy(0,500)", "");
					try {
						TestCaseNo = driver.findElement(By.xpath("//a[@title='"+TestCase+"']"));
					}
					catch(NoSuchElementException ex) {
						continue;
					}
				}
				TestCaseNo.click();
				Thread.sleep(10000);
				parentWindowId = driver.getWindowHandle();
				WebElement update;
				try {
					update = driver.findElement(By.xpath("//a[@title='Update Suburb']"));
				}
				catch(NoSuchElementException e) {
					System.out.println("No Update SubUrb found ");
					driver.findElement(By.xpath("//a[@title='Cases']")).click();
					continue;
				}

				update.click();
				Thread.sleep(20000);
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
			}
			wb.close();
		}

		driver.findElement(By.xpath("(//span[@class='uiImage'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	}
}