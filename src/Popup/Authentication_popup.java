package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Timeouts wait = driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		String username="admin";
		String pw="admin";
		Thread.sleep(3000);
		String URL=wait+"http://" +username+":"+wait+pw+"@"+wait+"the-internet.herokuapp.com/basic_auth";
		driver.get(URL);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//get title
		String title=driver.getTitle();
		System.out.println(title);
		//get text
		String text=driver.findElement(By.tagName("p")).getText();
		System.out.println("Text present in page is: "+text);
		
		//
	}

}
