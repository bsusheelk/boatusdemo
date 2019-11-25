 package boatus.pages;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import boatus.base.TestBase;
import boatus.util.pops;

public class ownerinfo extends TestBase{

	public ownerinfo() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}



	public WebElement oindividuals = driver.findElement(By.xpath(oorr.getProperty("oindividuals")));
	public WebElement oorganisation = TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("oorganisation")));
	public WebElement oFirstname = TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("oFirstname")));
	public WebElement olastname = TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("olastname")));
	public WebElement osexm = TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("osexm")));
	public WebElement osexf = TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("osexf")));
	public WebElement omaritalsingle = TestBase.driver
			.findElement(By.xpath(TestBase.oorr.getProperty("omaritalsingle")));
	public WebElement omaritalmarried = TestBase.driver
			.findElement(By.xpath(TestBase.oorr.getProperty("omaritalmarried")));
	public WebElement omailingaddress = TestBase.driver
			.findElement(By.xpath(TestBase.oorr.getProperty("omailingaddress")));
	public WebElement oaptnumber = TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("oaptnumber")));
	public WebElement ozip = TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("ozip")));
	public WebElement ostate = TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("ostate")));
	public WebElement oprimaryyes = TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("oprimaryyes")));
	public WebElement oprimaryno = TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("oprimaryno")));
	public WebElement oaddlyes = TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("oaddlyes")));
	public WebElement oaddlno = TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("oaddlno")));
	public WebElement osubmit = TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("osubmit")));
public WebElement ostartaquoute=TestBase.driver.findElement(By.xpath(TestBase.oorr.getProperty("ostartaquoute")));
	


public  void owner1(String firstname,String lastname, String mailingaddress, String zip) {
		
		oFirstname.sendKeys(firstname);
		olastname.sendKeys(lastname);
		omailingaddress.sendKeys(mailingaddress);		
		ozip.sendKeys(zip);

		
	}
public void owner2() {
	oindividuals.click();
	osexm.click();
	omaritalsingle.click();
	oprimaryyes.click();
	oaptnumber.sendKeys("10001");
	oaddlyes.click();

}
}

