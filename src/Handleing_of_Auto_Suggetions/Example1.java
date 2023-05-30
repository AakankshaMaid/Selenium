package Handleing_of_Auto_Suggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(2000);
		
		List<WebElement> alloption=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String exptresult="redmi note 11";
		
		for(WebElement w:alloption)
		{
			String actualresult=w.getText();
			
			if(exptresult.equals(actualresult))
			{
				w.click();
				break;
			}
		}
	}

}
