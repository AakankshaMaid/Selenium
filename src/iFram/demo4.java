package iFram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("");
		
		driver.switchTo().frame("");//id,name,webelement
		 driver.findElement(By.xpath("")).click();
		 
		 driver.switchTo().defaultContent();
		 driver.switchTo().parentFrame();
		 
		 driver.findElement(By.xpath("")).click();
	}

}
