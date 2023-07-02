package $$New_Try;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutClearMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("//input[@id='email']"));
		
		ele.sendKeys("Aakanksha");
		
		Thread.sleep(3000);
		
		ele.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		
//		Thread.sleep(3000);
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//				js.executeScript("reset().value='Aakanksha'",ele);
				
		
			
	}

}
