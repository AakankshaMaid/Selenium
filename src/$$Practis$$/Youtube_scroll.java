package $$Practis$$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_scroll {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//yt-icon[@icon='yt-icons:menu']")).click();
		WebElement ele=driver.findElement(By.xpath("//div[@id='copyright']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollByView(true);", ele);
	}

}
//div[@id='copyright']