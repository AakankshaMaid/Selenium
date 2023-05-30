package iFram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("");
		
		driver.switchTo().frame("");
		
		driver.findElement(By.xpath(""));
		driver.switchTo().defaultContent();
		
	}

}
