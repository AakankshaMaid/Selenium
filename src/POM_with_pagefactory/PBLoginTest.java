package POM_with_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage1 login=new PBLoginPage1(driver);
		login.clickPBLoginPagesignIn();
		
		PBMobNumPage2 mob=new PBMobNumPage2(driver);
		mob.inputPBMobNumPagemobNum();
		mob.clickPBMobNumPagesignInWithPwd();
		
		PBPwdPage3 pwd=new PBPwdPage3(driver);
		pwd.inputPBPwdPagePwd();
		pwd.clickPBPwdPageSignIn();
		
		PBHomePage4 home=new PBHomePage4(driver);
		home.openDDOptionPBHomePageMyAcc();
		
		PBMyAccPage5 myAcc=new PBMyAccPage5(driver);
		myAcc.clickPBMyAccPageMyProfile();
		
		PBProfilePage6 profile=new PBProfilePage6(driver);
		profile.SwitchToChildWindow();
		profile.verifyPBProfilePagefullName();
				
				
				
	}

}
