package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_locator {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("file:///C:/Velocity%20class/HTML%20examples/Locator%20example.html");
		
		//use link text
		driver.findElement(By.linkText("facebook")).click();
	}

}
