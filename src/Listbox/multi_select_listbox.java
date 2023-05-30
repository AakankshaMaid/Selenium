package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multi_select_listbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Velocity%20class/HTML%20examples/select.html");
	
		
		Thread.sleep(2000);
		//step1:
		WebElement select=driver.findElement(By.xpath("//select[@id='123']"));
		
		//step2:
		Select s=new Select(select);
		
		//step3:
		s.selectByVisibleText("Food"); //String
	//	s.selectByValue("8"); //String value
		s.selectByIndex(1); //int index
		
		Thread.sleep(2000);
		
		//use deselect method for deseclect single single options
		
		//s.deselectByIndex(1);
		//s.deselectByValue("");
		s.deselectByVisibleText("Nature");
		
		Thread.sleep(2000);
		//use deselect all method
		
		s.deselectAll();

		
		
	}

}
