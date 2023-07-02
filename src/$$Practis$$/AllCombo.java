package $$Practis$$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCombo 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//radio button click
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
	
		//sendkeys
		driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("Hey,I'am Aakanksha!");
		
	}

}
