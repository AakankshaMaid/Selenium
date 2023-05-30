package $Akki$;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import WebElement_Methods.getText;

public class Print_alphabetical_all_option_from_listbox {
	public static void main(String[] args) throws InterruptedException,ClassCastException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement result =driver.findElement(By.id("month"));
		Select s=new Select(result);
		
		List<WebElement> text= s.getOptions();
	
		//TreeSet list=new TreeSet();
		//List l=new ArrayList();
		ArrayList<String> l=new ArrayList();
		for(WebElement w:text)
		{
			String data=w.getText();
		  l.add(data);
	     }
		Collections.sort(l);
		for(Object k:l)
		{
			System.out.println(k);
		}
     System.out.println(l);	
		
//		Thread.sleep(2000);
//		
//        driver.close();
//		
		
		
		
		
		
		
		
		
		
	}

}
