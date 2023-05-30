package $$Practis$$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class suger_cosmetic_logo {
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://in.sugarcosmetics.com/products/mousse-muse-maskproof-lip-cream?utm_source=google&utm_medium=search&utm_campaign=17164953316&adgroupid=136382391996&utm_content=646586460881&utm_term=sugar%20cosmetics&gad=1&gclid=Cj0KCQjw98ujBhCgARIsAD7QeAgjXMiQbfDnd12syezOQ_zop7WSTYYw_108RmYBnxs_zpx3s65jDkQaAmlEEALw_wcB");
		driver.findElement(By.xpath("//div[@class='col-2 d-flex justify-content-center']/a")).click();
	}

}
////div[@class='col-2 d-flex justify-content-center']/a