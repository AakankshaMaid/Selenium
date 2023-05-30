package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup_SwitchToMainPage {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on new tab from main btn
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		
		Set<String> allids=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList(allids);
		
		//switch to child window from main page
		driver.switchTo().window(al.get(1)); //string id
		
		//click on training bt from child window
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		//switch to main page
		driver.switchTo().window(al.get(0));
		
		//click on new window tab
		driver.findElement(By.xpath("//input[@value='New Window']")).click();
		
	}

}
