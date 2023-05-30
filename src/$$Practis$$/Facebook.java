package $$Practis$$;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");	
		String value=WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys(value);//un
		Thread.sleep(2000);
		
		
		FileInputStream file1=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
		String value1=WorkbookFactory.create(file1).getSheet("Sheet4").getRow(1).getCell(0).getStringCellValue();
		

		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(value1); //pw
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();//login
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(@class,'x1i10hfl xjbqb8w xjqpnuy xa49m3k')])[2]")).click();//profile
		Thread.sleep(4000);
				
		//driver.findElement(By.xpath("//span[text()='Add to story']")).click();//add story
		
//		Thread.sleep(2000);
//		WebElement img=driver.findElement(By.xpath("//div[contains(@class,'x6s0dn4 xamitd3 x1jx94hy x14yjl9h xudhj91')]"));
//		img.click();
		//Thread.sleep(2000);
		//driver.navigate().back();
		Thread.sleep(2000);
		//click on mssenger
		driver.findElement(By.xpath("//div[contains(@class,'x1i10hfl x6umtig x1b1mbwd xaqea5y xav7gou x1ypdohk')]")).click();
       Thread.sleep(2000);
       //click on person chat
       driver.findElement(By.xpath("(//a[contains(@class,'x1i10hfl x1qjc9v5 xjbqb8w xjqpnuy xa49m3k xqeqjp1')])[3]")).click();
       Thread.sleep(2000);
       //click on chat button
       driver.findElement(By.xpath("//p[@class=\"xat24cr xdj266r\"]")).sendKeys("zal ka j1");
       Thread.sleep(2000);
       //click on send button
       driver.findElement(By.xpath("//div[@aria-label='Press enter to send']")).click();
		
	}

}
