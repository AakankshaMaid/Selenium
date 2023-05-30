package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Example2 {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scr);
		
//randomstring mathod use to add random file name for stored SS files where make() method decides length of char
		
		String RN=RandomString.make(2);
		
		//for new path File class object created
		File dest=new File("C:\\Velocity class\\selenium\\SCREENSHOTS\\image"+RN+".jpg");
		
		//for cut past image
		FileHandler.copy(scr, dest);
				
	}

}
