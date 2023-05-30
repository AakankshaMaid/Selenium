package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllOption_method_forSingleSelectTextbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		WebElement result=driver.findElement(By.id("month"));
		
		Select s=new Select(result);
		//s.selectByVisibleText("Oct");
//		String text=s.getFirstSelectedOption().getText();
//		System.out.println(text);
		List<WebElement> data=s.getOptions();
		for(WebElement w:data)
		{
			System.out.println(w.getText());
		}
		System.out.println(data.size());
		
		
	}

}
