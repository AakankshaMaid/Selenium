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
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys(value);
		Thread.sleep(3000);
		//handleing auto suggetion
		List<WebElement> alloption=driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
	    String	exptresult="Swargate, Pune";
	    for(WebElement s1:alloption)
	    {
	    	String autualresult=s1.getText();
	    	if(exptresult.equals(autualresult))
	    	{
	    		s1.click();
	    		break;
	    	}
	    }
		
		//excel2
		FileInputStream file1=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
		String value1=WorkbookFactory.create(file1).getSheet("Sheet6").getRow(1).getCell(0).getStringCellValue();
		
		//to
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys(value1);
		Thread.sleep(3000);
		//handleing auto suggetion
		List<WebElement> alloption1=driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
	    String	exptresult1="Thane West, Mumbai";
	    for(WebElement s1:alloption1)
	    {
	    	String autualresult1=s1.getText();
	    	if(exptresult1.equals(autualresult1))
	    	{
	    		s1.click();
	    		break;
	    	}
	    }
		//date
		driver.findElement(By.xpath("//td[text()='30']")).click();
		//search
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
//		Set<String> ids=driver.getWindowHandles();
//		List<String> childids=new ArrayList(ids);
//		driver.switchTo().window(childids.get(1));
		Thread.sleep(4000);
		//cancel popup
		driver.findElement(By.xpath("//i[@class='icon-close coach-close']")).click();
		//cancel 2nd popup
		driver.findElement(By.xpath("//i[@class='icon-close coach-close']")).click();
		

		

		

	}

}
