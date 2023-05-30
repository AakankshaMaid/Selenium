package $$Practis$$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"tabsCircle appendRight5\"])[2]")).click();//click round trip
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Armed Forces ']")).click(); //click on armed forces button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='From']")).click(); //click on from button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click(); //click city
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='To']")).click(); //click on to button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@id=\"react-autowhatever-1-section-0-item-2\"]")).click(); //click city
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label=\"Sat May 13 2023\"]")).click(); //select start date
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='Return']")).click(); //click return button
//		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[text()='6'])[2]")).click(); //select return date


		}

}
