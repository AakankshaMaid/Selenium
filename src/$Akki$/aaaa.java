package $Akki$;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aaaa {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//select[@id='month']/option"));
		for(WebElement w:ele)
		{
			String s=w.getText();
			System.out.println(s);
		}
		driver.quit();
		
		
	}

}
