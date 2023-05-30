package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement result=driver.findElement(By.id("twotabsearchtextbox"));
		result.sendKeys("shoses");
		Thread.sleep(2000);
		WebElement clk=driver.findElement(By.xpath("//span[text()='campus shoes for men']"));
		clk.click();
	  
		Thread.sleep(2000);
		WebElement dis=driver.findElement(By.xpath("(//img[contains(@class,'_bGlmZ_image_1pfbQ')])[2]"));
		boolean d=dis.isDisplayed();
		System.out.println(d);
		WebElement scroll=driver.findElement(By.xpath("//span[@class='a-truncate-full']"));
		scroll.click();
		
		Actions action=new Actions(driver);
		
	
		WebElement from=driver.findElement(By.id("draggable"));
	
		WebElement to=driver.findElement(By.id("dropable"));
		
		action.dragAndDrop(from, to).perform();
		
		Thread.sleep(2000);
		WebElement abc=driver.findElement(By.xpath("//a[contains(@class,'Overlay__overlay__LloCU')]"));

		abc.click();
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	}

	private static void executeScript(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
