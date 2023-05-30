package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		//UN
		WebElement text=driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1')]"));
	    text.sendKeys("Akki");
	   String s1= text.getAttribute("value");
	   System.out.println(s1);
	    
		
	}

}
