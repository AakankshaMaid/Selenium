package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_using_Index {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		//click on create new account
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//enter First Name
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Akki");
		//enter surname
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("M");
		//enter mob no
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9423016510");
	
	
		
	}

}
