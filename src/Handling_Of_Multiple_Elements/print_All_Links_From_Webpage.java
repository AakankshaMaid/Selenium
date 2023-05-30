package Handling_Of_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_All_Links_From_Webpage {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> aalLink=driver.findElements(By.xpath("//a"));
		
		System.out.println(aalLink.size());
		
		for(WebElement w:aalLink)
		{
			System.out.println(w.getText());
		}
	}

}
