package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup_SwitchToChildWindow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on "new tab" from main page
		driver.findElement(By.xpath("//input[@name=\"NewTab\"]")).click();
		
		//to get child window ID
		Set<String> allids=driver.getWindowHandles();
		//to get both main page and child window IDs
		ArrayList<String> al=new ArrayList<String>(allids);
		
	//	String childwindowid=al.get(1);
	//	driver.switchTo().window(childwindowid);
//          OR		
		//for switch main page to child window
		driver.switchTo().window(al.get(1));
		
		//click on training link on child window
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
	}

}
