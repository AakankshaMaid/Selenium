package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOption_method_forMultiSelectTextbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Velocity%20class/HTML%20examples/select.html");
		
		Thread.sleep(2000);
		
		WebElement result=driver.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s=new Select(result);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		//list webelement collection use for store the all selected webelement
		List<WebElement> text=s.getAllSelectedOptions();
		
		//for each loop is use to print all the data stored in list webelement collection object 
		for(WebElement s1:text)
		{
			System.out.println(s1.getText());
		}
		//size method use for find the size
		System.out.println(text.size());
		
		
	}

}
