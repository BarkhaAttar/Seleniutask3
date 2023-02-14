package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;
import POM.Erlogin;
import POM.Mc2721PC;
import POM.Seleniumtask3tc1_2;
import Utility.Parametrerization;

public class SeleniumTask3test1_2 {

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
//			 erlogin.EnteruserID("cscbarkha",driver);
			 String username=Parametrerization.getData(0, 1);
			 erlogin.EnteruserID(username, driver);
			 String password=Parametrerization.getData(1, 1);
			 erlogin.Enterpass(password, driver);	 
//			 erlogin.Enterpass("Chava*4999+2022",driver);
			 erlogin.Clickonlogin();
			 }
			 
		@Test
		public void scenario1() throws EncryptedDocumentException, IOException, InterruptedException {
			Eracceptpage eracceptpage=new Eracceptpage(driver);
		     eracceptpage.clickonaccept(driver);
			 Erlogin erlogin=new Erlogin(driver);
//			 erlogin.EnteruserID("cscbarkha",driver);
			 String username=Parametrerization.getData(0, 1);
			 erlogin.EnteruserID(username, driver);
			 String password=Parametrerization.getData(1, 1);
			 erlogin.Enterpass(password, driver);	 
//			 erlogin.Enterpass("Chava*4999+2022",driver);
			 erlogin.Clickonlogin();
			 Seleniumtask3tc1_2 seleniumtask3tc1_2=new Seleniumtask3tc1_2(driver);
			 seleniumtask3tc1_2.clickonadministration();
			 seleniumtask3tc1_2.clickonbuisness(driver);
			 seleniumtask3tc1_2.clickonsearch(driver);
			 seleniumtask3tc1_2.clickonrule(driver);
			 seleniumtask3tc1_2.clickonaccount(driver);
//			 seleniumtask3tc1_2.clickonsearch2(driver);
//			 seleniumtask3tc1_2.clickonuserid(driver);
			// seleniumtask3tc1_2.clickonoperator(driver);
//			 seleniumtask3tc1_2.clickonbuild();
//			 seleniumtask3tc1_2.entertext();
//			 seleniumtask3tc1_2.clickondone();
		//	 seleniumtask3tc1_2.clickonaddrule();
			 seleniumtask3tc1_2.clickonsave(driver);
			 seleniumtask3tc1_2.enterrulevalue(driver);
			 seleniumtask3tc1_2.enterfireorder();
			seleniumtask3tc1_2.selectsatus(driver);
			seleniumtask3tc1_2.selectgroup(driver);
			seleniumtask3tc1_2.entercomment();
			seleniumtask3tc1_2.clickonworkflow(driver);
			seleniumtask3tc1_2.clickonplusicon(driver);
			seleniumtask3tc1_2.clickonplusicon2(driver);
			seleniumtask3tc1_2.clickonplusicon3(driver);
			
}}
