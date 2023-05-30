package Actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDropDown_moveToElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//step1: Identify dropdown
		WebElement more=driver.findElement(By.xpath("(//div[@class='_28p97w'])[2]"));
		//step2: create an object of Actions class with WebDriver object as a input
		Actions act=new Actions(driver);
		//step3: call Action class methods
		act.moveToElement(more).perform();
		
		driver.findElement(By.xpath("//div[text()='24x7 Customer Care']")).click();
		
	}

}
