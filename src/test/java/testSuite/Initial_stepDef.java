package testSuite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InitialPage;

public class Initial_stepDef 
{
	InitialPage inpage=new InitialPage();
	 String title;
	//****************************select start******************///
	@Given("^user is on the NHS portal$")
    public void user_is_on_the_nhs_portal() throws Throwable
	{
       inpage.openurl();
       try {Thread.sleep(2000);}catch(Exception e) {}
       inpage.validatetitle("Check what help you could get to pay for NHS costs","StartPage");
       //inpage.clickcookie();
    }
	@When("^click start button$")
	public void click_start_button() throws Throwable
	{
	       inpage.clickStart();
	       try {Thread.sleep(2000);}catch(Exception e) {}
	}
	@Then("^country selection page is displayed$")
	public void country_selection_page_is_displayed() throws Throwable
	{
		   inpage.validatetitle("Which country do you live in","Country Page");	      
	}	
	//***********************select wales country*********************
    @Given("^user is on country page$")
    public void user_is_on_country_page() throws Throwable
    {
       
    }
    @When("^select wales click next$")
    public void select_wales_click_next() throws Throwable
    {
        inpage.selectwales();
        inpage.clickNext();
        try {Thread.sleep(2000);}catch(Exception e) {}
    }
    @Then("^date of birth page is displayed$")
    public void date_of_birth_page_is_displayed() throws Throwable
    {
       inpage.validatetitle("What is your date of birth", "DateOFBirthPage");
    }

}
