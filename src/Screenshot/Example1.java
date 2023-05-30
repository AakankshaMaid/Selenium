package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example1 {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//step1: take screenshot
		//        upcasting with takesScreenshot interface
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scr);
		
		//step2: move file into another location
		//                                                        here abc=file name & jpg=file type 
		File dest=new File("C:\\Velocity class\\selenium\\SCREENSHOTS\\abc.jpg");
		
		//step3: for cut past
		
		//className.methodName(pathOfSource,pathOfDestination)
       FileHandler.copy(scr, dest);
       
		
		
		
	}

}
