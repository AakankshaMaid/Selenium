package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Col_size_In_Row {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Velocity%20class/HTML%20examples/Table.html");
		List<WebElement> colsize=driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th"));
		int s=colsize.size();
		System.out.println(s);
	}

}
