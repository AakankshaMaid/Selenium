package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {
	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
