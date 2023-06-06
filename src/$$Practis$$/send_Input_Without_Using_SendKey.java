package $$Practis$$;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class send_Input_Without_Using_SendKey {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement ele=driver.findElement(By.xpath("//input[@id='email']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].value='Aakanksha';", ele);
	}

}
