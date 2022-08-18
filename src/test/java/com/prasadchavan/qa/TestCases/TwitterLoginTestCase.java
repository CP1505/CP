package com.prasadchavan.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.prasadchavan.qa.Base.TestBase;
import com.prasadchavan.qa.Page.TwitterLoginPage;



public class TwitterLoginTestCase extends TestBase {

	WebDriver driver;
	
	@BeforeClass
	public void setupbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	@AfterClass
	public void close() {
		driver.close();

	}
	@Test
	public void TwitterRegisterTesting() {
		TwitterLoginPage tw=new TwitterLoginPage(driver);
		
		tw.verifyTwitterRegisterPageHappeningtxt();
		tw.verifyTwitterRegisterPageJoiningtxt();
		tw.verifyTwitterRegisterPageAlreadytxt();
		tw.verifyTwitterRegisterPageSignuptxt();
		tw.verifyTwitterRegisterPageAppletxt();
		tw.verifyTwitterRegisterPageFooterlinks();
		tw.clickTwitterRegisterPageSignupbtn();
	}

}
