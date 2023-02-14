package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;
import POM.Erlogin;
import POM.SeleniumTask3tc13;
import POM.SeleniumTask3tc6;
import Utility.Parametrerization;

public class SeleniumTask3test13 {
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
	public void scenario3_1() throws EncryptedDocumentException, IOException, InterruptedException {
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
		 SeleniumTask3tc13 seleniumtask3tc13=new SeleniumTask3tc13(driver);
		 seleniumtask3tc13.clickonworkflow(driver);
		 seleniumtask3tc13.clickonplusicon(driver);
		
		 
		 
}}




