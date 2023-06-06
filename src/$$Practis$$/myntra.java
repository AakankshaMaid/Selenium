package $$Practis$$;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntra {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		String s1="document.body.style.zoom='75%';\r\n"
//				+ "";
//		js.executeScript(s1);
		Dimension d=new Dimension(100,200);
		driver.manage().window().getSize();
		
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//a[text()='Studio']")); //studio btn
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		
		driver.findElement(By.xpath("//a[@class='desktop-exploreStudioBtn']")).click(); //Explore click
		
		
		driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-18u37iz\"]//img)[2]")).click(); //ethentic wear
	
	}

}
