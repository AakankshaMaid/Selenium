package Handle_Dynamic_WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getReviwsFromFlipkartApp {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		//click on close tab
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//enter mobile name
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 9 power");
		
		//click on search box
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//get reviews                         xpath is combination of body of webelement and child element
	String s1=	driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
	System.out.println(s1);
	
	//get ratings
	String ratings = 
	driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
	
	System.out.println(ratings);
		
		driver.close();

	}

}
