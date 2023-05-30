package HandlingCustmizeListBox_KeybordKeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement ele= driver.findElement(By.xpath("//input[@name='firstname']"));
		Actions act=new Actions(driver);
		act.click(ele).perform();
		act.sendKeys(Keys.NUMPAD1).sendKeys(Keys.NUMPAD2).sendKeys(Keys.NUMPAD3). perform();
		act.sendKeys(Keys.ENTER).perform();
	}

}
