package org.doocti.AdminTestCase;

import static org.testng.Assert.assertEquals;

import org.apache.poi.ss.usermodel.ClientAnchor;
import org.doocti.seleniumEnum.Locators;
import org.doocti.seleniumbase.SeleniumBase;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CRMTest extends SeleniumBase{
	
	@BeforeTest
	public void CRM() {
		
		click(element(Locators.xpath, "//div[text()='CRM']"));
		
	}

	/*		<============================================ CRM Creations ==============================================>       */
	
	@Test(dataProvider="CampaignData")
	public void crmTC065(String campaigndata[]) {
		
		click(element(Locators.xpath, "//span[text()='Campaigns']"));
		isDisplay(element(Locators.xpath, "//div[text()='Campaign']/following-sibling::button"));
		click(element(Locators.xpath, "//div[text()='Campaign']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), campaigndata[0]);
		click(element(Locators.xpath, "(//label[text()='Process']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='Leads'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Tickets'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Meetings'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Type']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='PREVIEW'])[3]"));
		click(element(Locators.xpath, "(//label[text()='Industry']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[2]+"'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Template Name']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "//div[text()='"+campaigndata[3]+"']"));
		click(element(Locators.xpath, "(//input[@aria-label='Add Queue'])[2]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[4]+"'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
		click(element(Locators.xpath, "(//input[@aria-label='Pause Code'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Meeting'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Lunch'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Tea Break'])[2]"));
		click(element(Locators.xpath, "(//input[@aria-label='Dial Status'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-list__tile__title'][normalize-space()='Not Interested'])[4]"));
		click(element(Locators.xpath, "((//label[text()='Dispo Status'])[2]/following::input)[1]"));
		click(element(Locators.xpath, "(//div[text()='Not Interested'])[3]"));
		click(element(Locators.xpath, "(//label[text()='Script_name']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[8]+"'])[2]"));
		click(element(Locators.xpath, "(//label[text()='DNC check'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Call Masking'])[2]"));
		click(element(Locators.xpath, "(//label[text()='On Demand Recording'])[2]"));
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"),campaigndata[0] );

		

	}
	
	@Test(dataProvider="CampaignData")
	public void crmTC066(String campaigndata[]) {
		
		click(element(Locators.xpath, "//span[text()='Campaigns']"));
		isDisplay(element(Locators.xpath, "//div[text()='Campaign']/following-sibling::button"));
		click(element(Locators.xpath, "//div[text()='Campaign']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), campaigndata[11]);
		click(element(Locators.xpath, "(//label[text()='Process']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='Leads'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Tickets'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Meetings'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Type']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='PREDICTIVE'])[3]"));
		click(element(Locators.xpath, "(//label[text()='Industry']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[2]+"'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Template Name']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "//div[text()='"+campaigndata[3]+"']"));
		click(element(Locators.xpath, "(//input[@aria-label='Add Queue'])[2]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[4]+"'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
		click(element(Locators.xpath, "(//input[@aria-label='Pause Code'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Meeting'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Lunch'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Tea Break'])[2]"));
		click(element(Locators.xpath, "(//input[@aria-label='Dial Status'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-list__tile__title'][normalize-space()='Not Interested'])[4]"));
		click(element(Locators.xpath, "((//label[text()='Dispo Status'])[2]/following::input)[1]"));
		click(element(Locators.xpath, "(//div[text()='Not Interested'])[3]"));
		click(element(Locators.xpath, "//label[text()='Buffer Level']/following-sibling::div"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[5]+"'])[1]"));
		click(element(Locators.xpath, "//label[text()='Dial Ratio']/following-sibling::div"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[6]+"'])[1]"));
		type(element(Locators.xpath, "(//input[@aria-label='Dial Prefix'])[2]"), campaigndata[7]);
		click(element(Locators.xpath, "(//label[text()='Script_name']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[8]+"'])[2]"));
		click(element(Locators.xpath, "(//label[text()='DNC check'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Call Masking'])[2]"));
		click(element(Locators.xpath, "(//label[text()='On Demand Recording'])[2]"));
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"),campaigndata[11] );

	}
	
	@Test(dataProvider="CampaignData")
	public void crmTC067(String campaigndata[]) {
		
		click(element(Locators.xpath, "//span[text()='Campaigns']"));
		isDisplay(element(Locators.xpath, "//div[text()='Campaign']/following-sibling::button"));
		click(element(Locators.xpath, "//div[text()='Campaign']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), campaigndata[13]);
		click(element(Locators.xpath, "(//label[text()='Process']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='Leads'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Tickets'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Meetings'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Type']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='INBOUND'])[3]"));
		click(element(Locators.xpath, "(//label[text()='Industry']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[2]+"'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Template Name']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "//div[text()='"+campaigndata[3]+"']"));
		click(element(Locators.xpath, "(//input[@aria-label='Add Queue'])[2]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[4]+"'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
		click(element(Locators.xpath, "(//input[@aria-label='Pause Code'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Meeting'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Lunch'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Tea Break'])[2]"));
		click(element(Locators.xpath, "(//input[@aria-label='Dial Status'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-list__tile__title'][normalize-space()='Not Interested'])[4]"));
		click(element(Locators.xpath, "((//label[text()='Dispo Status'])[2]/following::input)[1]"));
		click(element(Locators.xpath, "(//div[text()='Not Interested'])[3]"));
		click(element(Locators.xpath, "(//label[text()='Script_name']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[8]+"'])[2]"));
		click(element(Locators.xpath, "(//label[text()='DNC check'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Call Masking'])[2]"));
		click(element(Locators.xpath, "(//label[text()='On Demand Recording'])[2]"));
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"),campaigndata[13] );

		

	}
	@Test(dataProvider="CampaignData")
	public void crmTC068(String campaigndata[]) {
		
		click(element(Locators.xpath, "//span[text()='Campaigns']"));
		isDisplay(element(Locators.xpath, "//div[text()='Campaign']/following-sibling::button"));
		click(element(Locators.xpath, "//div[text()='Campaign']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), campaigndata[15]);
		click(element(Locators.xpath, "(//label[text()='Process']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='Leads'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Tickets'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Meetings'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Type']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='POWER'])[3]"));
		click(element(Locators.xpath, "(//label[text()='Industry']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[2]+"'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Template Name']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "//div[text()='"+campaigndata[3]+"']"));
		click(element(Locators.xpath, "(//input[@aria-label='Add Queue'])[2]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[4]+"'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
		click(element(Locators.xpath, "(//input[@aria-label='Pause Code'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Meeting'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Lunch'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Tea Break'])[2]"));
		click(element(Locators.xpath, "(//input[@aria-label='Dial Status'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-list__tile__title'][normalize-space()='Not Interested'])[4]"));
		click(element(Locators.xpath, "((//label[text()='Dispo Status'])[2]/following::input)[1]"));
		click(element(Locators.xpath, "(//div[text()='Not Interested'])[3]"));
		click(element(Locators.xpath, "//label[text()='Buffer Level']/following-sibling::div"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[5]+"'])[1]"));
		click(element(Locators.xpath, "//label[text()='Dial Ratio']/following-sibling::div"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[6]+"'])[1]"));
		type(element(Locators.xpath, "(//input[@aria-label='Dial Prefix'])[2]"), campaigndata[7]);
		click(element(Locators.xpath, "(//label[text()='Script_name']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[8]+"'])[2]"));
		click(element(Locators.xpath, "(//label[text()='DNC check'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Call Masking'])[2]"));
		click(element(Locators.xpath, "(//label[text()='On Demand Recording'])[2]"));
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"),campaigndata[15] );

	}
	
	@Test(dataProvider="CampaignData")
	public void crmTC069(String campaigndata[]) {
		
		click(element(Locators.xpath, "//span[text()='Campaigns']"));
		isDisplay(element(Locators.xpath, "//div[text()='Campaign']/following-sibling::button"));
		click(element(Locators.xpath, "//div[text()='Campaign']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), campaigndata[17]);
		click(element(Locators.xpath, "(//label[text()='Process']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='Leads'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Tickets'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Meetings'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Type']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='VOICE BLAST'])[3]"));
		click(element(Locators.xpath, "(//label[text()='Industry']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[2]+"'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Template Name']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "//div[text()='"+campaigndata[3]+"']"));
		click(element(Locators.xpath, "(//input[@aria-label='Add Queue'])[2]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[4]+"'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
		click(element(Locators.xpath, "(//input[@aria-label='Pause Code'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Meeting'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Lunch'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Tea Break'])[2]"));
		click(element(Locators.xpath, "(//input[@aria-label='Dial Status'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-list__tile__title'][normalize-space()='Not Interested'])[4]"));
		click(element(Locators.xpath, "((//label[text()='Dispo Status'])[2]/following::input)[1]"));
		click(element(Locators.xpath, "(//div[text()='Not Interested'])[3]"));
		click(element(Locators.xpath, "//label[text()='Buffer Level']/following-sibling::div"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[5]+"'])[1]"));
		click(element(Locators.xpath, "(//label[text()='Script_name']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[8]+"'])[2]"));
		scroll(element(Locators.xpath, "(//div[@class='v-card__text'])[3]"), 100);
		click(element(Locators.xpath, "//label[text()='Channels']/following-sibling::div"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[9]+"'])[1]"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Start Time']/following::input)[1]"));
		click(element(Locators.xpath, "//span[text()='0']"));
		click(element(Locators.xpath, "//span[text()='00']"));
		click(element(Locators.xpath, "(//label[text()='End Time']/following::input)[1]"));
		click(element(Locators.xpath, "//span[text()='11']"));
		click(element(Locators.xpath, "//span[text()='00']"));
		click(element(Locators.xpath, "(//label[text()='Days']/following::input)[1]"));
		click(element(Locators.xpath, "//div[text()='Sunday']"));
		click(element(Locators.xpath, "//div[text()='Monday']"));
		click(element(Locators.xpath, "//div[text()='Tuesday']"));
		click(element(Locators.xpath, "//div[text()='Wednesday']"));
		click(element(Locators.xpath, "//div[text()='Thursday']"));
		click(element(Locators.xpath, "//div[text()='Friday']"));
		click(element(Locators.xpath, "//div[text()='Saturday']"));
		type(element(Locators.xpath, "(//input[@aria-label='Dial Prefix'])[2]"), campaigndata[7]);
		click(element(Locators.xpath, "(//label[text()='DNC check'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Call Masking'])[2]"));
		click(element(Locators.xpath, "(//label[text()='On Demand Recording'])[2]"));
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"),campaigndata[17] );

	}
	
	@Test(dataProvider="CampaignData")
	public void crmTC070(String campaigndata[]) {
		
		click(element(Locators.xpath, "//span[text()='Campaigns']"));
		isDisplay(element(Locators.xpath, "//div[text()='Campaign']/following-sibling::button"));
		click(element(Locators.xpath, "//div[text()='Campaign']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), campaigndata[19]);
		click(element(Locators.xpath, "(//label[text()='Process']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='Leads'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Tickets'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Meetings'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Type']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='WHATSAPP BLAST'])[3]"));
		click(element(Locators.xpath, "(//label[text()='Industry']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+campaigndata[2]+"'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Template Name']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "//div[text()='"+campaigndata[3]+"']"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
		click(element(Locators.xpath, "(//label[text()='Start Time']/following::input)[1]"));
		click(element(Locators.xpath, "//span[text()='0']"));
		click(element(Locators.xpath, "//span[text()='00']"));
		click(element(Locators.xpath, "(//label[text()='End Time']/following::input)[1]"));
		click(element(Locators.xpath, "//span[text()='11']"));
		click(element(Locators.xpath, "//span[text()='00']"));
		click(element(Locators.xpath, "(//label[text()='Days']/following::input)[1]"));
		click(element(Locators.xpath, "//div[text()='Sunday']"));
		click(element(Locators.xpath, "//div[text()='Monday']"));
		click(element(Locators.xpath, "//div[text()='Tuesday']"));
		click(element(Locators.xpath, "//div[text()='Wednesday']"));
		click(element(Locators.xpath, "//div[text()='Thursday']"));
		click(element(Locators.xpath, "//div[text()='Friday']"));
		click(element(Locators.xpath, "//div[text()='Saturday']"));
		type(element(Locators.xpath, "(//input[@aria-label='Dial Prefix'])[2]"), campaigndata[7]);
		click(element(Locators.xpath, "//label[text()='WhatApp Type']/following-sibling::div"));
		click(element(Locators.xpath, "//div[text()='Text']"));
		click(element(Locators.xpath, "//label[text()='WhatApp Template']/following-sibling::div"));
		click(element(Locators.xpath, "//label[text()='WhatApp Template']/following-sibling::div"));
		click(element(Locators.xpath, "//label[text()='WhatApp Language']/following-sibling::div"));
		click(element(Locators.xpath, "//label[text()='WhatApp Template']/following-sibling::div"));

		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"),campaigndata[19] );

	}

	
	@Test(dataProvider="ListData")
	public void CRMTC071(String listdata[] ) {
		
		click(element(Locators.xpath, "//span[text()='Lists']"));
		isDisplay(element(Locators.xpath, "//div[text()='List']/following-sibling::button"));
		click(element(Locators.xpath, "//div[text()='List']/following-sibling::button"));
		type(element(Locators.xpath , "(//input[@aria-label='List ID'])[2]"), listdata[0]);
		type(element(Locators.xpath , "(//input[@aria-label='Name'])[2]"), listdata[1]);
		type(element(Locators.xpath , "(//input[@aria-label='Description'])[2]"), listdata[2]);
		click(element(Locators.xpath, "(//label[text()='Campaign']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+listdata[3]+"'])[3]"));
		click(element(Locators.xpath, "(//label[text()='Recycling']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+listdata[4]+"'])[2]"));
		click(element(Locators.xpath, "(//div[text()='Create'])[1]"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"),listdata[0]);

	}
	
	@Test(dataProvider="ContactData")
	public void CRMTC072(String contactdata[]) {
		
		click(element(Locators.xpath, "//span[text()='Contacts']"));
		isDisplay(element(Locators.xpath, "//div[text()='Contacts']/following-sibling::button"));
		click(element(Locators.xpath, "//div[text()='Contacts']/following-sibling::button"));
		click(element(Locators.className, "file-dummy"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
		robot(contactdata[2]);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
		assertEquals(getText(element(Locators.className, "file-dummy")), "Uploaded Successfully");
		click(element(Locators.xpath, "//div[text()='Close']"));

	}
	
	@Test(dataProvider="TicketData")
	public void CRMTC073(String ticketdata[]) {
		
		click(element(Locators.xpath, "//span[text()='Tickets']"));
		isDisplay(element(Locators.xpath, "//i[@class='fas fa-plus']"));
		click(element(Locators.xpath, "//i[@class='fas fa-plus']"));
		click(element(Locators.xpath, "//input[@aria-label='Status']"));
		click(element(Locators.xpath, "//div[text()='"+ticketdata[0]+"']"));
		type(element(Locators.xpath, "//input[@aria-label='Account Name']"), ticketdata[1]);
		type(element(Locators.xpath, "(//input[@aria-label='Subject'])[2]"), ticketdata[2]);
		type(element(Locators.xpath, "//textarea[@aria-label='Description']"), ticketdata[3]);
		type(element(Locators.xpath, "(//input[@aria-label='PhoneNumber'])[2]"), ticketdata[4]);
		click(element(Locators.xpath, "//input[@aria-label='DueDate']"));
		click(element(Locators.xpath, "//div[text()='"+ticketdata[5]+"']"));
		click(element(Locators.xpath, "(//input[@aria-label='Priority'])[2]"));
		click(element(Locators.xpath, "(//div[text()='"+ticketdata[6]+"'])[1]"));
		click(element(Locators.xpath, "(//input[@aria-label='Channel'])[2]"));
		click(element(Locators.xpath, "(//div[text()='"+ticketdata[7]+"'])[1]"));
		click(element(Locators.xpath, "//i[contains(@class,'fa fa-floppy-o')]"));
		click(element(Locators.xpath, "//div[text()='Yes, Create !']"));
		
	}
	
	
	@Test(dataProvider="MeetingData")
	public void CRMTC074(String meetingdata[]) {
		
		click(element(Locators.xpath, "//span[text()='Meetings']"));
		isDisplay(element(Locators.xpath, "//div[text()='Meetings']/following-sibling::button"));
		click(element(Locators.xpath, "//div[text()='Meetings']/following-sibling::button"));
		click(element(Locators.xpath, "//label[text()='Meeting title']/following-sibling::div"));
		click(element(Locators.xpath, "//div[text()='"+meetingdata[0]+"']"));
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[2]"), meetingdata[1]);
		type(element(Locators.xpath, "//input[@aria-label='Phone Number']"), meetingdata[2]);
		click(element(Locators.xpath, "(//label[text()='Agent']/following-sibling::div)[3]"));
		click(element(Locators.xpath, "(//div[text()='"+meetingdata[3]+""));
		click(element(Locators.xpath, "((//label[text()='Meeting Date'])[2]/following::input)[1]"));
//		click(element(Locators.xpath, "//span[text()='22']"));
		click(element(Locators.xpath, "//div[text()='Ok']"));
		click(element(Locators.xpath, "//div[text()='Ok']"));
		click(element(Locators.xpath, "(//label[text()='Module']/following-sibling::div)[1]"));
		click(element(Locators.xpath, "(//div[text()='"+meetingdata[5]+"'])[3]"));
		click(element(Locators.xpath, "//label[text()='Template']/following-sibling::div"));
		click(element(Locators.xpath, "//div[text()='"+meetingdata[6]+"']"));
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		
		
	}
}
