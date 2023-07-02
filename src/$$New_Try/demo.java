package $$New_Try;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.zlti.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int respcode=200;
		int bcount=0;
		for(WebElement w:links)
		{
			String url=w.getAttribute("href");
			
			try
			{
				URL urllink=new URL(url);
				HttpsURLConnection huc=(HttpsURLConnection)urllink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
			respcode=huc.getResponseCode();
				
			}
			catch(MalformedURLException m)
			{
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			if(respcode>=400)
			{
				System.out.println("link is broken="+url);
				bcount++;
			}
			
		}
		System.out.println("broken link count="+bcount);
	}

}
