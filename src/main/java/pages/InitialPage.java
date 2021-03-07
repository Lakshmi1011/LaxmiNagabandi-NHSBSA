package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.Status;

import base.Base;

public class InitialPage extends Base
{
	@FindBy(xpath="//input[@value='Start']") static WebElement startbutton;
	@FindBy(xpath="//label[@id='label-wales']") static WebElement walesradio;
	@FindBy(id="label-no") static WebElement nobutton;
	@FindBy(id="next-button") static WebElement nextbutton; 
	@FindBy(xpath="//*[@id='nhsuk-cookie-banner__link_accept']") static WebElement cookiesbtn;
	
	public void openurl()
	{
		
		PageFactory.initElements(driver,this);
		driver.get(prop.getProperty("weburl"));
		
		try {
			Thread.sleep(5000);
			if(cookiesbtn.isDisplayed()) {
				cookiesbtn.click();
			}
		}
		catch(Exception e) {
			
		}
	}
	public void validatetitle(String exptitle,String page)
	{
		try {Thread.sleep(3000);}catch(Exception e) {}
		String title=driver.getTitle();		
		if(title.contains(exptitle))
		{
			updateReport("pass",page, page+" is displayed");
			System.out.println(page+" is displayed");
		}
		else
		{
			updateReport("fail",page, page+" is NOT displayed");
			System.out.println(page+" is NOT displayed");
		}
	}	
	public void clickStart()
	{
		try {Thread.sleep(1000);}catch(Exception e) {}
		startbutton.click();
	}
	
	
	public void clickNo()
	{
		try {Thread.sleep(1000);}catch(Exception e) {}
		nobutton.click();
	}
	public void selectwales()
	{
		try {Thread.sleep(1000);}catch(Exception e) {}
		walesradio.click();
	}
	public void clickNext()
	{
		nextbutton.click();
	}
	public void updateReport(String status,String page,String message)
	{
		if(status.matches("pass"))
		{
			testlog=report.createTest(page);
			testlog.log(Status.PASS, message);
			takescreenshot(page+".png");
		}
		if(status.matches("fail"))
		{
			testlog=report.createTest(page);
			testlog.log(Status.FAIL, message);
			takescreenshot(page+".png");	
		}
		if(status.matches("info"))
		{
			testlog=report.createTest(page);
			testlog.log(Status.INFO, message);
			takescreenshot(page+".png");
		}
	}
	public void geteligibilitydetails()
	{
		try {Thread.sleep(2000);}catch(Exception e) {}
		List<WebElement> lst=driver.findElements(By.xpath("//div[@class='column-two-thirds']/h3/span[2]"));
		String str="";
		for(int i=0;i<lst.size();i++)
		{
			str=str+"\n"+lst.get(i).getText();
		}
		updateReport("info", "ResultsPage",str);
		System.out.println("Eligible for "+str);
		
		
		
	}
	
	
	
}
