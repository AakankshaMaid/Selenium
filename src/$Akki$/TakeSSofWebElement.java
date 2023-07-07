package $Akki$;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeSSofWebElement 
{
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aakan\\Downloads");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	File scr=ele.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\aakan\\OneDrive\\Documents\\AakkiM\\img.jpg");
	FileHandler.copy(scr, des);
		
		
				
	}

}
