package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
 public static WebDriver driver;
 public static Properties prop;
 public static ExtentHtmlReporter exthtml;
 public static ExtentReports report;
 public static ExtentTest testlog;
 public static DesiredCapabilities ds;
 
@BeforeSuite
 public void reportinitialise()
 {
	   	prop=new Properties();
		try{prop.load(new FileInputStream("src/main/java/config/config.properties"));}catch(Exception e) {}
		
		ds=new DesiredCapabilities();
		
		if(prop.getProperty("browsername").matches("chrome"))
		{
			WebDriverManager.chromedriver().setup();
	    	driver=new ChromeDriver();		
		}
		if(prop.getProperty("browsername").matches("firefox"))
			
		{   WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();					
		}
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		
		exthtml = new ExtentHtmlReporter(prop.getProperty("reportslocation")+"nhsbsa_results.html");
		report = new ExtentReports();
	 	report.attachReporter(exthtml);
	 	report.setSystemInfo("Host Name", "Laxmi");  //name of the system
	 	report.setSystemInfo("Environment", "Test Env");
	 	report.setSystemInfo("User Name", "Laxmi");
	 	   
	 	exthtml.config().setDocumentTitle("NHSBSA");
	 	exthtml.config().setReportName("NHSBSA Functional Testing");
	 	exthtml.config().setTestViewChartLocation(ChartLocation.TOP);
	 	exthtml.config().setTheme(Theme.STANDARD);
 }
 public void takescreenshot(String filename)
 {
	 	try
	 	{
	 	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 	FileUtils.copyFile(f,new File(prop.getProperty("screens")+filename));
	 	
	 	testlog.addScreenCaptureFromPath(prop.getProperty("screens")+filename);
	 	}catch(Exception e) {}

 }
 
@AfterSuite
 public void endofsuite()
 {
	  report.flush();//save the report
	  driver.close();
	  
	  try{Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");}catch(Exception e) {}
	  try{Runtime.getRuntime().exec("taskkill /f /im geckodriver.exe");}catch(Exception e) {}
	  
 }
}
