package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement result=driver.findElement(By.id("month"));
		Select s=new Select(result);
		//s.selectByValue("8");
		
	//	String s1=s.getFirstSelectedOption().getText();
		//System.out.println(s1);
//		
		List<WebElement> w=s.getOptions();
		for(WebElement m:w)
		{
			System.out.println(m.getText());
		}
		Thread.sleep(2000);
		driver.close();
		
	}  

}
