package boatus.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import boatus.base.TestBase;
import boatus.pages.homepageb;
import boatus.pages.ownerinfo;
import boatus.pages.welcomepage;
import boatus.util.Teardown;
import boatus.util.testUtil;
@Listeners(boatus.util.listeners.class)
public class SampleTestcase1 extends TestBase {
	homepageb hp;
	ownerinfo oi;
	welcomepage wc;
	String sheetname1 = "homepage";
	String sheetname2 = "owner";

	public SampleTestcase1() throws Exception {
		super();
		intialisation();
	}

	@DataProvider
	public Object[][] gettestdata() throws IOException {
		Object data[][] = testUtil.homepagebtestdata(sheetname1);
		return data;
	}
	@DataProvider
	public Object[][] gettestdata1() throws IOException {
		Object data[][] = testUtil.homepagebtestdata(sheetname2);
		return data;
	}

	@Test(dataProvider = "gettestdata", priority = 1)
	
	public void quoute(String lastnme, String emid, String zipcode) throws Exception {
		hp = new homepageb();
		hp.getstarted(lastnme, emid, zipcode);
	}

	@Test(priority = 2)
	public void wekc() throws Exception {
		wc = new welcomepage();
		wc.welcome();
	}

	
	@Test(dataProvider="gettestdata1",priority = 3)
	public void oner(String firstname, String lastname, String mailingaddress, String zip) throws Exception {
		oi = new ownerinfo();
		oi.owner1(firstname,lastname,mailingaddress,zip);
		
		oi.owner2();
	}
}
