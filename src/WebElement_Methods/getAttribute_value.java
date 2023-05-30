package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute_value {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		//UN
		WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("Akki");
		String text=input.getAttribute("value");
		System.out.println(text);
		
		
		
	}

}
