package boatus.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import boatus.base.TestBase;

public class screenshot extends TestBase{
	
	public screenshot() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void scrn(String TestMethod) throws IOException {
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\sushe\\Documents\\boatus\\susheeele\\"+"screenshot_"+TestMethod+"_"+".jpeg"));

}}
