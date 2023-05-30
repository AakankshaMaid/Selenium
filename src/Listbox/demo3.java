package Listbox;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement result=driver.findElement(By.id("month")); 
		Select s=new Select(result);  
		//s.selectByIndex(9);
//		String s1=s.getFirstSelectedOption().getText();
//		System.out.println(s1);
		List<WebElement> text=s.getOptions();
		for(WebElement w:text)
		{
			System.out.println(w.getText());
		}
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
