package iFram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {
	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		
		//shift focus from main page to fame
		
		//driver.switchTo().frame("iframeResult"); //String FeameId
		//driver.switchTo().frame("iframeResult"); //string FrameName
		//Frame WebElement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]")));
		//driver.switchTo().frame(0); //int Frame index
		
		
		
		//click on button
		driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
	}

}
