package boatus.util;

import java.io.IOException;

import boatus.base.TestBase;

public class Teardown extends TestBase{
	
public Teardown() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
public void drivershutdown() {
	driver.close();
}
public void excelshutdown() throws IOException {
	testUtil.bk.close();
}
	

}
