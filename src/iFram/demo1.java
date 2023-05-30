package iFram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
public static void main(String[]args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	driver.manage().window().maximize();
	
	//switch to fram
	driver.switchTo().frame("iframeResult"); //id string value
	//driver.switchTo().frame("iframeResult");//name string value
	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\\\"iframeResult\\\"]"))); 
	
	//click on frame button
	driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
	
	//switch to main page
	driver.switchTo().defaultContent();
	//driver.switchTo().parentFrame();
	Thread.sleep(2000);
	//click on main page button
	driver.findElement(By.xpath("//a[@id=\"menuButton\"]")).click();
	
	
	
}
}
