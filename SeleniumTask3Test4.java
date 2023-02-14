package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;
import POM.Erlogin;
import POM.SeleniumTask3tc4;
import POM.Seleniumtask3tc1_2;
import Utility.Parametrerization;

public class SeleniumTask3Test4 {
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
		 SeleniumTask3tc4 seleniumtask3tc4=new SeleniumTask3tc4(driver);
		 seleniumtask3tc4.clickonadministration();
		 seleniumtask3tc4.clickonbuisness(driver);
		 seleniumtask3tc4.clickonsearch(driver);
		 seleniumtask3tc4.clickonrule(driver);
		 seleniumtask3tc4.clickonaccount(driver);
//		 seleniumtask3tc1_2.clickonsearch2(driver);
//		 seleniumtask3tc1_2.clickonuserid(driver);
		// seleniumtask3tc1_2.clickonoperator(driver);
//		 seleniumtask3tc1_2.clickonbuild();
//		 seleniumtask3tc1_2.entertext();
//		 seleniumtask3tc1_2.clickondone();
	//	 seleniumtask3tc1_2.clickonaddrule();
		 seleniumtask3tc4.clickonsave(driver);
		 seleniumtask3tc4.enterrulevalue(driver);
		 seleniumtask3tc4.enterfireorder();
		 seleniumtask3tc4.selectsatus(driver);
		 seleniumtask3tc4.selectgroup(driver);
		 seleniumtask3tc4.entercomment();


}}
