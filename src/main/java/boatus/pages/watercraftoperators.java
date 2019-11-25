package boatus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import boatus.base.TestBase;

public class watercraftoperators {

	public static	WebElement wc_opfirstname;
	public static	WebElement wc_oplastname;
	public static	WebElement wc_opsexm;
	public static	WebElement wc_opsexf;
	public static	WebElement wc_opmaritalsingle;
	public static	WebElement wc_opmaritalmarried;
	public static	WebElement wc_opmaritalseparated;
	public static	WebElement wc_opmaritalwidowed;
	public static	WebElement wc_opnumofvoilations;
	public static	WebElement wc_opregisno;
	public static	WebElement wc_opregisyes;
	public static	WebElement wc_opsubmit;


	public static void watercraftopele() {
		wc_opfirstname= TestBase.driver.findElement(By.xpath("//input[@class='form-control'] [@id='FirstNameOperator1']"));
		wc_oplastname= TestBase.driver.findElement(By.xpath("//input[@class='form-control'] [@id='LastNameOperator1']"));
		wc_opsexm= TestBase.driver.findElement(By.xpath("//input[@class='form-control-label'] [@for='genderM1']"));
		wc_opsexf= TestBase.driver.findElement(By.xpath("//input[@class='form-control-label'] [@for='genderF1']"));
		wc_opmaritalsingle= TestBase.driver.findElement(By.xpath("//input[@class='form-control-label'] [@for='maritalStatusSingle1']"));
		wc_opmaritalmarried=TestBase.driver.findElement(By.xpath("//input[@class='form-control-label'] [@for='maritalStatusMarried1']"));
		wc_opmaritalseparated=TestBase.driver.findElement(By.xpath("//input[@class='form-control-label'] [@for='maritalStatusDivorced1']"));	
		wc_opmaritalwidowed=TestBase.driver.findElement(By.xpath("//input[@class='form-control-label'] [@for='maritalStatusWidowed1']"));	
		wc_opnumofvoilations=TestBase.driver.findElement(By.xpath("//input[@class='form-control'] [@id='NumberOfAccidentsOrViolationsOperator1']"));
		wc_opregisno=TestBase.driver.findElement(By.xpath("//input[@class='form-control'] [@for='isOnTheTitleYes1']"));
		wc_opregisyes=TestBase.driver.findElement(By.xpath("//input[@class='form-control'] [@for='isOnTheTitleNo1']"));
		wc_opsubmit=TestBase.driver.findElement(By.xpath("//input[@class='btn btn-tertiary'] [@type='submit']"));
	}

	
}
