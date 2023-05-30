package webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
				driver.navigate().to("https://www.facebook.com/");
				driver.navigate().back();
				driver.navigate().forward();
				driver.manage().window().maximize();
				driver.navigate().refresh();
				String url=driver.getCurrentUrl();
				System.out.println(url);
				String title=driver.getTitle();
				System.out.println(title);
				driver.quit();
	}

}
