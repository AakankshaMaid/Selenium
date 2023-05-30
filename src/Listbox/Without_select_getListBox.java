package Listbox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//print list without select R K
public class Without_select_getListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='month']")).click();

		
		List<String> s1=new ArrayList<String>();
	
		List <WebElement> ele=driver.findElements(By.xpath("//select[@id='month']/option"));
		for(WebElement w:ele)
		{
			
		s1.add(w.getText());
		}
		Collections.sort(s1);

		System.out.print(s1);
		
	
	}

}