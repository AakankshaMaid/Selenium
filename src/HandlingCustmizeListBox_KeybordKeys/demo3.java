package HandlingCustmizeListBox_KeybordKeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo3 {
	 public static void main(String[] args)
	 {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.facebook.com/");
	   driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	   WebElement ele= driver.findElement(By.xpath("//select[@id='day']"));
	   Actions act=new Actions(driver);
	   act.click(ele).perform();
	   act.sendKeys(Keys.HOME).perform();
	   for(int i=0;i<=6;i++)
	   {
	     act.sendKeys(Keys.ARROW_DOWN).perform();
	   }
	   act.sendKeys(Keys.ENTER).perform();
	 
	}

}
