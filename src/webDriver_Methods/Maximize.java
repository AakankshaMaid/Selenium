package webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {                  //this is an exception
	                                     //throw is keyword
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000); //this method is use to wait in webpage
		
		driver.manage().window().maximize();
		
	//   OR
//		Options s1=driver.manage();-->step1
//		Window s2=s1.window();---->step2
//		s2.maximize();--->step3
	}

}
