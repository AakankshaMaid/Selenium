package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		
		Set<String> allids=driver.getWindowHandles();
		List<String> al=new ArrayList(allids);
		
		driver.switchTo().window(al.get(1));
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("//input[@value='New Window']")).click();
		
	}

}
