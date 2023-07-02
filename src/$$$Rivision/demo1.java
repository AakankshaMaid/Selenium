package $$$Rivision;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("");
		 WebElement ele=driver.findElement(By.xpath(""));
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200)");
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ele);


		
		
		
		
		
		
		
		
		
	}
 

}
