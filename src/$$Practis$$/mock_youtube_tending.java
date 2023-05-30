package $$Practis$$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mock_youtube_tending {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@aria-label='Guide']")).click();//click menue
		WebElement ele=driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']")); //click trending tab
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(2000);

		ele.click();
		driver.findElement(By.xpath("//div[text()='Music']")).click();
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("(//div[@id='grid-container']//div)[1]")); //get letest trending 1st video text
		String s=ele1.getText();
		System.out.println(s);

	}
	

}
//(//div[@id='grid-container']//div)[1]