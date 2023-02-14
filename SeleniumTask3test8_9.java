package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;
import POM.Erlogin;
import POM.SeleniumTask3tc8_9;
import POM.Seleniumtask3tc1_2;
import Utility.Parametrerization;

public class SeleniumTask3test8_9 {
	WebDriver driver;
	@BeforeMethod
	
	public void browseon() {
		driver=Browser.openBrowser();
	}
	@Test
	public void scenario3() throws EncryptedDocumentException, IOException
	{
		Eracceptpage eracceptpage=new Eracceptpage(driver);
	     eracceptpage.clickonaccept(driver);	 
		 Erlogin erlogin=new Erlogin(driver);
//		 erlogin.EnteruserID("cscbarkha",driver);
		 String username=Parametrerization.getData(0, 1);
		 erlogin.EnteruserID(username, driver);
		 String password=Parametrerization.getData(1, 1);
		 erlogin.Enterpass(password, driver);	 
//		 erlogin.Enterpass("Chava*4999+2022",driver);
		 erlogin.Clickonlogin();
		 }
		 
	@Test
	public void scenario1() throws EncryptedDocumentException, IOException, InterruptedException {
		Eracceptpage eracceptpage=new Eracceptpage(driver);
	     eracceptpage.clickonaccept(driver);
		 Erlogin erlogin=new Erlogin(driver);
//		 erlogin.EnteruserID("cscbarkha",driver);
		 String username=Parametrerization.getData(0, 1);
		 erlogin.EnteruserID(username, driver);
		 String password=Parametrerization.getData(1, 1);
		 erlogin.Enterpass(password, driver);	 
//		 erlogin.Enterpass("Chava*4999+2022",driver);
		 erlogin.Clickonlogin();
		 SeleniumTask3tc8_9 seleniumtask3tc8_9=new SeleniumTask3tc8_9(driver);
		 seleniumtask3tc8_9.clickonadministration();
		 seleniumtask3tc8_9.clickonbuisness(driver);
		 seleniumtask3tc8_9.clickonsearch(driver);
		 seleniumtask3tc8_9.clickonrule(driver);
		 seleniumtask3tc8_9.clickonaccount(driver);
//		 seleniumtask3tc1_2.clickonsearch2(driver);
//		 seleniumtask3tc1_2.clickonuserid(driver);
		// seleniumtask3tc1_2.clickonoperator(driver);
//		 seleniumtask3tc1_2.clickonbuild();
//		 seleniumtask3tc1_2.entertext();
//		 seleniumtask3tc1_2.clickondone();
	//	 seleniumtask3tc1_2.clickonaddrule();
		 seleniumtask3tc8_9.clickonsave(driver);
		 seleniumtask3tc8_9.enterrulevalue(driver);
		 seleniumtask3tc8_9.enterfireorder();
		seleniumtask3tc8_9.selectsatus(driver);
		seleniumtask3tc8_9.selectgroup(driver);
		seleniumtask3tc8_9.entercomment();
		seleniumtask3tc8_9.clickonworkflow(driver);
		seleniumtask3tc8_9.clickonplusicon(driver);
		seleniumtask3tc8_9.clickonplusicon2(driver);
		seleniumtask3tc8_9.clickonplusicon3(driver);
		
}}



