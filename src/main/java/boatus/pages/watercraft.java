package boatus.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import boatus.base.TestBase;
public class watercraft {
	
	public static	WebElement wc_modelyear;
	public static	WebElement wc_buildername;
	public static	WebElement wc_watercraftlength;
	public static	WebElement wc_wmodel;
	public static	WebElement wc_custno;
	public static	WebElement wc_addelec;
	public static	WebElement wc_biminitop;
	public static	WebElement wc_cfullconfig;
	public static	WebElement wc_cehorsepwer;
	public static	WebElement wc_damageno;
	public static	WebElement wc_damageyes;
	public static	WebElement wc_submit;
	
public static void watercrafteles() {
	
	wc_modelyear= TestBase.driver.findElement(By.xpath("//label[@class='form-control numeric'] [@id='ModelYear']"));
	wc_buildername=TestBase.driver.findElement(By.xpath("//label[@class='form-control typeahead tt-input'] [@id='BuilderName']"));
	wc_watercraftlength=TestBase.driver.findElement(By.xpath("//label[@class='form-control numeric WatercraftLength'] [@id='WatercraftLength']"));
	wc_wmodel=TestBase.driver.findElement(By.xpath("//label[@class='form-control typeahead tt-input'] [@id='ModelName']"));
	wc_custno=TestBase.driver.findElement(By.xpath("//label[@class='form-check-label'] [@for='NoCustomized']"));
	wc_addelec=TestBase.driver.findElement(By.xpath("//label[@class='form-check-label'] [@for='AddedElectronics']"));
	wc_biminitop=TestBase.driver.findElement(By.xpath("//label[@class='form-check-label'] [@for='AddedBiminiOrTop']"));
	wc_cfullconfig=TestBase.driver.findElement(By.xpath("//label[@class='form-check-label customized-label'] [@for='ChangedHullConfiguration']"));
	wc_cehorsepwer=TestBase.driver.findElement(By.xpath("//label[@class='form-check-label customized-label'] [@for='ChangedEngineHorsepower']"));
	wc_damageno=TestBase.driver.findElement(By.xpath("//label[@class='form-check-label'] [@for='Damaged']"));
	wc_damageyes=TestBase.driver.findElement(By.xpath("//label[@class='form-check-label'] [@for='NoDamage']"));
	wc_submit=TestBase.driver.findElement(By.xpath("//label[@class='btn btn-tertiary'] [@type='submit']"));
}
}
