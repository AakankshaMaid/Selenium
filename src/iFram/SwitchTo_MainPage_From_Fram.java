package iFram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_MainPage_From_Fram {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		
		//switch to frame	
		driver.switchTo().frame("iframeResult");
		
		//click on click me button in frame
		driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
		
		Thread.sleep(2000);
		
		//Switch mainPage from Frame
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		//click on main page element
		driver.findElement(By.xpath("//a[@id=\"menuButton\"]")).click();
		
	}

}
