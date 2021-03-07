package testSuite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChildPage;
import pages.InitialPage;

public class Child_stepDef 
{
	InitialPage inpage=new InitialPage();
	ChildPage chpage=new ChildPage();
	
	//***************select date of birth*******************
	 @Given("^user is on date selection page$")
	 public void user_is_on_date_selection_page() throws Throwable
	 {
	       
	 }
     @When("^enter date of birth (.+) and (.+) and (.+) and click next$")
     public void enter_date_of_birth_and_and_and_click_next(String day, String month, String year) throws Throwable 
     {
	       chpage.enterdob(day,month, year);
	       inpage.clickNext();
	 }
     @Then("^education selection page is displayed$")
	 public void education_selection_page_is_displayed() throws Throwable
     {
	        inpage.validatetitle("education", "EducationPage");	        
	 }
     
     //***********select education***************************
     @Given("^user is on education page$")
     public void user_is_on_education_page() throws Throwable
     {
         
     }
     @Then("^live with partner page is displayed$")
     public void live_with_partner_page_is_displayed() throws Throwable
     {
         inpage.validatetitle("live with a partner", "PartnerPage");
     }
     
}
