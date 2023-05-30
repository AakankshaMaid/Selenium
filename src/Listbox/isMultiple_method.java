package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple_method {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Velocity%20class/HTML%20examples/select.html");
	
		
		Thread.sleep(2000);
		//step1:
		WebElement select=driver.findElement(By.xpath("//select[@id='123']"));
		
		Select s=new Select(select);
		
		boolean result=s.isMultiple();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("listbox is multi-selectable");
		}
		else
		{
			System.out.println("listbox is not multi-selectable");

		}


}
}
