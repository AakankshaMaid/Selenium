package $$$Rivision;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demo3 {
	public static void main(String [] args) throws IOException
	 {
		 WebDriver driver=new ChromeDriver();
		  driver.get("");
		  Set<String> ids=driver.getWindowHandles();
		  ArrayList<String> al=new ArrayList(ids);
		  driver.switchTo().window(al.get(1));
		
	}
	 
}