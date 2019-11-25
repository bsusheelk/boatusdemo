package boatus.pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import boatus.base.TestBase;

public class homepageb extends TestBase{
	

public homepageb() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

public WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName'][@name='lastName']"));
public WebElement emailaddress=driver.findElement(By.xpath("//input[@id='emailAddress'][@name='emailAddress']"));
public WebElement mailingzipcode=driver.findElement(By.xpath("//input[@id='mailingZipCode'][@name='mailingZipCode']"));
public WebElement submitgetqoute=driver.findElement(By.xpath("//a[@id='getQuoteSubmit'][@class='cta-button red']"));

public void getstarted(String hlastname,String hemid,String hzipcode) throws InterruptedException {
	lastname.sendKeys(hlastname);
	emailaddress.sendKeys(hemid);
	mailingzipcode.sendKeys(hzipcode);
	js.executeScript("window.scrollBy(0,500)");
	submitgetqoute.click();
	Thread.sleep(5000);
	
	

	

}
}