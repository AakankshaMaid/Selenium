package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOption_method_forSingleSelectTextbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(2000);
		WebElement result=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(result);
		
		String s1=s.getFirstSelectedOption().getText();
		System.out.println(s1);
//		
//		WebElement text=s.getFirstSelectedOption();
//			String s1=text.getText();
//			System.out.println(s1);
	}

}
