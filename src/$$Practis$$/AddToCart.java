package $$Practis$$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/dp/B0C1YWFHK5/ref=redir_mobile_desktop?_encoding=UTF8&aaxitk=56949e6ee7f3cf282d6ce72aa90715ef&content-id=amzn1.sym.df4bf09f-d6a1-4ca3-98bc-ee2a82b34bf9%3Aamzn1.sym.df4bf09f-d6a1-4ca3-98bc-ee2a82b34bf9&hsa_cr_id=6981019010702&pd_rd_plhdr=t&pd_rd_r=50fa00b9-a0d4-403b-89f3-1279ca62d622&pd_rd_w=m3Od8&pd_rd_wg=mUv40&qid=1683913969&ref_=sbx_be_s_sparkle_lsi4d_asin_0_img&sr=1-1-e0fa1fdd-d857-4087-adda-5bd576b25987&th=1");
	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value=\"Add to Cart\"]")).click();
	}

}
