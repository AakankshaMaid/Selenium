package Scroll_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_In_To_View {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	WebElement terms=driver.findElement(By.xpath("//a[text()='Terms']"));
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",terms);
	}

}
