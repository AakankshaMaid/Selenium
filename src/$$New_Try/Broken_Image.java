package $$New_Try;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Image 
{
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		
		List<WebElement> links=driver.findElements(By.xpath("//img"));
		System.out.println("all images count is: "+links.size());
		int respcode=200;
		int brokenImgCount=0;
		for(WebElement ele:links)
		{
			String url=ele.getAttribute("src");
			
			try
			{
				URL urlLinks=new URL(url);
				HttpsURLConnection huc=(HttpsURLConnection)urlLinks.openConnection();
				huc.setRequestMethod("GET");
				huc.connect();
				respcode=huc.getResponseCode();
				
				if(respcode>=400)
				{
					System.out.println("broken images: "+url);
					brokenImgCount++;
				}
				
				
			}
			catch(MalformedURLException e)
			{
				
			}
		}
		System.out.println("brokenImgCount is: "+brokenImgCount);
		Thread.sleep(2000);
		driver.quit();
	}

}
