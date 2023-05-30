package Listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class single_select_list {
	
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.facebook.com");
			driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			
			Thread.sleep(2000);
			//step1:
			WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
			
			//step2:
			Select s=new Select(month);
			
			//step3:
		//	s.selectByVisibleText("Aug"); //String
		//	s.selectByValue("8"); //String value
			s.selectByIndex(7); //int index
		}

	}


