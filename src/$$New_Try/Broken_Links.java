package $$New_Try;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links 
{
	public static void main(String[] args) throws IOException 
	{
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zlti.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	List<WebElement> list= driver.findElements(By.xpath("//a"));
	
	System.out.println("Total Link On Page"+ list.size());
	int respCode=200;
	int brokenlinkCount = 0;
	for(WebElement element:list)
	{
		String url=element.getAttribute("href"); //for capturing url
		
		try
		{
			URL urlLink=new URL(url);
			HttpsURLConnection huc=(HttpsURLConnection)urlLink.openConnection();
			huc.setRequestMethod("HEAD");
			huc.connect();
			respCode=huc.getResponseCode();
			
			if(respCode>=400)
			{
				System.out.println(url+ " broken link");
				brokenlinkCount++;
			}
		}
		catch(MalformedURLException e)
		{
			
		}
		catch(Exception e)
		{
			
		}
		
	}
	System.out.println("Total broken links "+brokenlinkCount);
	
	
	
	}

	
}
