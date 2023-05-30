package Handling_Of_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class select_Multiple_Checkboxes {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Velocity%20class/HTML%20examples/ChechBox.html");
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(list.size());
		
		for(WebElement w:list)  //select all checkbox
		{
			w.click();
		}
		for(int i=list.size()-1;i>=0;i--) //deselect all checkbox by decending order
		{
			list.get(i).click();
			
		}
	} 

}
