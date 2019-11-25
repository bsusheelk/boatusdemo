package boatus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import boatus.base.TestBase;

public class watercraftlocation {
	public static	WebElement wcloc_home;
	public static	WebElement wcloc_marina;
	public static	WebElement wcloc_yearofownership;
	public static	WebElement wcloc_expboatdriving;
	public static	WebElement wcloc_voilationsyes;
	public static	WebElement wcloc_voilationsno;
	public static	WebElement wcloc_savesubmit;

	public static void watercraftlocele() {

		wcloc_home=TestBase.driver.findElement(By.xpath("//label[@class='form-check-label'] [@for='home']"));
		wcloc_home=TestBase.driver.findElement(By.xpath("//label[@class='form-check-label'] [@for='marina']"));
		wcloc_yearofownership=TestBase.driver.findElement(By.xpath("//label[@class='form-control col-md-2 numeric'] [@id='YearsOfOwnership']"));
		wcloc_expboatdriving=TestBase.driver.findElement(By.xpath("//label[@class='form-control col-md-2 numeric'] [@id='YearsOfExperience']"));
		wcloc_voilationsyes=TestBase.driver.findElement(By.xpath("//label[@class='form-check-label'] [@for='anyViolationsTrue']"));
		wcloc_voilationsno=TestBase.driver.findElement(By.xpath("//label[@class='form-check-label'] [@for='anyViolationsFalse']"));
		wcloc_savesubmit=TestBase.driver.findElement(By.xpath("//label[@class='btn btn-tertiary'] [@type='submit']"));
	
		
		
	}
	
	public static void watercraftlocexec() {
		
	}
	
}
