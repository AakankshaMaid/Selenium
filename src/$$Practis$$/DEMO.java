package $$Practis$$;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DEMO {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		//form
	List<WebElement> allele=driver.findElements(By.xpath("//select[@id='month']"));
	
//	ArrayList<WebElement> al=new ArrayList<>(allele);
//	List<String> s3=new ArrayList(al);
//	
//	List<String> s1=new ArrayList();
//	s1.add("Jan");
//	s1.add("Feb");
//	s1.add("Mar");
//	s1.add("Apr");
		String s1[]= {"Jan","Feb","Mar","Apr"};
		
	for(WebElement w:allele)
	{

		//w.click();
	 String s2= w.getText();
	 for(int i=0;i<=s1.length-1;i++)
	 {
	 if(s2.contains(s1[i]))
	 {
		//String s= w.getText();
		System.out.println(s1[i]);
	 }
	 else
	 {
		 System.out.println("Element not present in list");
	 }
	 }
		
	}
	//System.out.println(s2.contains(s1));
	
		
	 
	

	}

}
