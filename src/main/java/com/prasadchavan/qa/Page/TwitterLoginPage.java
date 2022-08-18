package com.prasadchavan.qa.Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.prasadchavan.qa.Base.TestBase;

public class TwitterLoginPage extends TestBase {
	//Declaration 
		@FindBy(xpath ="//img[@class='css-9pa8cd']") private WebElement twitter_reg_logo;
		@FindBy(xpath ="//span[text()='Happening now']") private WebElement twitter_reg_happeningnowtxt;
		@FindBy(xpath ="//span[text()='Join Twitter today.']") private WebElement twitter_reg_jointwittertodaytxt;
		@FindBy(xpath ="//span[text()='Already have an account?']") private WebElement twitter_reg_alreadyhaveaccounttxt;
		@FindBy(xpath ="//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']") private WebElement twitter_reg_signupwithtxt;
		@FindBy(xpath ="//span[text()='Sign up with Apple']") private WebElement twitter_reg_appletxt;
		@FindBys({@FindBy(xpath ="//div[@class='css-1dbjc4n r-p1pxzi r-wfqgy4 r-zd22at']/nav/a/span")}) private List<WebElement>twitter_reg_footerlinks;
		@FindBy(xpath ="//span[text()='Sign up with phone or email']") private WebElement twitter_reg_signupbtn;
		

		//Initialization
		
		public TwitterLoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Usage
		
		public void verifyTwitterRegisterPageTweeterLogo() {
			Assert.assertTrue(twitter_reg_logo.isDisplayed(),"Twitter Logo is not visible");
			Reporter.log("verifyTwitterRegisterPageTweeterLogo",true);
		}
		public void verifyTwitterRegisterPageHappeningtxt() {
			Assert.assertTrue(twitter_reg_happeningnowtxt.isDisplayed(),"Not visible");
			Assert.assertEquals(twitter_reg_happeningnowtxt.getText(),"Happening now");
			Reporter.log("verifyTwitterRegisterPageHappeningtxt",true);
		}
		public void verifyTwitterRegisterPageJoiningtxt() {
			Assert.assertTrue(twitter_reg_jointwittertodaytxt.isDisplayed(),"Not visible");
			Reporter.log("verifyTwitterRegisterPageJoiningtxt",true);
		}
		public void verifyTwitterRegisterPageAlreadytxt() {
			Assert.assertTrue(twitter_reg_alreadyhaveaccounttxt.isDisplayed(),"Not visible");
			Reporter.log("verifyTwitterRegisterPageAlreadytxt",true);
		}
		public void verifyTwitterRegisterPageSignuptxt() {
			Assert.assertTrue(twitter_reg_signupwithtxt.isDisplayed(),"Not visible");
			Reporter.log("verifyTwitterRegisterPageSignuptxt",true);
		}
		public void verifyTwitterRegisterPageAppletxt() {
			Assert.assertTrue(twitter_reg_appletxt.isDisplayed(),"Not visible");
			Reporter.log("verifyTwitterRegisterPageAppletxt",true);
		}
		public void verifyTwitterRegisterPageFooterlinks() {
			Assert.assertEquals(twitter_reg_footerlinks.size(),17);
			for(int i=0;i<twitter_reg_footerlinks.size();i++) {
			 String Value = twitter_reg_footerlinks.get(i).getText();
				System.out.println(i +" "+ Value);
			}
			Reporter.log("verifyTwitterRegisterPageFooterlinks",true);
		}
		public void clickTwitterRegisterPageSignupbtn() {
			Assert.assertTrue(twitter_reg_signupbtn.isDisplayed(),"Not visible");
			Assert.assertTrue(twitter_reg_signupbtn.isEnabled());
			twitter_reg_signupbtn.click();
			Reporter.log("clickTwitterRegisterPageSignupbtn",true);
		}

}
