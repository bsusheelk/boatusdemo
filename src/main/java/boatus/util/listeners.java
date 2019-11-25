package boatus.util;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import boatus.base.TestBase;

public class listeners extends screenshot implements ITestListener  {

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());
		try {
			scrn(result.getName()) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
		try {
			scrn(result.getName()) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public listeners() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
