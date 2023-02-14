package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTask3tc13 {
	@FindBy(xpath="//body/nav[@id='topnav']/div[1]/div[2]/ul[1]/li[2]/a[1]")private WebElement workflow;
	@FindBy(xpath="//a[@id='WFSEARCH']")private WebElement search_case;
	
	@FindBy(xpath="//input[@id='loanNumber']")private WebElement acc_number;
	@FindBy(xpath="(//button[@class='btn er-button er-default-button er-submit-button btn-primary'])[2]")private WebElement acc_search;
   @FindBy(xpath="//td[contains(text(),'SS4999')]")private WebElement enter_pack;
   @FindBy(xpath="//td[@id='getTaskDetailOne_0098431598RC6BRfJ5D1']")private WebElement WBI;
  
  
  
  
  
  public SeleniumTask3tc13(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
  public void clickonworkflow(WebDriver driver) throws InterruptedException {
  	workflow.click();
  	Actions act=new Actions(driver);
  	act.moveToElement(search_case).click().build().perform();
  	acc_number.sendKeys("SS4999");
//	FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
////  	Thread.sleep(1000);
//  	wait.withTimeout(Duration.ofMillis(5000));
//  	wait.pollingEvery(Duration.ofMillis(100));
//  	wait.ignoring(Exception.class);
//  	wait.until(ExpectedConditions.visibilityOf(acc_search));
  	//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",acc_search);
WebDriverWait waitt=new WebDriverWait(driver,Duration.ofMillis(2000));
waitt.until(ExpectedConditions.visibilityOf(acc_search));


  	acc_search.click();
  	enter_pack.click();
  }
  public void clickonplusicon(WebDriver driver) throws InterruptedException {
  	
  	//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",WBI);
  	//JavascriptExecutor js = (JavascriptExecutor) driver;
  	//Scroll down till the bottom of the page
  	//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	((JavascriptExecutor)driver).executeScript("window.scrollBy(1000,700)");
//	WebDriverWait waitt=new WebDriverWait(driver,Duration.ofMillis(2000));
//  waitt.until(ExpectedConditions.visibilityOf(WBI));
  	WBI.click();
  	}
  
	
	
	
}





