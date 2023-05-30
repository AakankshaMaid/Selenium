package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Contains_using_Attribute {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		//Xpath By Contains using Attribute formula
		//== tagname[contains(@attibute name,'partial attribute value')
		
		//UN enter
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1')]")).sendKeys("abc");
		
		//PW enter
		driver.findElement(By.xpath(" //input[contains(@class,'_9npi')]")).sendKeys("abjsj");
		
		//click on login 
		driver.findElement(By.xpath("//button[contains(@class,'selected')]")).click();
		driver.close();
	}

}
