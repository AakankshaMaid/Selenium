package $$Practis$$;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Yatra {
	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(op);
		driver.navigate().to("https://www.yatra.com/");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		String zoomchrome="document.body.style.zoom='75%';\r\n"
//				+ " ";
//		js.executeScript(zoomchrome);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//click on hotel tab
	WebElement holiday=	driver.findElement(By.xpath("//a[@id='booking_engine_holidays']"));
		Actions act=new Actions(driver);
		act.click(holiday).perform();
		//accept cookies
		driver.findElement(By.xpath("//button[text()='Ok,I Agree']")).click();
		
		//select from
		driver.findElement(By.xpath("//input[@id='BE_holiday_leaving_city']")).click();
		//select city
		List<WebElement> l=driver.findElements(By.xpath("//div[@class='viewport']//li"));
		String expt="Mumbai";
		for(WebElement w:l)
		{
		String actu=w.getText();
			if(expt.equals(actu))
			{
				w.click();
				break;
		}
		}
		//select to
		driver.findElement(By.xpath("//input[@id='holiday_destination_city']")).click();
		//select city
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='viewport']//li"));
		String expt1="Maldives";
		for(WebElement w:l1)
		{
		String actu1=w.getText();
			if(expt1.equals(actu1))
			{
				w.click();
				break;
		}
		}
		//click on onption
		driver.findElement(By.xpath("//span[text()='Month of Travel (Optional)']")).click();
		//select option
		driver.findElement(By.xpath("//span[text()='June 2023']")).click();
		//click on search holiday button
		driver.findElement(By.xpath("//input[@value='Search Holidays']")).click();
       //click on cancel
		
		driver.findElement(By.xpath("//a[text()='×']")).click();
		//click on view details
		driver.findElement(By.xpath("(//button[@class='btn btn-primary mt15 mb25'])[1]")).click();


	}

}
