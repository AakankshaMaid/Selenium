package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demo5 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	File scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    File dest=new File("C:\\Velocity class\\selenium\\SCREENSHOTS\\aaa.jpg");
    
    FileHandler.copy(scr, dest);

}
}
