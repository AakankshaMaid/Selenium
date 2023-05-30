package Scroll_Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		//scroll down
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		//scroll up
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-150)");
		//scroll right
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");
//		//scroll left
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(-200,0)");
	}

}
