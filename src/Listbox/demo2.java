package Listbox;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement data=driver.findElement(By.id("month"));
		
		
		Select s1=new Select(data);
		//s1.selectByVisibleText("Oct");
	//	s1.selectByIndex(2);
		//s1.selectByValue("2");
//		String value=s1.getFirstSelectedOption().getText();
//		System.out.println(value);
       List<WebElement> list=s1.getOptions();
       ArrayList<String> l=new ArrayList();
       for(WebElement w1:list)
       {
    	  String s= w1.getText();
    	  l.add(s);
       }
      
       Collections.sort(l);
       for(	Object w:l)
       {
    	  
    	  System.out.println(w);
       }

		
		
	}

}
