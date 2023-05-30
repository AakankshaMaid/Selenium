package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRowSize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Velocity%20class/HTML%20examples/Table.html");
		
		List<WebElement> allRowsize=driver.findElements(By.xpath("//table//tr"));
		int rwsize=allRowsize.size();
		System.out.println(rwsize);
	}

}
