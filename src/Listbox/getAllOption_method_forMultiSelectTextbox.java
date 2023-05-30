package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllOption_method_forMultiSelectTextbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Velocity%20class/HTML%20examples/select.html");
		
		Thread.sleep(2000);
		
		WebElement result=driver.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s=new Select(result);
		
		//getOptions method use to print all the element present in multiSelected listbox list
		List<WebElement> text=s.getOptions();  //collection
		
		for(WebElement s1:text)
		{
			System.out.println(s1.getText());
		}
	}

}
