package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("C:/Velocity%20class/HTML%20examples/select.html");
		
		WebElement result =driver.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s=new Select(result);
		s.selectByIndex(0);
		s.selectByVisibleText("Nature");
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		
		s.deselectByIndex(0);
		
		List<WebElement> text=s.getAllSelectedOptions(); 
		
		for(WebElement w:text)
		{
			System.out.println(w.getText());
		}
		
	List<WebElement> akki=	s.getOptions();
	for(WebElement d:akki)
	{
		System.out.println(d.getText());
	}
	} 
	

}
