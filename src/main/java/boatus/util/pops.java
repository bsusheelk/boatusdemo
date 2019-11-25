package boatus.util;

import org.openqa.selenium.By;

import boatus.base.TestBase;

public class pops extends TestBase {
	public pops() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void poop() {
	try {
		driver.findElement(By.xpath("//a[@class='cta-button red']")).click();
		
	}catch(Exception e)
	{
		System.out.println(e);
	}
}}
