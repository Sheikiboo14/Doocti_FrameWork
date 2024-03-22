package org.doocti.AdminTestCase;

import org.doocti.seleniumEnum.Locators;
import org.doocti.seleniumbase.SeleniumBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UsersGroupTest extends SeleniumBase{


	@BeforeTest
	public void userdgroup() {

		click(element(Locators.xpath, "//div[text()='Users & Groups']"));
	}

/*		<============================================ Users and Groups Creations ==============================================>       */

	
	@Test(dataProvider="UserGroupData")
	public void usergroupTC050(String usergroupdata[]) {

		click(element(Locators.xpath, "//span[text()='User Group']"));
		isDisplay(element(Locators.xpath, "//i[text()='add_circle']"));
		click(element(Locators.xpath, "//i[text()='add_circle']"));
		type(element(Locators.xpath, "//input[@aria-label='New Group']"), usergroupdata[0]);
		click(element(Locators.xpath, "//div[text()='Save']"));
		click(element(Locators.xpath, "//div[text()='Close']"));
		click(element(Locators.xpath, "//label[text()='User Group']/following-sibling::div"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[1]"), element(Locators.xpath, "(//div[text()='"+usergroupdata[0]+"'])[1]"));
		click(element(Locators.xpath, "(//input[@role='checkbox']/following-sibling::div)[1]"));	
		click(element(Locators.xpath, "//i[text()='save']"));
		click(element(Locators.xpath, "//div[text()='Yes, Save !']"));
		click(element(Locators.xpath, "//div[text()='Close']"));
		click(element(Locators.xpath, "//label[text()='User Group']/following-sibling::div"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[1]"), element(Locators.xpath, "(//div[text()='"+usergroupdata[0]+"'])[1]"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		getText(element(Locators.xpath, "//label[text()='Group']/following-sibling::input"), usergroupdata[0]);
	}
	
	@Test(dataProvider="UserData")
	public void usergroupTC051(String userdata[]) {

		click(element(Locators.xpath, "//span[text()='Users']"));
		isDisplay(element(Locators.xpath, "//div[text()='User Management']/following-sibling::button"));
		click(element(Locators.xpath, "//div[text()='User Management']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='User Id'])[2]"), userdata[0]);
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), userdata[1]);
		type(element(Locators.xpath, "(//input[@aria-label='Mobile Number'])[2]"), userdata[2]);
		type(element(Locators.xpath, "(//input[@aria-label='Email Id'])[2]"), userdata[3]);
		type(element(Locators.xpath, "//input[@aria-label='Password']"), userdata[4]);
		scroll(element(Locators.xpath, "(//div[@class='v-card__text'])[3]"), 300);
		click(element(Locators.xpath, "(//label[text()='Role']/following-sibling::div)[3]"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[6]"), element(Locators.xpath, "(//div[text()='"+userdata[5]+"'])[2]"));
		click(element(Locators.xpath, "//label[text()='Group']/following-sibling::div"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[5]"), element(Locators.xpath, "(//div[text()='"+userdata[6]+"'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[6]"));
		click(element(Locators.xpath, "(//div[text()='Create'])[2]"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[7]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[3]"), userdata[3]);

	
	}
	
	@Test(dataProvider="ChannelData")
	public void usergroupTC052(String channeldata[]) {
		
		click(element(Locators.xpath, "//span[text()='Channel']"));
		isDisplay(element(Locators.xpath, "//div[text()='Channel']/following-sibling::button"));
		click(element(Locators.xpath, "//div[text()='Channel']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), channeldata[0]);
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[2]"), channeldata[1]);
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), channeldata[0]);


		
	}
	
	@Test(dataProvider="SourceData")
	public void usergroupTC053(String sourcedata[]) {
		
		click(element(Locators.xpath, "//span[text()='Source']"));
		isDisplay(element(Locators.xpath, "//div[text()='Source']/following-sibling::button"));
		click(element(Locators.xpath, "//div[text()='Source']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), sourcedata[0]);
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[2]"), sourcedata[1]);
		click(element(Locators.xpath, "//div[text()='Create']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), sourcedata[0]);
		
	}
	
	@Test(dataProvider="TeamData")
	public void usergroupTC054(String teamdata[]) {
		
		click(element(Locators.xpath, "//span[text()='Team']"));
		click(element(Locators.xpath, "//i[@class='fas fa-refresh']"));
		isDisplay(element(Locators.xpath, "//div[text()='Team Management']/following-sibling::button"));
		click(element(Locators.xpath, "//div[text()='Team Management']/following-sibling::button"));
		type(element(Locators.xpath, "(//input[@aria-label='Name'])[2]"), teamdata[0]);
		type(element(Locators.xpath, "(//input[@aria-label='Description'])[2]"), teamdata[1]);
		click(element(Locators.xpath, "(//label[text()='Type']/following-sibling::div)[3]"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[8]"), element(Locators.xpath, "(//div[text()='"+teamdata[2]+"'])[2]"));
		
		switch (teamdata[2]) {
		
		case "All":
			
			click(element(Locators.xpath, "//label[text()='Lead Source']/following-sibling::div"));
//			dropdown(element(Locators.xpath, "(//div[@role='list'])[2]"), 
			click(element(Locators.xpath, "//div[text()='"+teamdata[3]+"']"));
			click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
			click(element(Locators.xpath, "//label[text()='Channel']/following-sibling::div"));
//			dropdown(element(Locators.xpath, "(//div[@role='list'])[1]"), 
			click(element(Locators.xpath, "(//div[text()='"+teamdata[4]+"'])[1]"));
			click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
			click(element(Locators.xpath, "(//label[text()='Campagin']/following-sibling::div)[3]"));
//			dropdown(element(Locators.xpath, "(//div[@role='list'])[8]"), 
			click(element(Locators.xpath, "(//div[text()='"+teamdata[5]+"'])[2]"));
			click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
			click(element(Locators.xpath, "(//input[@aria-label='User Assign'])[2]"));
//			dropdown(element(Locators.xpath, "(//div[@role='list'])[7]"), 
			click(element(Locators.xpath, "(//div[text()='"+teamdata[6]+"'])[2]"));
			click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
			click(element(Locators.xpath, "//div[text()='Create']"));
			click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
			createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), teamdata[0]);

			break;
			
		case "Lead Source":
			
			click(element(Locators.xpath, "//label[text()='Lead Source']/following-sibling::div"));
//			dropdown(element(Locators.xpath, "(//div[@role='list'])[1]"),
			click( element(Locators.xpath, "//div[text()='"+teamdata[3]+"']"));
			click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
			click(element(Locators.xpath, "(//label[text()='Campagin']/following-sibling::div)[3]"));
//			dropdown(element(Locators.xpath, "(//div[@role='list'])[7]"), 
			click(element(Locators.xpath, "(//div[text()='"+teamdata[5]+"'])[2]"));
			click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
			click(element(Locators.xpath, "(//input[@aria-label='User Assign'])[2]"));
//			dropdown(element(Locators.xpath, "(//div[@role='list'])[6]"),
			click( element(Locators.xpath, "(//div[text()='"+teamdata[6]+"'])[2]"));
			click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
			click(element(Locators.xpath, "//div[text()='Create']"));
			click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
			createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), teamdata[0]);
			break;
			
		case "Channel":
			
			click(element(Locators.xpath, "//label[text()='Channel']/following-sibling::div"));
//			dropdown(element(Locators.xpath, "(//div[@role='list'])[1]"), 
			click(element(Locators.xpath, "(//div[text()='"+teamdata[4]+"'])[1]"));
			click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
			click(element(Locators.xpath, "(//label[text()='Campagin']/following-sibling::div)[3]"));
//			dropdown(element(Locators.xpath, "(//div[@role='list'])[7]"), 
			click(element(Locators.xpath, "(//div[text()='"+teamdata[5]+"'])[2]"));
			click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
			click(element(Locators.xpath, "(//input[@aria-label='User Assign'])[2]"));
//			dropdown(element(Locators.xpath, "(//div[@role='list'])[6]"),
			click( element(Locators.xpath, "(//div[text()='"+teamdata[6]+"'])[2]"));
			click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[2]"));
			click(element(Locators.xpath, "//div[text()='Create']"));
			click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
			createAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), teamdata[0]);
			break;

		default:
			
			System.err.println("Invalide Type");
			break;
		}

		
	}
	
//  		<============================================ Users and Groups Creations ==============================================>
	
// 	 		<============================================ Users and Groups Updation ==============================================>


	
	@Test(dataProvider="UserGroupData")
	public void usergroupTC055(String usergroupdata[]) {
		
		click(element(Locators.xpath, "//span[text()='User Group']"));
		click(element(Locators.xpath, "//label[text()='User Group']/following-sibling::div"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[1]"), element(Locators.xpath, "(//div[text()='"+usergroupdata[0]+"'])[1]"));
		click(element(Locators.xpath, "(//input[@role='checkbox']/following-sibling::div)[1]"));	
		click(element(Locators.xpath, "//i[text()='save']"));
		click(element(Locators.xpath, "//div[text()='Yes, Save !']"));
		click(element(Locators.xpath, "//div[text()='Close']"));

		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertFalse(isSelect(element(Locators.xpath, "(//input[@role='checkbox']/following-sibling::div)[1]")));

	}
	
	@Test(dataProvider="UserData")
	public void usergroupTC056(String userdata[]) {

		click(element(Locators.xpath, "//span[text()='Users']"));
		click(element(Locators.xpath, "//i[@class='fas fa-refresh']"));
		click(element(Locators.xpath, "//td[text()='"+userdata[3]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text']"));
		scroll(element(Locators.xpath, "(//nav[contains(@class,'modal-header--sticky v-toolbar')]/following-sibling::div)[3]"), 300);
		click(element(Locators.xpath, "//label[text()='Status']/following-sibling::div"));
		click(element(Locators.xpath, "//div[text()='"+userdata[12]+"']"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[7]"));
		updateAssert(element(Locators.xpath, "//td[text()='"+userdata[3]+"']//following-sibling::td[1]"), userdata[12]);		
		
	}
	
	@Test(dataProvider="TeamData")
	public void usergroupTC057(String teamdata[]) {
		
		click(element(Locators.xpath, "//span[text()='Team']"));
		click(element(Locators.xpath, "//td[text()='"+teamdata[0]+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		scroll(element(Locators.xpath, "(//nav[contains(@class,'v-toolbar theme--dark')]/following-sibling::div)[1]"), 300);
		click(element(Locators.xpath, "//label[text()='Status']/following-sibling::div"));
		click(element(Locators.xpath, "//div[text()='"+teamdata[9]+"']"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		updateAssert(element(Locators.xpath, "//td[text()='"+teamdata[0]+"']//following-sibling::td[3]"), teamdata[9]);		
		
	}
	
	
	@Test(dataProvider="ChannelData")
	public void usergroupTC058(String channeldata[]) {
		
		click(element(Locators.xpath, "//span[text()='Channel']"));
		click(element(Locators.xpath, "//td[text()='"+channeldata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		click(element(Locators.xpath, "//label[text()='Status']/following-sibling::div"));
		click(element(Locators.xpath, "//div[text()='"+channeldata[4]+"']"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		updateAssert(element(Locators.xpath, "//td[text()='"+channeldata[0]+"']//following-sibling::td[2]"), channeldata[4]);		


		
	}
	
	@Test(dataProvider="SourceData")
	public void usergroupTC059(String sourcedata[]) {
		
		click(element(Locators.xpath, "//span[text()='Source']"));
		click(element(Locators.xpath, "//td[text()='"+sourcedata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']"));
		click(element(Locators.xpath, "//label[text()='Status']/following-sibling::div"));
		click(element(Locators.xpath, "//div[text()='"+sourcedata[4]+"']"));
		click(element(Locators.xpath, "//div[text()='Update']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		updateAssert(element(Locators.xpath, "//td[text()='"+sourcedata[0]+"']//following-sibling::td[2]"), sourcedata[4]);		
		
	}
	
	
//  		<============================================ Users and Groups Updations ==============================================>

//			<============================================ Users and Groups Deletion ==============================================>

	
	@Test(dataProvider="UserGroupData")
	public void usergroupTC060(String usergroupdata[]) {
		
		click(element(Locators.xpath, "//span[text()='User Group']"));
		click(element(Locators.xpath, "//label[text()='User Group']/following-sibling::div"));
		dropdown(element(Locators.xpath, "(//div[@role='list'])[1]"), element(Locators.xpath, "(//div[text()='"+usergroupdata[0]+"'])[1]"));
		click(element(Locators.xpath, "//i[text()='delete']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "//div[text()='Close']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(getText(element(Locators.xpath, "//label[text()='Group']/following-sibling::input")).isEmpty());

	}

	@Test(dataProvider="UserData")
	public void usergroupTC061(String userdata[]) {

		click(element(Locators.xpath, "//span[text()='Users']"));
		click(element(Locators.xpath, "//i[@class='fas fa-refresh']"));
		click(element(Locators.xpath, "//td[text()='"+userdata[3]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[7]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[3]"), userdata[3]);
		
		
	}
	
	@Test(dataProvider="TeamData")
	public void usergroupTC062(String teamdata[]) {
		
		click(element(Locators.xpath, "//span[text()='Team']"));
		click(element(Locators.xpath, "//td[text()='"+teamdata[0]+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));		
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), teamdata[0]);
		
	}
	
	@Test(dataProvider="ChannelData")
	public void usergroupTC063(String channeldata[]) {
		
		click(element(Locators.xpath, "//span[text()='Channel']"));
		click(element(Locators.xpath, "//td[text()='"+channeldata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));		
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), channeldata[0]);


		
	}
	
	@Test(dataProvider="SourceData")
	public void usergroupTC064(String sourcedata[]) {
		
		click(element(Locators.xpath, "//span[text()='Source']"));
		click(element(Locators.xpath, "//td[text()='"+sourcedata[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']"));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));		
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		deleteAssert(elements(Locators.xpath, "//table[contains(@class,'v-datatable')]//tr//td[1]"), sourcedata[0]);
		
	}
}

//		<============================================ Users and Groups Deletion ==============================================>

