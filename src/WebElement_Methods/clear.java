package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//enter UN
		WebElement result =driver.findElement(By.xpath("//input[@type='text']"));
		result.sendKeys("abc");
		Thread.sleep(2000);
	//	System.out.println(result);
	   result.clear();
		Thread.sleep(2000);
	   result.sendKeys("xyz");
	//   System.out.println(result);
	   
	}

}
