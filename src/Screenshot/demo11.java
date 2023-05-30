package Screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class demo11 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String RN=RandomString.make(2);
		String s1=RandomString.make(1);
		String s2=RandomString.make(0);
		String s3=RandomString.make(8);
		String s4=RandomString.make(5);
		String s5=RandomString.make(9);
		String s6=RandomString.make(3);
		String s7=RandomString.make(10);
		String s8=RandomString.make(3);
		String s9=RandomString.make(41);
		String s10=RandomString.make(0);
		
		
		
		File dest=new File("C:\\Velocity class\\selenium\\SCREENSHOTS\\i"+s7+"ma.jpg") ;
		FileHandler.copy(scr,dest);
		
		
	}

}
