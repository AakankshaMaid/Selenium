package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseRightClick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//step1: find Webelement
	WebElement ele=	driver.findElement(By.xpath("//span[text()='right click me']"));
	
	//step2: create and object of action class
	Actions act=new Actions(driver);
	
	//step3: call action methods 
	
//	act.moveToElement(ele).perform();
//	act.contextClick().perform();
	//OR
	//act.moveToElement(ele).contextClick().perform();
	//OR
	act.contextClick(ele).perform();
	
	
	
	
	

	}

}
