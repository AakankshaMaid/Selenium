package Scroll_Page;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_UP_Down {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//scroll down:-> 1st parameter=0 , 2nd parameter:->+ve
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
		
		Thread.sleep(2000);
		
		//scroll up:-> 1st parameter=0 , 2nd parameter:->-ve
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
		
		//scroll right:-> 1st parameter= +ve , 2nd parameter:->0
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");
//
//		//scroll left:-> 1st parameter= -ve , 2nd parameter:->0
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(-50,0)");

		
				
		
		
		
	}
	

}
