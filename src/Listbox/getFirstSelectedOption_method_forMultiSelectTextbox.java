package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOption_method_forMultiSelectTextbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Velocity%20class/HTML%20examples/select.html");
		Thread.sleep(2000);
		
		WebElement result=driver.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s=new Select(result);
		
		s.selectByIndex(2);
		s.selectByVisibleText("Nature");
		s.selectByIndex(3);
		//in multi selected text box it shows index number wise first value not which we select first
		String text=s.getFirstSelectedOption().getText(); 
		
		System.out.println(text);
		
	}

}
