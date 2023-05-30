package Scroll_Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drmo5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-200");
	}

	
}
