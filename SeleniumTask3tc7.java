package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTask3tc7 {
	
	
	//*[@id="taskViewName"]/div[6]/div[1]/div/div[1]/ul/li[2]/a/b
	
	
	
	
	@FindBy(xpath="//body/nav[@id='topnav']/div[1]/div[2]/ul[1]/li[2]/a[1]")private WebElement workflow;
	@FindBy(xpath="//a[@id='WFSEARCH']")private WebElement search_case;
	@FindBy(xpath="//input[@id='loanNumber']")private WebElement acc_number;
	@FindBy(xpath="(//button[@class='btn er-button er-default-button er-submit-button btn-primary'])[2]")private WebElement acc_search;
    @FindBy(xpath="//body[1]/div[2]/div[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]")private WebElement enter_pack;
    @FindBy(xpath="//td[@id='getTaskDetailOne_0098431598RC6BRfJ5D1']")private WebElement WBI;
    @FindBy(xpath="//*[@id=\"incomingDocumentForm\"]/div/div[2]/table/tbody/tr[2]/td[4")private WebElement review;
    @FindBy(xpath="/html[1]/body[1]/span[1]/form[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/span[1]/span[1]/span[1]")private WebElement statuss;
	@FindBy(xpath="/html[1]/body[1]/span[2]/span[1]/span[1]/ul[1]/li[1]")private WebElement accepted;
	@FindBy(xpath="//input[@id='TXT_participantDocuments[0].documentDate")private WebElement document_date;
	@FindBy(xpath="//input[@id='TXT_participantDocuments[0].documentReceiptDate")private WebElement received_date;
	@FindBy(xpath="//textarea[@id='participantDocuments[0].comment")private WebElement comments;
	@FindBy(xpath="//button[@id='ERButtn_10752']")private WebElement save_close;
	@FindBy(xpath="//*[@id=\"taskViewName\"]/div[6]/div[1]/div/div[1]/ul/li[2]/a/b")private WebElement accept_doc;
    
	public SeleniumTask3tc7(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
    
    
    public void clickonworkflow(WebDriver driver) throws InterruptedException {
    	workflow.click();
    	Actions act=new Actions(driver);
    	act.moveToElement(search_case).click().build().perform();
    	acc_number.sendKeys("SS4999");
//	FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
////    	Thread.sleep(1000);
//    	wait.withTimeout(Duration.ofMillis(5000));
//    	wait.pollingEvery(Duration.ofMillis(100));
//    	wait.ignoring(Exception.class);
//    	wait.until(ExpectedConditions.visibilityOf(acc_search));
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
//    waitt.until(ExpectedConditions.visibilityOf(WBI));
    	WBI.click();
    	review.click();
    	}
    public void clickonplusicon2(WebDriver driver) throws InterruptedException 
	{
	
//     //Thread.sleep(2000);
//	//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",plus);
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(1000,700)");
//WebDriverWait waittt=new WebDriverWait(driver,Duration.ofMillis(2000));
//waittt.until(ExpectedConditions.visibilityOf(plus));
//
//	plus.click();
//	add_doc.click();
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",statuss);
//	WebDriverWait waitt=new WebDriverWait(driver,Duration.ofMillis(2000));
//    waitt.until(ExpectedConditions.visibilityOf(statuss));
	statuss.click();
//	statuss.sendKeys("Accepted");
Actions act=new Actions(driver);
act.sendKeys(Keys.ENTER).build().perform();
act.moveToElement(accepted).click().build().perform();
	document_date.sendKeys("02/14/2023");
	received_date.sendKeys("02/15/2023");
	comments.sendKeys("Test");
	save_close.click();
	accept_doc.click();
	
}

}

	
