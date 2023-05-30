package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		//1.getText from alert popup
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		
		//2.click on Cancel button on alert popup
	//	driver.switchTo().alert().dismiss();
		
		//3.click on ok button on alert popup
		driver.switchTo().alert().accept();
		
		//4.click on second on button on alert popup
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		//driver.switchTo().alert().sendKeys("hello");

	}

}
