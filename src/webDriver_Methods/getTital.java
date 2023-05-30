package webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTital {
	public static void main(String[] args) {
		//use for get title of web page 
		WebDriver driver=new ChromeDriver();  //open browser
		driver.get("https://www.facebook.com/"); //open fb tab
	    String title = driver.getTitle();
	    System.out.println(title); //print title
	}

}
