package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_text {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();	
			
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//click to forgot PW link
		
		//for text method Formula=//tagname[text()=' text']
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		driver.navigate().back();
		
		//click on create new account link
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		
	}

}
