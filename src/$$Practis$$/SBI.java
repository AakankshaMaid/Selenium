package $$Practis$$;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SBI {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//click on SBI lones button
		WebElement btn=driver.findElement(By.xpath("//a[text()='SBI Loans']"));
		Actions act=new Actions(driver);
		act.moveToElement(btn).click().perform();	
//	act.sendKeys(Keys.END).perform();
//	Thread.sleep(2000);
//		for(int i=1;i<5;i++)
//		{
//			act.sendKeys(Keys.ARROW_DOWN).perform();
//			Thread.sleep(2000);
//
//		}
//		Thread.sleep(2000);
//		act.click().perform();
		driver.findElement(By.xpath("//a[text()='Gold Loan']")).click();
		
		//shift focus from main page to child window browser
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> childid=new ArrayList(ids); 
		driver.switchTo().window(childid.get(1));
		
		Thread.sleep(2000);
		//scroll down
		WebElement ele=driver.findElement(By.xpath("//p[@class='apply_more_btn']"));
		ele.click();
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ele);
				
	}

}
