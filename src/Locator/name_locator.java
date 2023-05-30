package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name_locator {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("file:///C:/Velocity%20class/HTML%20examples/Locator%20example.html");
		
		//use attribute value
		driver.findElement(By.name("xyx123")).sendKeys("abc");
	}

}
