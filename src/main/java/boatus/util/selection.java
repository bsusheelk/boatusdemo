package boatus.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import boatus.base.TestBase;
import boatus.pages.ownerinfo;
public class selection {
	
	static WebElement Select;  
	static Select myselect=new Select(Select);
public static void selectindex(int i) {
	myselect.selectByIndex(i);
}
public static void selectvisible(String values) {
myselect.selectByVisibleText("visible");
}
public static void selectvalue(String value) {
		myselect.selectByValue(value);
}}