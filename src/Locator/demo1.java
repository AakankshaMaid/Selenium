package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver ();
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement UN=driver.findElement(By.xpath("//input[@name='username']"));  //UN
		UN.sendKeys("aapla_kartik");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akki@1432"); //PW
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();  //login
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Not Now']")).click();
	

		
		
		
		
	}

}
