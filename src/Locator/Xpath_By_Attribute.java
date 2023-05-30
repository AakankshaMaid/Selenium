package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//enter UN
		//driver.findElement("Locater type");
//    Formula=//tagname[@attribute name='attribute value']                   
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9145201210");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Akki@1432");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
