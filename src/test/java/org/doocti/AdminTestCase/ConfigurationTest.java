package org.doocti.AdminTestCase;

import org.doocti.seleniumEnum.Locators;
import org.doocti.seleniumbase.SeleniumBase;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationTest extends SeleniumBase{

	@BeforeTest
	public void config() {

		click(element(Locators.xpath, "//div[text()='Configurations']"));

	}


	@Test(dataProvider="QueueData",dataProviderClass=SeleniumBase.class)
	public void configTC007(String queuedata[]) {

		click(element(Locators.xpath, "//span[text()='Queues']"));
		click(element(Locators.xpath, "//div[text()='Queue Management']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Queues'])[2]"), queuedata[0]);
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), queuedata[0]);


	}

	@Test(dataProvider="DispoData",dataProviderClass=SeleniumBase.class)
	public void configTC008(String dispodata[]) {

		click(element(Locators.xpath, "//span[text()='Dispositions']"));
		click(element(Locators.xpath, "//div[text()='Disposition']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Disposition'])[2]"), dispodata[0]);
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[2]"), dispodata[1]);
		click(element(Locators.xpath, "(//label[text()='Action']/following-sibling::div)[3]"));
		dropdown(element(Locators.xpath, "(//div[text()='No Action'])[3]"), element(Locators.xpath, "(//div[text()='Meeting'])[2]"));
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), dispodata[0]);


	}

	@Test(dataProvider="SubDispoData",dataProviderClass=SeleniumBase.class)
	public void configTC009(String subdispoData[]) {

		click(element(Locators.xpath, "//span[text()='Sub-Dispositions']"));
		click(element(Locators.xpath, "//div[text()='Sub-Disposition']/following-sibling::button"));
		click(element(Locators.xpath, "(//label[text()='Disposition']/following-sibling::div)[3]"));
		dropdown(element(Locators.xpath, "(//label[text()='Disposition']/following-sibling::div)[3]"), element(Locators.xpath, "(//div[text()='"+subdispoData[0]+"'])[2]"));
		type(element(Locators.xpath, "//input[@aria-label='Sub-Disposition']"), subdispoData[1]);
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[2]"), subdispoData[2]);
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[2]"), subdispoData[1]);


	}

	@Test(dataProvider="LeadStatusData",dataProviderClass=SeleniumBase.class)
	public void configTC010(String leadstatusdata[]) {

		click(element(Locators.xpath, "//span[text()='Lead Status']"));
		click(element(Locators.xpath, "//div[text()='Lead Status']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), leadstatusdata[0]);
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[2]"), leadstatusdata[1]);
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), leadstatusdata[0]);


	}

	@Test(dataProvider="TicketStatusData",dataProviderClass=SeleniumBase.class)
	public void configTC011(String ticketStatusdata[]) {

		click(element(Locators.xpath, "//span[text()='Ticket Status']"));
		click(element(Locators.xpath, "//div[text()='Ticket Status']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), ticketStatusdata[0]);
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[2]"), ticketStatusdata[1]);
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), ticketStatusdata[0]);


	}

	@Test(dataProvider="PausecodeData",dataProviderClass=SeleniumBase.class)
	public void configTC012(String pausecodedata[]) {

		click(element(Locators.xpath, "//span[text()='Pause Codes']"));
		click(element(Locators.xpath, "//div[text()='Pause Code']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Pause Code'])[2]"), pausecodedata[0]);
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[2]"), pausecodedata[1]);
		click(element(Locators.xpath, "(//input[@aria-label='Time'])[2]"));
		click(element(Locators.xpath, "//span[text()='"+pausecodedata[2]+"']"));
		click(element(Locators.xpath, "//span[text()='"+pausecodedata[3]+"']"));
		click(element(Locators.xpath, "//div[text()=' OK ']"));
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), pausecodedata[0]);


	}

	@Test(dataProvider="AudioData",dataProviderClass=SeleniumBase.class)
	public void configTC013(String audiodata[]) {

		click(element(Locators.xpath, "//span[text()='Audio Store']"));
		click(element(Locators.xpath, "//div[text()='Audio Store']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[1]"), audiodata[0]);
		click(element(Locators.className, "file-dummy"));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		robot(audiodata[1]);

		if(getText(element(Locators.className, "file-dummy"))!= "Upload Error") {

			click(element(Locators.xpath, "(//div[text()='Close'])[1]"));
		}

		click(element(Locators.xpath, "//i[@class='fas fa-refresh']"));
		
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[3]"), audiodata[0]);




	}

	@Test(dataProvider="BlocklistData",dataProviderClass=SeleniumBase.class)
	public void configTC014(String blocklistdata[]) {

		click(element(Locators.xpath, "//span[text()='Block List']"));
		click(element(Locators.xpath, "//div[text()='Block List']/following-sibling::button"));
		click(element(Locators.className, "file-dummy"));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		robot(blocklistdata[0]);

		if(getText(element(Locators.className, "file-dummy"))!= "Upload Error") {

			click(element(Locators.xpath, "(//div[text()='Close'])[1]"));
		}

		click(element(Locators.xpath, "//i[@class='fas fa-refresh']"));
		
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[2]"), blocklistdata[2]);

	}

	@Test(dataProvider="DidData",dataProviderClass=SeleniumBase.class)
	public void configTC015(String diddata[]) {

		click(element(Locators.xpath, "//span[text()='DID Number']"));
		click(element(Locators.xpath, "//div[text()='DID Number']/following-sibling::button"));
		click(element(Locators.className, "file-dummy"));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		robot(diddata[2]);

		if(getText(element(Locators.className, "file-dummy"))!= "Upload Error") {

			click(element(Locators.xpath, "(//div[text()='Close'])[1]"));
		}

		click(element(Locators.xpath, "//i[@class='fas fa-refresh']"));
	}

	@Test(dataProvider="DidData",dataProviderClass=SeleniumBase.class)
	public void configTC016(String diddata[]) {

		click(element(Locators.xpath, "//span[text()='DID Number']"));
		click(element(Locators.xpath, "//i[text()='add']"));
		type(element(Locators.xpath, "(//input[@aria-label='DID Number'])[2]"), diddata[0]);
		type(element(Locators.xpath, "//input[@aria-label='Trunk']"), diddata[1]);
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		click(element(Locators.xpath, "//i[@class='fas fa-refresh']"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[2]"), diddata[0]);


	}

	@Test(dataProvider="TagData",dataProviderClass=SeleniumBase.class)
	public void configTC017(String tagdata[]) {

		click(element(Locators.xpath, "//span[text()='Tags']"));
		click(element(Locators.xpath, "//div[text()='Tag Management']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), tagdata[0]);
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[2]"), tagdata[1]);
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "//div[text()='Close']"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), tagdata[0]);


	}

	@Test(dataProvider="AnnouncementData",dataProviderClass=SeleniumBase.class)
	public void configTC018(String announcementData[]) {

		Actions action = new Actions(driver);
		click(element(Locators.xpath, "//span[text()='Announcements']"));
		click(element(Locators.xpath, "//div[text()='Announcement']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), announcementData[0]);
		type(element(Locators.xpath, "(//textarea[@aria-label='Announcement'])[2]"), announcementData[1]);
		click(element(Locators.xpath, "(//label[text()='Campaign']/following-sibling::div)[3]"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[5]"), element(Locators.xpath, "(//div[text()='"+announcementData[2]+"'])[2]"));
		action.click().build().perform();
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		click(element(Locators.xpath, "//i[@class='fas fa-refresh']"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), announcementData[0]);


	}

	@Test(dataProvider="ScriptData",dataProviderClass=SeleniumBase.class)
	public void configTC019(String scriptdata[]) {

		Actions action = new Actions(driver);
		click(element(Locators.xpath, "//span[text()='Scripts']"));
		click(element(Locators.xpath, "//div[text()='script']/following-sibling::button"));
		type(element(Locators.xpath, "//input[@aria-label='Script_name']"), scriptdata[0]);
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[2]"), scriptdata[1]);
		click(element(Locators.xpath, "(//label[text()='"+scriptdata[4]+"'])[1]"));

		if(scriptdata[4].equalsIgnoreCase("Text")) {
			click(element(Locators.xpath, "(//label[text()='"+scriptdata[4]+"'])[1]"));
			type(element(Locators.xpath, "//label[text()='Text']/following::textarea"), scriptdata[3]);
			click(element(Locators.xpath, "//div[text()='Create']"));
			click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
			click(element(Locators.xpath, "//i[@class='fas fa-refresh']"));
		}

		else if (scriptdata[4].equalsIgnoreCase("URL")) {
			click(element(Locators.xpath, "(//label[text()='"+scriptdata[4]+"'])[1]"));
			type(element(Locators.xpath, "//input[@type='url']"), scriptdata[2]);
			click(element(Locators.xpath, "//div[text()='Create']"));
			click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
			click(element(Locators.xpath, "//i[@class='fas fa-refresh']"));
		}

		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), scriptdata[0]);



	}

	@Test(dataProvider="InboundData",dataProviderClass=SeleniumBase.class)
	public void configTC020(String inbounddata[]) {

		click(element(Locators.xpath, "//span[text()='Inbound Route']"));
		click(element(Locators.xpath, "//div[text()='Inbound Route']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='DID Number'])[2]"), inbounddata[0]);
		type(element(Locators.xpath, "(//input[@aria-label='DID Name'])[2]"), inbounddata[1]);
		click(element(Locators.xpath, "//label[text()='Destination Name']/following-sibling::div"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[6]"), element(Locators.xpath, "(//div[text()='"+inbounddata[2]+"'])[3]"));
		click(element(Locators.xpath, "//label[text()='Destination Value']/following-sibling::div"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[5]"), element(Locators.xpath, "(//div[text()='"+inbounddata[3]+"'])[2]"));
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), inbounddata[0]);

	}

	@Test(dataProvider="TimezoneData",dataProviderClass=SeleniumBase.class)
	public void configTC021(String timezonedata[]) {

		click(element(Locators.xpath, "//span[text()='Timezone']"));
		click(element(Locators.xpath, "//div[text()='Timezone']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Zone Name'])[2]"), timezonedata[0]);
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[2]"), timezonedata[1]);
		click(element(Locators.xpath, "(//input[@aria-label='Start Time'])[2]"));
		click(element(Locators.xpath, "//span[text()='"+timezonedata[2]+"']"));
		click(element(Locators.xpath, "//span[text()='"+timezonedata[3]+"']"));
		click(element(Locators.xpath, "(//input[@aria-label='End Time'])[2]"));
		click(element(Locators.xpath, "//span[text()='"+timezonedata[4]+"']"));
		click(element(Locators.xpath, "//span[text()='"+timezonedata[5]+"']"));
		click(element(Locators.xpath, "(//label[text()='Status']/following-sibling::div)[3]"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[4]"), element(Locators.xpath, "(//div[text()='"+timezonedata[6]+"'])[3]"));
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), timezonedata[0]);


	}


	@Test(dataProvider="MeetingTitleData",dataProviderClass=SeleniumBase.class)
	public void configTC022(String meetingtitledata[]) {

		click(element(Locators.xpath, "//span[text()='Meeting Title']"));
		click(element(Locators.xpath, "//div[text()='Meeting Title']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Meeting Title'])[2]"), meetingtitledata[0]);
		type(element(Locators.xpath, "//input[@aria-label='Meeting Sub Title']"), meetingtitledata[1]);
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[3]"), meetingtitledata[2]);
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), meetingtitledata[0]);


	}
	

	//Updation Flow
	

	@Test(dataProvider="DispoData",dataProviderClass=SeleniumBase.class)
	public void configTC023(String dispodata[]) {

		click(element(Locators.xpath, "//span[text()='Dispositions']"));
		click(element(Locators.xpath, "//td[text()='"+dispodata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		click(element(Locators.xpath, "(//label[text()='Status']/following-sibling::div)[1]"));
		consoleLog();
		dropdown(element(Locators.xpath, "(//div[@role='list'])[3]"), element(Locators.xpath, "(//div[text()='"+dispodata[5]+"'])[3]"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		updateAssert(element(Locators.xpath, "//td[text()='"+dispodata[0]+"']//following-sibling::td[2]"), dispodata[5]);

	}
	
	@Test(dataProvider="SubDispoData",dataProviderClass=SeleniumBase.class)
	public void configTC024(String subdispoData[]) {

		click(element(Locators.xpath, "//span[text()='Sub-Dispositions']"));
		click(element(Locators.xpath, "//td[text()='"+subdispoData[1]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		click(element(Locators.xpath, "(//label[text()='Status']/following-sibling::div)[1]"));
		consoleLog();
		dropdown(element(Locators.xpath, "(//div[@role='list'])[3]"), element(Locators.xpath, "(//div[text()='"+subdispoData[5]+"'])[3]"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		updateAssert(element(Locators.xpath, "//td[text()='"+subdispoData[1]+"']//following-sibling::td[2]"), subdispoData[5]);


	}
	
	
	@Test(dataProvider="LeadStatusData",dataProviderClass=SeleniumBase.class)
	public void configTC025(String leadstatusdata[]) {

		click(element(Locators.xpath, "//span[text()='Lead Status']"));
		click(element(Locators.xpath, "//td[text()='"+leadstatusdata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		click(element(Locators.xpath, "(//label[text()='Status']/following-sibling::div)[1]"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[3]"), element(Locators.xpath, "(//div[text()='"+leadstatusdata[2]+"'])[2]"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		updateAssert(element(Locators.xpath, "//td[text()='"+leadstatusdata[0]+"']//following-sibling::td[2]"), leadstatusdata[2]);

	}

	@Test(dataProvider="TicketStatusData",dataProviderClass=SeleniumBase.class)
	public void configTC026(String ticketStatusdata[]) {

		click(element(Locators.xpath, "//span[text()='Ticket Status']"));
		click(element(Locators.xpath, "//td[text()='"+ticketStatusdata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		click(element(Locators.xpath, "(//label[text()='Status']/following-sibling::div)[1]"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[3]"), element(Locators.xpath, "(//div[text()='"+ticketStatusdata[4]+"'])[2]"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		updateAssert(element(Locators.xpath, "//td[text()='"+ticketStatusdata[0]+"']//following-sibling::td[2]"), ticketStatusdata[4]);


	}
	
	@Test(dataProvider="PausecodeData",dataProviderClass=SeleniumBase.class)
	public void configTC027(String pausecodedata[]) {

		click(element(Locators.xpath, "//span[text()='Pause Codes']"));
		click(element(Locators.xpath, "//td[text()='"+pausecodedata[0]+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		click(element(Locators.xpath, "//label[text()='Status']/following-sibling::div"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[2]"), element(Locators.xpath, "//div[text()='"+pausecodedata[6]+"']"));
		click(element(Locators.xpath, "(//input[@aria-label='Time'])[1]"));
		click(element(Locators.xpath, "//span[text()='0']"));
		click(element(Locators.xpath, "//span[text()='30']"));
		click(element(Locators.xpath, "//div[text()=' OK ']"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		updateAssert(element(Locators.xpath, "//td[text()='"+pausecodedata[0]+"']//following-sibling::td[2]"), pausecodedata[6]);
		Assert.assertEquals(getText(element(Locators.xpath, "//td[text()='"+pausecodedata[0]+"']//following-sibling::td[3]")), "00:00:30");

	}
	
	@Test(dataProvider="AudioData",dataProviderClass=SeleniumBase.class)
	public void configTC028(String audiodata[]) {

		click(element(Locators.xpath, "//span[text()='Audio Store']"));
		click(element(Locators.xpath, "//td[text()='"+audiodata[0]+"']//following-sibling::td[2]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		click(element(Locators.xpath, "(//label[text()='Status']/following-sibling::div)[1]"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[3]"), element(Locators.xpath, "(//div[text()='"+audiodata[2]+"'])[2]"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		updateAssert(element(Locators.xpath, "//td[text()='"+audiodata[0]+"']//following-sibling::td[1]"), audiodata[2]);


	}
	
	@Test(dataProvider="DidData",dataProviderClass=SeleniumBase.class)
	public void configTC029(String diddata[]) {

		click(element(Locators.xpath, "//span[text()='DID Number']"));
		click(element(Locators.xpath, "//td[text()='"+diddata[0]+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		click(element(Locators.xpath, "//label[text()='Status']/following-sibling::div"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[2]"), element(Locators.xpath, "//div[text()='"+diddata[5]+"']"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		updateAssert(element(Locators.xpath, "//td[text()='"+diddata[0]+"']//following-sibling::td[2]"), diddata[5]);


	}
	
	@Test(dataProvider="TagData",dataProviderClass=SeleniumBase.class)
	public void configTC030(String tagdata[]) {

		click(element(Locators.xpath, "//span[text()='Tags']"));
		click(element(Locators.xpath, "//td[text()='"+tagdata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text']"));
		click(element(Locators.xpath, "//label[text()='Status']/following-sibling::div"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[2]"), element(Locators.xpath, "//div[text()='"+tagdata[4]+"']"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "//div[text()='Close']"));
		updateAssert(element(Locators.xpath, "//td[text()='"+tagdata[0]+"']//following-sibling::td[2]"), tagdata[4]);


	}
	
	@Test(dataProvider="AnnouncementData",dataProviderClass=SeleniumBase.class)
	public void configTC031(String announcementData[]) {

		click(element(Locators.xpath, "//span[text()='Announcements']"));
		click(element(Locators.xpath, "//td[text()='"+announcementData[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		click(element(Locators.xpath, "//label[text()='Status']/following-sibling::div"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[4]"), element(Locators.xpath, "(//div[text()='"+announcementData[5]+"'])[2]"));
		click(element(Locators.xpath, "//div[text()='Update']"));		
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		updateAssert(element(Locators.xpath, "//td[text()='"+announcementData[0]+"']//following-sibling::td[2]"), announcementData[5]);

	}
	
	@Test(dataProvider="ScriptData",dataProviderClass=SeleniumBase.class)
	public void configTC032(String scriptdata[]) {

		click(element(Locators.xpath, "//span[text()='Scripts']"));
		click(element(Locators.xpath, "//td[text()='"+scriptdata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		click(element(Locators.xpath, "//label[text()='Status']/following-sibling::div"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[2]"), element(Locators.xpath, "//div[text()='"+scriptdata[7]+"']"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		click(element(Locators.xpath, "//i[@class='fas fa-refresh']"));
		updateAssert(element(Locators.xpath, "//td[text()='"+scriptdata[0]+"']//following-sibling::td[2]"), scriptdata[7]);


	}
	
	
	@Test(dataProvider="TimezoneData",dataProviderClass=SeleniumBase.class)
	public void configTC033(String timezonedata[]) {

		click(element(Locators.xpath, "//span[text()='Timezone']"));
		click(element(Locators.xpath, "//td[text()='"+timezonedata[0]+"']//following-sibling::td[5]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		click(element(Locators.xpath, "(//label[text()='Status']/following-sibling::div)[1]"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[3]"), element(Locators.xpath, "//div[text()='"+timezonedata[8]+"']"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		updateAssert(element(Locators.xpath, "//td[text()='"+timezonedata[0]+"']//following-sibling::td[2]"), timezonedata[8]);


	}
	
	@Test(dataProvider="MeetingTitleData",dataProviderClass=SeleniumBase.class)
	public void configTC034(String meetingtitledata[]) {

		click(element(Locators.xpath, "//span[text()='Meeting Title']"));
		click(element(Locators.xpath, "//td[text()='"+meetingtitledata[0]+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		click(element(Locators.xpath, "(//label[text()='Status']/following-sibling::div)[1]"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[3]"), element(Locators.xpath, "//div[text()='"+meetingtitledata[5]+"']"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), meetingtitledata[0]);


	}
	


	//Deletion Flow

	@Test(dataProvider="QueueData",dataProviderClass=SeleniumBase.class)
	public void configTC035(String queuedata[]) {

		click(element(Locators.xpath, "//span[text()='Queues']"));
		click(element(Locators.xpath, "//td[text()='"+queuedata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), queuedata[0]);

	}

	@Test(dataProvider="DispoData",dataProviderClass=SeleniumBase.class)
	public void configTC036(String dispodata[]) {

		click(element(Locators.xpath, "//span[text()='Dispositions']"));
		click(element(Locators.xpath, "//td[text()='"+dispodata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), dispodata[0]);


	}

	@Test(dataProvider="SubDispoData",dataProviderClass=SeleniumBase.class)
	public void configTC037(String subdispoData[]) {

		click(element(Locators.xpath, "//span[text()='Sub-Dispositions']"));
		click(element(Locators.xpath, "//td[text()='"+subdispoData[1]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[2]"), subdispoData[1]);


	}

	@Test(dataProvider="LeadStatusData",dataProviderClass=SeleniumBase.class)
	public void configTC038(String leadstatusdata[]) {

		click(element(Locators.xpath, "//span[text()='Lead Status']"));
		click(element(Locators.xpath, "//td[text()='"+leadstatusdata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), leadstatusdata[0]);

	}

	@Test(dataProvider="TicketStatusData",dataProviderClass=SeleniumBase.class)
	public void configTC039(String ticketStatusdata[]) {

		click(element(Locators.xpath, "//span[text()='Ticket Status']"));
		click(element(Locators.xpath, "//td[text()='"+ticketStatusdata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), ticketStatusdata[0]);


	}

	@Test(dataProvider="PausecodeData",dataProviderClass=SeleniumBase.class)
	public void configTC040(String pausecodedata[]) {

		click(element(Locators.xpath, "//span[text()='Pause Codes']"));
		click(element(Locators.xpath, "//td[text()='"+pausecodedata[0]+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), pausecodedata[0]);


	}

	@Test(dataProvider="AudioData",dataProviderClass=SeleniumBase.class)
	public void configTC041(String audiodata[]) {

		click(element(Locators.xpath, "//span[text()='Audio Store']"));
		click(element(Locators.xpath, "//td[text()='"+audiodata[0]+"']//following-sibling::td[2]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[3]"), audiodata[0]);


	}

	@Test(dataProvider="BlocklistData",dataProviderClass=SeleniumBase.class)
	public void configTC042(String blocklistdata[]) {

		click(element(Locators.xpath, "//span[text()='Block List']"));
		click(element(Locators.xpath, "	//td[text()='9090909091']//following-sibling::td[1]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));  
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[2]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[2]"), blocklistdata[2]);

	}

	
	@Test(dataProvider="DidData",dataProviderClass=SeleniumBase.class)
	public void configTC043(String diddata[]) {

		click(element(Locators.xpath, "//span[text()='DID Number']"));
		click(element(Locators.xpath, "//td[text()='"+diddata[0]+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[2]"), diddata[0]);


	}
	
	@Test(dataProvider="TagData",dataProviderClass=SeleniumBase.class)
	public void configTC044(String tagdata[]) {

		click(element(Locators.xpath, "//span[text()='Tags']"));
		click(element(Locators.xpath, "//td[text()='"+tagdata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "//div[text()='Close']"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), tagdata[0]);


	}
	
	@Test(dataProvider="AnnouncementData",dataProviderClass=SeleniumBase.class)
	public void configTC045(String announcementData[]) {

		click(element(Locators.xpath, "//span[text()='Announcements']"));
		click(element(Locators.xpath, "//td[text()='"+announcementData[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), announcementData[0]);

	}
	
	@Test(dataProvider="ScriptData",dataProviderClass=SeleniumBase.class)
	public void configTC046(String scriptdata[]) {

		click(element(Locators.xpath, "//span[text()='Scripts']"));
		click(element(Locators.xpath, "//td[text()='"+scriptdata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		click(element(Locators.xpath, "//i[@class='fas fa-refresh']"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), scriptdata[0]);


	}
	
	@Test(dataProvider="InboundData",dataProviderClass=SeleniumBase.class)
	public void configTC047(String inbounddata[]) {

		click(element(Locators.xpath, "//span[text()='Inbound Route']"));
		click(element(Locators.xpath, "//td[text()='"+inbounddata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), inbounddata[0]);

	}
	
	@Test(dataProvider="TimezoneData",dataProviderClass=SeleniumBase.class)
	public void configTC048(String timezonedata[]) {

		click(element(Locators.xpath, "//span[text()='Timezone']"));
		click(element(Locators.xpath, "//td[text()='"+timezonedata[0]+"']//following-sibling::td[5]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), timezonedata[0]);


	}
	
	@Test(dataProvider="MeetingTitleData",dataProviderClass=SeleniumBase.class)
	public void configTC049(String meetingtitledata[]) {

		click(element(Locators.xpath, "//span[text()='Meeting Title']"));
		click(element(Locators.xpath, "//td[text()='"+meetingtitledata[0]+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), meetingtitledata[0]);


	}
	
	

}




