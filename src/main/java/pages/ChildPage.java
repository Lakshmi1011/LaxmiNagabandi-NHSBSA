package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class ChildPage extends Base
{

	@FindBy(id="dob-day") static WebElement day;
	@FindBy(id="dob-month") static WebElement month;
	@FindBy(id="dob-year") static WebElement year;
	
	
	public void enterdob(String d,String m,String y)
	{   
		PageFactory.initElements(driver,this);
		day.sendKeys(d);
		month.sendKeys(m);
		year.sendKeys(y);		
	}
}
