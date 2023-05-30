package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		String s1=alt.getText();
		System.out.println(s1);
		
		//alt.dismiss();
		alt.accept();
		alt.accept();

	}

}
