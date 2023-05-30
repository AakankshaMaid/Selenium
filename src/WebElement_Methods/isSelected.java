package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//click on create new account link
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		WebElement femaleRadioButton=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));	
		femaleRadioButton.click();
		Thread.sleep(2000);
		
	  boolean result=femaleRadioButton.isSelected();
	  System.out.println(result);
		
		
		//check female radio button selected
		//OR
//		boolean result=driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
//    	System.out.println(result);

		
		
		if(result)
		{
			System.out.println("Female radio button is selected");
		}
		else
		{
			System.out.println("Female radio button is not selected");
		}
	}

}
