package boatus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import boatus.base.TestBase;

public class welcomepage extends TestBase{

	public welcomepage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebElement startnewquoute=driver.findElement(By.xpath("//button[@class='btn btn-tertiary'][@id='startNewQuote']"));

public void welcome() {
	startnewquoute.click();
}

}
