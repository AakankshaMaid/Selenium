package HandlingCustmizeListBox_KeybordKeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example3_select_Oct_OptionUsing_EndKey {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//step1:
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		
		//step2:
		Actions act=new Actions(driver);
		
		//step3:
		act.click(ele).perform();
		
		Thread.sleep(2000);
		
		//navigate last option using END key
		act.sendKeys(Keys.END).perform();
		
		//navigate oct option using ARROW UP key
		for(int i=1;i<=2;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		//step4:
		act.sendKeys(Keys.ENTER).perform();
	}

}
