package $$Practis$$;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Instagram {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		 
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.manage().window().maximize();

	
	//excel
	FileInputStream file=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
	String value=WorkbookFactory.create(file).getSheet("Sheet5").getRow(0).getCell(0).getStringCellValue();
	//UN
	driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]")).sendKeys(value);

	//excel
	FileInputStream file1=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
	String value1=WorkbookFactory.create(file1).getSheet("Sheet5").getRow(1).getCell(0).getStringCellValue();
	//PW
	driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys(value1);
	
	driver.findElement(By.xpath("//div[contains(@class,'x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo')]")).click();
	//WebElement ele=driver.findElement(By.xpath("//div[text()='Not Now']"));
	//do
	//{
		
//	}
	//while(!ele.isDisplayed());
	driver.findElement(By.xpath("//div[text()='Not Now']")).click();//pop up

	driver.findElement(By.xpath("//button[text()='Not Now']")).click(); //pop up
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//String zoomchrome="document.body.style.zoom='80%'";
//js.executeScript(zoomchrome);
	
	driver.findElement(By.xpath("//a[@aria-label=\"Direct messaging - 0 new notifications link\"]")).click(); //messenger	
	
	driver.findElement(By.xpath("//span[text()='Er. 𐌀akanksha Maid🐾']")).click(); //person
	
	driver.findElement(By.xpath("//textarea[@placeholder=\"Message...\"]")).sendKeys("hello kartik"); //focus text field 
	
	driver.findElement(By.xpath("(//button[@class=\"_abl-\"])[4]")).click(); //click emoji button
	
	driver.findElement(By.xpath("//div[text()='😍']")).click(); //click emoji
	
	driver.findElement(By.xpath("//div[text()='Send']")).click(); //send msg
	
	driver.findElement(By.xpath("(//button[@class=\"_abl-\"])[6]")).click(); //send heart
	
	//take SS
	File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\Velocity class\\selenium\\SCREENSHOTS\\insta.jpg");
	
	FileHandler.copy(ss, dest);
	
	
	
	

	

	}

}
