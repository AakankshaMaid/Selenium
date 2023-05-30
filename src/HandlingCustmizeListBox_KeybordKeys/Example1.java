package HandlingCustmizeListBox_KeybordKeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on creat new account tab
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//click onlistbox
		//step1:
	WebElement ele=	driver.findElement(By.id("month"));
	//step2:
	Actions act=new Actions(driver);
	//step3:
	act.click(ele).perform();
	
	//step4A:
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	//step4B
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	//step4C:
	act.sendKeys(Keys.ENTER).perform();



		
	}

}
