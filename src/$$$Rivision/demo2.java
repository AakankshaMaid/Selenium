package $$$Rivision;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 
{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-150)");
		
		Thread.sleep(3000);
	WebElement e=driver.findElement(By.linkText("Youtube"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", e);
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		}
	
}