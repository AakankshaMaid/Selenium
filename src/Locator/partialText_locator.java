package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialText_locator {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("file:///C:/Velocity%20class/HTML%20examples/Locator%20example.html");
		driver.findElement(By.partialLinkText("face")).click();
	}

}
