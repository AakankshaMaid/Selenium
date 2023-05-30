package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//enter UN
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd");
	//OR
	WebElement UN=driver.findElement(By.xpath("//input[@name='email']"));
	UN.sendKeys("abcd");
	
	
	
	
	}
}
