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

public class SeleniumTask3tc8_9 {
	
	
	
	
	@FindBy(xpath="//body/nav[@id='topnav']/div[1]/div[2]/ul[1]/li[4]")private WebElement administartion;
	@FindBy(xpath="//a[contains(text(),'Business Rule Configuration')]")private WebElement buisness;
	@FindBy(xpath="//a[@id='MCCTRLSUM']")private WebElement MC_navigator;
	@FindBy(xpath="//body/div[@id='erMCTemplate']/form[@id='ControlNavigatorForm']/div[@id='erViewNavigator']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")private WebElement search;
	  @FindBy(css="#NewRuleButton")private WebElement rules;
	  @FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='RuleCriteriaForm']/div[@id='erViewRuleCriteria']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")private WebElement search2;
		@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='RuleCriteriaForm']/div[@id='erViewRuleCriteria']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/span[1]/span[3]")private WebElement account;
		@FindBy(xpath="//span[@id='select2-selectedOperator-container']")private WebElement selectsop;
		@FindBy(xpath="//body/span[1]/span[1]/span[1]/input[1]")private WebElement search3;
		 @FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='RuleCriteriaForm']/div[@id='erViewRuleCriteria']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[5]/span[1]/span[3]")private WebElement user_id;
		@FindBy(xpath="//li[@id='select2-selectedOperator-result-7lct-==']")private WebElement equal;
		@FindBy(xpath="//button[@id='showDialog_ruleExpressionPane1']")private WebElement build;
		@FindBy(xpath="//textarea[@id='value1']")private WebElement texts;
		@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='RuleCriteriaForm']/div[4]/div[3]/div[1]/button[1]")private WebElement done;
		@FindBy(xpath="//button[@id='addSegment']")private WebElement add_rule;
		@FindBy(xpath="//button[@id='saveCriteria']")private WebElement Save_next;
		@FindBy(xpath="//*[@id=\"select2-mcValue-container\"]")private WebElement rule_value;
		@FindBy(xpath="/html/body/span/span/span[1]/input")private WebElement searchs;
		@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='IntMCValueForm']/div[2]/div[1]/button[2]/i[1]")private WebElement Save_Next;
		@FindBy(xpath="//input[@id='selectedFireIndex']")private WebElement fire_order;
		@FindBy(xpath="//a[@id='2023-02-14']")private WebElement date;
		@FindBy(xpath="//button[@id='submitForm_finish']")private WebElement finish;
		@FindBy(xpath="//span[@id='select2-mcRuleStatus-container']")private WebElement status;
		@FindBy(xpath="//body/span[1]/span[1]/span[1]/input[1]")private WebElement select;
		@FindBy(xpath="//span[@id='select2-configGroup-container']")private WebElement group;
		@FindBy(xpath="//body/span[1]/span[1]/span[1]/input[1]")private WebElement group_select;
		@FindBy(xpath="//textarea[@id='comments']")private WebElement comment;
		@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='WizardConfirmForm']/div[2]/div[1]/span[1]/button[3]/i[1]")private WebElement commit;
		@FindBy(xpath="//body/nav[@id='topnav']/div[1]/div[2]/ul[1]/li[2]/a[1]")private WebElement workflow;
		@FindBy(xpath="//a[@id='WFSEARCH']")private WebElement search_case;
		
		@FindBy(xpath="//input[@id='loanNumber']")private WebElement acc_number;
		@FindBy(xpath="(//button[@class='btn er-button er-default-button er-submit-button btn-primary'])[2]")private WebElement acc_search;
	@FindBy(xpath="//td[contains(text(),'SS4999')]")private WebElement enter_pack;
	@FindBy(xpath="//td[@id='getTaskDetailOne_0098431598RC6BRfJ5D1']")private WebElement WBI;
	@FindBy(xpath="//*[@id=\"taskViewName\"]/div[6]/div[1]/div/div[2]/a")private WebElement plus;
	@FindBy(xpath="//*[@id=\"div-non-image\"]/div[1]/div/div[2]/a")private WebElement add_doc;
	@FindBy(xpath="/html[1]/body[1]/span[1]/form[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/span[1]/span[1]/span[1]")private WebElement statuss;
	@FindBy(xpath="/html[1]/body[1]/span[2]/span[1]/span[1]/ul[1]/li[1]")private WebElement accepted;
	@FindBy(xpath="//input[@id='TXT_participantDocuments[0].documentDate")private WebElement document_date;
	@FindBy(xpath="//input[@id='TXT_participantDocuments[0].documentReceiptDate")private WebElement received_date;
	@FindBy(xpath="//textarea[@id='participantDocuments[0].comment")private WebElement comments;
	@FindBy(xpath="//button[@id='ERButtn_10752']")private WebElement save_close;
	@FindBy(xpath="//li[@id='select2-participantDocuments0allDocumentStatusCodes-result-oou6-INVLD']")private WebElement invalid;
	@FindBy(xpath="//*[@id=\"caseTreePanelMenuBtn\"]/a[1]/i")private WebElement terminator;
	@FindBy(xpath="//*[@id=\"terminateComment\"]")private WebElement terminate_comment;
	@FindBy(xpath="//*[@id=\"ERButtn_10804\"]")private WebElement terminat;
	
	
	
	public SeleniumTask3tc8_9(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonadministration() {
	
		administartion.click();
		
	}
	
	
	public void clickonbuisness(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(buisness).moveToElement(MC_navigator).click().build().perform();

	}
//	public void MC_navigator() {
//		
//		MC_navigator.click();
//	}
	public void clickonsearch(WebDriver driver) {
		search.sendKeys("MC3864");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	public void clickonrule(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",rules);
//FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
//wait.withTimeout(Duration.ofMillis(2000));
//wait.pollingEvery(Duration.ofMillis(500));
//wait.ignoring(Exception.class);
//wait.until(ExpectedConditions.visibilityOf(rules));

//		((JavascriptExecutor)driver).executeScript("window.scrollBy(600,400)");

		rules.click();
	}

	public void clickonaccount(WebDriver driver) {
		search2.sendKeys("account number");
		Actions  act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		act.moveToElement(account).click().build().perform();
		selectsop.click();
		search3.sendKeys("Equal to");
		act.sendKeys(Keys.ENTER).build().perform();
		build.click();
		texts.sendKeys("SS4999");
		done.click();
		add_rule.click();
		//search2.clear();
	}
	public void clickonsearch2(WebDriver driver) {
		search2.sendKeys("user id");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		
	}
	public void clickonuserid(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(user_id).click().build().perform();
	}
	public void clickonoperator(WebDriver driver) {
		selectsop.click();
		search3.sendKeys("Equal to");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	public void clickonbuild() {
		build.click();
	}
	public void entertext() {
		texts.sendKeys("cscbarkha");
	}
	public void clickondone() {
		done.click();
		
	}
	
	
	public void clickonaddrule() {
		add_rule.click();
	}
	
	public void clickonsave(WebDriver driver){
		((JavascriptExecutor)driver).executeScript("window.scrollBy(600,400)");
		Save_next.click();

		}
	public void enterrulevalue(WebDriver driver) {
		rule_value.click();
		searchs.sendKeys("false - No");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Save_Next.click();
	}
	 public void enterfireorder() {
	    	fire_order.sendKeys("1");
	    	date.click();
	    	finish.click();
	    }
	    public void selectsatus(WebDriver driver) {
	    	status.click();
	    	select.sendKeys("Testing - config status");
	    	Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).build().perform();
	    }
	    public void selectgroup(WebDriver driver) {
	    	group.click();
	    	group_select.sendKeys("SeleniumQA - For Selenium QA");
	    	Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).build().perform();
	    }
	    public void entercomment() {
	    	comment.sendKeys("Test");
	    	commit.click();
	    }
	    public void clickonworkflow(WebDriver driver) throws InterruptedException {
	    	workflow.click();
	    	Actions act=new Actions(driver);
	    	act.moveToElement(search_case).click().build().perform();
	    	acc_number.sendKeys("SS4999");
  //	FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
////	    	Thread.sleep(1000);
//	    	wait.withTimeout(Duration.ofMillis(5000));
//	    	wait.pollingEvery(Duration.ofMillis(100));
//	    	wait.ignoring(Exception.class);
//	    	wait.until(ExpectedConditions.visibilityOf(acc_search));
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
//    	WebDriverWait waitt=new WebDriverWait(driver,Duration.ofMillis(2000));
//        waitt.until(ExpectedConditions.visibilityOf(WBI));
	    	WBI.click();
	    	}
	    	
	    	public void clickonplusicon2(WebDriver driver) throws InterruptedException 
	    	{
	    	
	         //Thread.sleep(2000);
	    	//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",plus);
	    	((JavascriptExecutor)driver).executeScript("window.scrollBy(1000,700)");
  	WebDriverWait waittt=new WebDriverWait(driver,Duration.ofMillis(2000));
        waittt.until(ExpectedConditions.visibilityOf(plus));
   
	    	plus.click();
	    	add_doc.click();
	    	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",statuss);
//	    	WebDriverWait waitt=new WebDriverWait(driver,Duration.ofMillis(2000));
//	        waitt.until(ExpectedConditions.visibilityOf(statuss));
	    	statuss.click();
	    //	statuss.sendKeys("Accepted");
    	Actions act=new Actions(driver);
    	act.sendKeys(Keys.ENTER).build().perform();
    	act.moveToElement(accepted).click().build().perform();
	    	document_date.sendKeys("02/03/2023");
	    	received_date.sendKeys("02/12/2023");
	    	comments.sendKeys("Test");
	    	save_close.click();
	    	
	    }
	    	public void clickonplusicon3(WebDriver driver) {
	    		((JavascriptExecutor)driver).executeScript("window.scrollBy(1000,700)");
	    	  	WebDriverWait waittt=new WebDriverWait(driver,Duration.ofMillis(2000));
	    	        waittt.until(ExpectedConditions.visibilityOf(plus));
	    	   
	    		    	plus.click();
	    		    	add_doc.click();
	    		    	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",statuss);
//	    		    	WebDriverWait waitt=new WebDriverWait(driver,Duration.ofMillis(2000));
//	    		        waitt.until(ExpectedConditions.visibilityOf(statuss));
	    		    	statuss.click();
	    		    //	statuss.sendKeys("Accepted");
	    	    	Actions act=new Actions(driver);
	    	    	act.sendKeys(Keys.ENTER).build().perform();
	    	    	act.moveToElement(invalid).click().build().perform();
	    		    	document_date.sendKeys("02/03/2023");
	    		    	received_date.sendKeys("02/12/2023");
	    		    	comments.sendKeys("Test");
	    		    	save_close.click();
	    		    	terminator.click();
	    		    	terminate_comment.sendKeys("test");
	    		    	terminat.click();
	    	}
		
		
		
		
	}


		
	
	
	
	


