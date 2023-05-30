package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);

		WebElement scr=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
	    WebElement dest=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	    
	    Actions act=new Actions(driver);
	    
	    act.dragAndDrop(scr, dest).perform();
	    
	  //act.moveToElement(srcEle).clickAndHold().moveToElement(destEle).release().perform();
	   


	}

}
