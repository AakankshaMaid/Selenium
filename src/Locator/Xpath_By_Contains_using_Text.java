package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Contains_using_Text {
	public static void main(String[] args) {
		
	  WebDriver driver=new ChromeDriver();
	  driver.navigate().to("https://www.facebook.com/");
	  
	  //click on forgotten PW link
	  
	  //Formula contains using text = tagname[contains(text(),'partial text')]
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	  
	  driver.navigate().back();
	  
	  //click on creat new account button
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Create ')]")).click();
	}

}
