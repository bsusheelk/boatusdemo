package boatus.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Properties oorr;
	public static JavascriptExecutor js;
	public   TestBase() throws Exception {
		
	         js = (JavascriptExecutor) driver;

		prop =new Properties();
		oorr =new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\sushe\\Documents\\boatus\\src\\main\\java\\boatus\\config\\config.properties");
prop.load(ip);	
FileInputStream fp=new FileInputStream("C:\\Users\\sushe\\Documents\\boatus\\src\\main\\java\\boatus\\config\\or.properties");
oorr.load(fp);	
	}

	
	public void intialisation() {
		String bname=prop.getProperty("browser");
		if(bname.equalsIgnoreCase("chrome")) {
			System.setProperty(prop.getProperty("chromeprop"), prop.getProperty("chromepath"));
driver=new ChromeDriver();
		
		}else if(bname.equalsIgnoreCase("firefox")) {
			System.setProperty(prop.getProperty("chromeprop"), prop.getProperty("chromepath"));
			driver=new ChromeDriver();
	}
		
	driver.manage().window().maximize();
//	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
//	driver.manage().deleteAllCookies();
this.blockings();	

}
	public void blockings() {
		try {
			driver.findElement(By.xpath("//a[@class='cta-button red']")).click();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}

		}
	}


