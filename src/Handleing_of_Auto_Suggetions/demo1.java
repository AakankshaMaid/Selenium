package Handleing_of_Auto_Suggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("car");
		Thread.sleep(2000);
		
		List<WebElement> alldata=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String exp="cartoon";
		for(WebElement w:alldata)
		{
			String actu=w.getText();
			
			if(exp.equals(actu))
			{
				w.click();
				break;
			}
			
		}
	}

}
