package $$Practis$$;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//handle browser popup block or allow
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().defaultContent();
		//excel1
		FileInputStream file=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
		String value=WorkbookFactory.create(file).getSheet("Sheet6").getRow(0).getCell(0).getStringCellValue();
		//froms
		driver.findElement(By.xpath("(//input[@class='sc-bxivhb hrsLPT'])[1]")).sendKeys(value);
		Thread.sleep(3000);
		
		//excel2
		FileInputStream file1=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
		String value1=WorkbookFactory.create(file1).getSheet("Sheet6").getRow(1).getCell(0).getStringCellValue();
		
		//to
		driver.findElement(By.xpath("(//input[@class='sc-bxivhb hrsLPT'])[2]")).sendKeys(value1);
		Thread.sleep(3000);

		//date
		driver.findElement(By.xpath("//text[@class='dateText']")).click();
		Thread.sleep(2000);
		while(!driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]")).getText().contains("Aug"))
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
			Thread.sleep(2000);
		}
		
		Thread.sleep(2000);
		List<WebElement> ele=driver.findElements(By.xpath("//span/div"));
		for(WebElement w:ele)
		{
			if(w.getText().contains("10"))
			{
				w.click();
				break;
			}
			
		}
		Thread.sleep(2000);
			
				driver.quit();
		

		

		

	}

}
