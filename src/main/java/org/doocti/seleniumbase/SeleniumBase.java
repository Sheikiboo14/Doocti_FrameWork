package org.doocti.seleniumbase;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.doocti.seleniumEnum.Browser;
import org.doocti.seleniumEnum.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBase implements SeleniumInterface {


	Long timeOut = 30L; 

	Long waitTime = 10l;

	protected RemoteWebDriver driver = null;

	WebDriverWait wait = null;
	
	Robot rb = null;
	
	Actions action = null;
	
	String Url = "https://console-v2.doocti.com/v2.1.106/auth/login";
	
	String UserEmail = "developv2_admin@doocti.com";

	String UserPassword = "Doocti@123";

	


	@BeforeTest
	public void setUp() {

		browaerSetup(Url);
		type(element(Locators.xpath, "//input[@aria-label='UserName']"), UserEmail);
		type(element(Locators.xpath, "//input[@aria-label='Password']"), UserPassword);
		click(element(Locators.xpath, "//div[text()='Login']"));
		isDisplay(element(Locators.xpath, "//i[@title='Sign Out']"));

	}
	
	@AfterTest
	public void setDown() 
	
	{	
//		 quit();
		 
	}
	
	public void browaerSetup(String url) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		driver.get(url);
		wait = new WebDriverWait(driver,Duration.ofSeconds(waitTime));



	}


	public void browserSetup(Browser browserName, String url) {

		switch (browserName) {

		case Chrome:
			driver = new ChromeDriver();
			break;
		case Edge:
			driver = new EdgeDriver();
			break;	
		case FireFox:
			driver = new FirefoxDriver();
			break;	
		case Safari:
			driver = new SafariDriver();
			break;
		default:
			System.err.println("Undefined Browser");
			break;
		}


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		driver.get(url);
		wait = new WebDriverWait(driver,Duration.ofSeconds(waitTime));

	}


	public void close() {

		driver.close();

	}


	public void quit() {

		driver.quit();
	}


	public WebElement element(Locators type,String value) {

		switch (type) {

		case id:

			return driver.findElement(By.id(value));

		case className:

			return driver.findElement(By.className(value));

		case cssSelector:

			return driver.findElement(By.cssSelector(value));

		case xpath:

			return driver.findElement(By.xpath(value));

		case link:

			return driver.findElement(By.linkText(value));

		case tagName:

			return driver.findElement(By.tagName(value));



		default:

			System.err.println("Invalid Locator");

			break;
		}

		return null;
	}


	public List<WebElement> elements(Locators type,String value) {

		switch (type) {

		case id:

			return driver.findElements(By.id(value));

		case className:

			return driver.findElements(By.className(value));

		case cssSelector:

			return driver.findElements(By.cssSelector(value));

		case xpath:

			return driver.findElements(By.xpath(value));

		case link:

			return driver.findElements(By.linkText(value));

		case tagName:

			return driver.findElements(By.tagName(value));



		default:

			System.err.println("Invalid Locator");

			break;
		}

		return null;
	}



	public void click(WebElement ele) {

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));

		element.click();
	}


	public void type(WebElement ele,String testData) {

		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));

		element.clear();
		element.sendKeys(testData);

	}

	public void type(WebElement ele, String testData, Keys keys) {

		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));

		element.clear();
		element.sendKeys(testData);

	}


	public void append(WebElement ele,String testData) {

		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));

		element.sendKeys(testData);

	}


	public void switchToWindow(int i) {

		Set<String> AllWindows = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(AllWindows);
		driver.switchTo().window(list.get(i));
	}






	public void dropdown(WebElement ele, WebElement selectEle) {


		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));

		WebElement dropdownValue = wait.until(ExpectedConditions.visibilityOf(selectEle));

		dropdownValue.click();
	}


	public boolean isDisplay(WebElement ele) {

		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		
		boolean expecedValue = element.isDisplayed();
		
		Assert.assertTrue(expecedValue, "Element is Not displayed");
		
//		System.out.println(expecedValue);
		
		return expecedValue;
		
	}
	
	

	public boolean isSelect(WebElement ele) {
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));

		boolean expecedValue = element.isSelected();
		

		return expecedValue;



	}
	
	public void createAssert(List<WebElement> ele,String value) {

		List<WebElement> elements =	wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		
		boolean flag = false;
		
		for(WebElement Data : elements)
		{
			String actualValue = Data.getText();
			
			if(actualValue.contains(value)) {
				
				flag = true;
						
			}
		}

		Assert.assertTrue(flag, "Not Created...!");
	}

	public void deleteAssert(List<WebElement> ele,String value) {

		List<WebElement> elements =	wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		
		boolean flag = false;
		
		for(WebElement Data : elements)
		{
			String actualValue = Data.getText();
			
			if(actualValue.contains(value)) {
				
				flag = true;
					
			}
			else {
				
				driver.findElement(By.xpath("//i[text()='chevron_right']")).click();
				
				actualValue = Data.getText();
				
				if(actualValue.contains(value)) {
					
					flag = true;
					
				}
			}
		}	

		Assert.assertFalse(flag, "Not Deleted...!");
	}
	
	public void updateAssert(WebElement ele, String expectedValue) {

		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		
		assertEquals(element.getText(), expectedValue,"Not Updated...!");
		

	}
	public void getTitle() {
		
		driver.getTitle();
		
	}


	public void getUrl() {

		driver.getCurrentUrl();
	}

	public String getText(WebElement ele) {
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		
		String expectedValue = element.getText();
		
		System.out.println(expectedValue);
		
		return expectedValue;
		
		
	}
	
	public void getText(WebElement ele ,String expectedcreateValue) {
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		
		String text = element.getAttribute("value");
		
		System.out.println(text);
		
		Assert.assertEquals(text, expectedcreateValue, "Not Created...!");
	}
	
	


	
	public void scroll(WebElement ele , int scrollAmount) {
		
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(ele);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, scrollAmount)
                .perform();
	}
	
	public void robot(String filelocation) {
		
		try {
			rb = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringSelection path= new StringSelection(filelocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
				
	}

	public void consoleLog() {
		
		try {
			rb = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_J);
	}
	
//  		<============================================ Configuration Data's ==============================================>
	

	/**
	 * Configuration Data's
	 * 
	 */

	@DataProvider(name ="QueueData")
	public String[][] queueData() {

		String [][]qdata = new String [1][4];

		qdata[0][0] ="Test_Queue";
		qdata[0][1] = "3";
		qdata[0][2]="1";
		qdata[0][3]="25";


		return qdata;
	}

	@DataProvider(name = "DispoData")
	public String[][] dispoData() {

		String [][] ddata = new String[1][6];

		ddata[0][0]="Test Dispo";
		ddata[0][1]="Testing Purpose";
		ddata[0][2] ="Meeting";
		ddata[0][3] ="3";
		ddata[0][4] ="1";
		ddata[0][5] ="Inactive";



		return ddata;

	}

	@DataProvider(name = "SubDispoData")
	public String[][] subdispoData() {

		String [][] sddata = new String[1][6];

		sddata[0][0]="Test Dispo";
		sddata[0][1]="Demo";
		sddata[0][2]="Testing Purpose";
		sddata[0][3] ="3";
		sddata[0][4] ="2";
		sddata[0][5] ="Inactive";


		return sddata;

	}
	
	@DataProvider(name = "LeadStatusData")
	public String[][] leadStatusData() {

		String [][] leadstatusdata = new String[1][3];

		leadstatusdata[0][0]="Test Lead Status";
		leadstatusdata[0][1]="Demo";
		leadstatusdata[0][2] ="Inactive";


		return leadstatusdata;

	}

	@DataProvider(name = "TicketStatusData")
	public String[][] ticketStatusData() {

		String [][] ticketStatusdata = new String[1][5];

		ticketStatusdata[0][0]="Test Status";
		ticketStatusdata[0][1]="Demo";
		ticketStatusdata[0][2]="3";
		ticketStatusdata[0][3]="1";
		ticketStatusdata[0][4]="Inactive";


		return ticketStatusdata;

	}

	@DataProvider(name = "PausecodeData")
	public String[][] pausecodeData() {

		String [][] pausecodedata = new String[1][7];

		pausecodedata[0][0]="Test Pause Code";
		pausecodedata[0][1]="Demo";
		pausecodedata[0][2]="0";
		pausecodedata[0][3]="30";
		pausecodedata[0][4]="4";
		pausecodedata[0][5]="1";
		pausecodedata[0][6]="Inactive";



		return pausecodedata;

	}

	@DataProvider(name = "AudioData")
	public String[][] audioData() {

		String [][] audiodata = new String[1][2];

		audiodata[0][0]="Testing";
		audiodata[0][1]="D:\\Testing File\\demo1.mp3";
		audiodata[0][2]="Inactive";

		return audiodata;

	}

	@DataProvider(name = "BlocklistData")
	public String[][] blocklistData() {

		String [][]blocklistdata = new String[1][3];

		blocklistdata[0][0]= "D:\\Testing File\\sample_blocklist.csv";
		blocklistdata[0][1]= "1";
		blocklistdata[0][2]="9090909091";

		return blocklistdata;

	}

	@DataProvider(name = "DidData")
	public String[][] didData() {

		String [][]diddata = new String[1][6];

		diddata[0][0]= "9876543210";
		diddata[0][1] ="Test purpose";
		diddata[0][2] ="D:\\Testing File\\sample_did.csv";
		diddata[0][3] ="4";
		diddata[0][4] ="2";
		diddata[0][5] ="Inactive";


		return diddata;

	}

	@DataProvider(name = "TagData")
	public String[][] tagData() {

		String [][]tagdata = new String[1][5];

		tagdata[0][0]= "Testing";
		tagdata[0][1] ="Test purpose";
		tagdata[0][2] ="3";
		tagdata[0][3] ="1";
		tagdata[0][4] ="inactive";



		return tagdata;

	}

	@DataProvider(name = "AnnouncementData")
	public String[][] announcementData() {

		String [][]announcementdata = new String[1][6];

		announcementdata[0][0]= "Testing";
		announcementdata[0][1] ="Test purpose";
		announcementdata[0][2] ="Preview Campaign";
		announcementdata[0][3] ="3";
		announcementdata[0][4] ="1";
		announcementdata[0][5] ="Inactive";


		return announcementdata;

	}

	@DataProvider(name = "ScriptData")
	public String[][] scriptData() {

		String [][]scriptdata = new String[1][8];

		scriptdata[0][0]= "Testing Urrl";
		scriptdata[0][1] ="Test purpose";
		scriptdata[0][2] ="https://console-v2.doocti.com/v2.1.106/configurations/Script";
		scriptdata[0][3] ="Hello Tevatel";
		scriptdata[0][4] ="URL";
		scriptdata[0][5] ="3";
		scriptdata[0][6] ="1";
		scriptdata[0][7] ="INACTIVE";

		return scriptdata;

	}

	@DataProvider(name = "InboundData")
	public String[][] inboundData() {

		String [][]inbounddata = new String[1][6];

		inbounddata[0][0]= "123";
		inbounddata[0][1] ="Testing";
		inbounddata[0][2] ="queue";
		inbounddata[0][3] ="Test";
		inbounddata[0][4] ="3";
		inbounddata[0][5] ="1";



		return inbounddata;

	}

	@DataProvider(name = "TimezoneData")
	public String[][] timezoneData() {

		String [][]timezonedata = new String[1][10];

		timezonedata[0][0]= "Test";
		timezonedata[0][1] ="Testing";
		timezonedata[0][2] ="0";
		timezonedata[0][3] ="05";
		timezonedata[0][4] ="11";
		timezonedata[0][5] ="00";
		timezonedata[0][6] ="Active";
		timezonedata[0][7] ="5";
		timezonedata[0][8] ="1";
		timezonedata[0][9] ="Inactive";
		

		



		return timezonedata;

	}

	@DataProvider(name = "MeetingTitleData")
	public String[][] meetingtitleData() {

		String[][] meetingtitledata = new String[1][6];

		meetingtitledata[0][0] ="Test Title";
		meetingtitledata[0][1] ="Testing";
		meetingtitledata[0][2] ="Testing Purpose";
		meetingtitledata[0][3] ="4";
		meetingtitledata[0][4] ="1";
		meetingtitledata[0][5] ="Inactive";



		return meetingtitledata;
	}

	
//			<============================================ Configuration Data's ==============================================>

	
//           <============================================ Users and Groups Data's ==============================================>
	

	@DataProvider(name= "UserGroupData")
	public String[][] usergroupData() {

		String[][] usergroupdata = new String[1][1];

		usergroupdata[0][0] = "Testing";


		return usergroupdata;
	}

	@DataProvider(name= "UserData")
	public String[][] userData() {

		String[][] userdata = new String[1][13];

		userdata[0][0] = "testenv_agent21";
		userdata[0][1] = "Testing Purpose";
		userdata[0][2] = "376";
		userdata[0][3] = "testenv_agent21@doocti.com";
		userdata[0][4] = "Doocti@123";
		userdata[0][5] = "Agent";
		userdata[0][6] = "Testing";

		//Create and Delete Assert & Edit and Delete	

		userdata[0][7] = "3";

		//Update date	

		userdata[0][8] = "Demo";
		userdata[0][9] = "377";
		userdata[0][10] = "Administrator";
		userdata[0][11] = "developv2_admin";
		userdata[0][12] = "Inactive";






		return userdata;
	}

	@DataProvider(name = "ChannelData")
	public String[][] channelData() {

		String [][] channeldata = new String[1][6];

		channeldata[0][0] ="Test Channel";
		channeldata[0][1] ="Channel Description";

		//Create and Delete Assert Data

		channeldata[0][2] ="1";

		// Edit Data

		channeldata[0][3] ="3";

		// Update Data

		channeldata[0][4] ="Inactive";

		// Update Assert data

		channeldata[0][5] ="2";



		return channeldata;
	}

	@DataProvider(name = "SourceData")
	public String[][] sourceData() {

		String [][] sourcedata = new String[1][6];

		sourcedata[0][0] ="Test Source";
		sourcedata[0][1] ="Source Description";

		//Create and Delete Assert Data

		sourcedata[0][2] ="1";

		// Update Data

		sourcedata[0][3] ="3";
		sourcedata[0][4] ="Inactive";

		// Update Assert data

		sourcedata[0][5] ="2";

		return sourcedata;
	}

	@DataProvider(name = "TeamData")
	public String[][] teamData() {

		String [][] teamdata = new String[1][11];

		//Create Data

		teamdata[0][0] ="Test Team";
		teamdata[0][1] ="Team Description";
		teamdata[0][2] ="Lead Source";
		teamdata[0][3] ="Test Source";
		teamdata[0][4] ="Test Channel";
		teamdata[0][5] ="Preview Campaign";
		teamdata[0][6] ="developv2_agent04@doocti.com";

		//Create and Delete Assertion Data

		teamdata[0][7] ="1";

		// Update Data

		teamdata[0][8] ="4";
		teamdata[0][9]="Inactive";

		//Update Assertion Data

		teamdata[0][10]="3";




		return teamdata;
	}

//  		<============================================ Users and Groups Data's ==============================================>

//  		<============================================ CRM Data's ==============================================>

	/**
	 * CRM Data's
	 * @return 
	 * 
	 */


	@DataProvider(name = "CampaignData")
	public String[][] campaigndata() {

		String [][]campaigndata = new String [1][23];

		campaigndata[0][0] = "Test PREVIEW";
		campaigndata[0][1] = "PREVIEW";
		campaigndata[0][2] = "IT";
		campaigndata[0][3] = "Testing";
		campaigndata[0][4] = "developv2_8633537660";
		campaigndata[0][5] = "500";
		campaigndata[0][6] = "1.2";
		campaigndata[0][7] = "10";
		campaigndata[0][8] = "Testing Script";
		campaigndata[0][9] = "5";
		campaigndata[0][10] = "Text";	
		campaigndata[0][11] = "Test Predictive";
		campaigndata[0][12] = "PREDICTIVE";
		campaigndata[0][13] = "Test Inbound";
		campaigndata[0][14] = "INBOUND";
		campaigndata[0][15] = "Test Power";
		campaigndata[0][16] = "POWER";
		campaigndata[0][17] = "Test VoiceBlast";
		campaigndata[0][18] = "VOICE BLAST";
		campaigndata[0][19] = "Test Whatsapp Blase";
		campaigndata[0][20] = "WHATSAPP BLAST";
		
		// Delete Column
		
		campaigndata[0][21] = "8";
		
		// Edit Assert data
		
		campaigndata[0][22] = "No";

		
		
		

		return campaigndata;
	}
	
	@DataProvider(name = "MeetingData")
	public String[][] meetingdata() {
		
		String[][]meetingdata = new String [1][8];
		
		meetingdata[0][0] ="Decision-making meeting";
		meetingdata[0][1] ="Testing";
		meetingdata[0][2] ="9514380497";
		meetingdata[0][3] ="developv2_agent02@doocti.com";
		meetingdata[0][4] ="11";
		meetingdata[0][5] ="lead";
		meetingdata[0][6] ="Testing";
		meetingdata[0][7] ="Test Meeting";

		
		return meetingdata;
		
		
	}
	
	@DataProvider(name = "ListData")
	public String[][] listdata() {
		
		String[][]listdata = new String [1][5];
		
		listdata[0][0] ="2233";
		listdata[0][1] ="Test List";
		listdata[0][2] ="Testing";
		listdata[0][3] ="Preview Campaign";
		listdata[0][4] ="3";

		
		

		
		return listdata;
		
	}
	
	@DataProvider(name = "LeadData")
	public String[][] leaddata() {
		
		String[][]leaddata = new String [1][5];
		
		leaddata[0][0] ="124";
		leaddata[0][1] ="D:\\Testing File\\Dialer.csv";
		leaddata[0][2] ="Test Lead";
		leaddata[0][3] ="9999990000";
		leaddata[0][4] ="Whatsapp";

		

		
		return leaddata;
		
	}
	
	@DataProvider(name = "ContactData")
	public String[][] contactdata() {
		
		String[][]contactdata = new String [1][3];
		
		contactdata[0][0] ="Test Contact";
		contactdata[0][1] ="9898989898";
		contactdata[0][2] ="D:\\Testing File\\Contact_list.csv";

		
		return contactdata;
		
	}
	
	@DataProvider(name = "TicketData")
	public String[][] ticketdata() {
		
		String[][]ticketdata = new String [1][8];
		
		ticketdata[0][0] ="Open";
		ticketdata[0][1] ="Testing Ticket";
		ticketdata[0][2] ="Testing Subject";
		ticketdata[0][3] ="Testing Description";
		ticketdata[0][4] ="9514380497";
		ticketdata[0][5] ="25";
		ticketdata[0][6] ="Low";
		ticketdata[0][7] ="Channel";

		
		return ticketdata;
		
	}



//  		<============================================ CRM Data's ==============================================>



}
