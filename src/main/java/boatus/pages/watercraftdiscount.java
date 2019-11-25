package boatus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import boatus.base.TestBase;

public class watercraftdiscount {
	
	public static	WebElement wcd_geicoyes;
	public static	WebElement wcd_geicono;
	public static	WebElement wcd_trainingstate;
	public static	WebElement wcd_uspower;
	public static	WebElement wcd_captain;
	public static	WebElement wcd_auxillary;
	public static	WebElement wcd_boatinsuranceyes;
	public static	WebElement wcd_boatinsuranceno;
	public static	WebElement wcd_SSN;
	public static	WebElement wcd_email;
	public static	WebElement wcd_phone;
	public static WebElement wcd_conditions;
	
public static void watercraftdisele() {
	
	wcd_geicoyes=TestBase.driver.findElement(By.xpath("//input[@class='form-control-label'] [@for='yesGeicoAutoInsurance']"));
	wcd_geicono=TestBase.driver.findElement(By.xpath("//input[@class='form-control-label'] [@for='noGeicoAutoInsurance']"));
	wcd_trainingstate=TestBase.driver.findElement(By.xpath("//label[@for='IsCustomerHasStateCertifiedSafetyCourseOrAmericanSailingAssociationCourse']"));
	wcd_trainingstate=TestBase.driver.findElement(By.xpath("//label[@for='IsCustomerHasStateCertifiedSafetyCourseOrAmericanSailingAssociationCourse']"));

}






}
