package testSuite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InitialPage;

public class Adult_stepDef 
{
		InitialPage inpage=new InitialPage();
		//***************select partner**********************
	 	@Given("^user is on select partner page$")
	    public void user_is_on_select_partner_page() throws Throwable 
	 	{
	        
	    }
	    @When("^select no click next$")
	    public void select_no_click_next() throws Throwable 
	    {
	    	inpage.clickNo();
	        inpage.clickNext();	       
	    }
	    @Then("^claim any benefits page is displayed$")
	    public void claim_any_benefits_page_is_displayed() throws Throwable 
	    {
	        inpage.validatetitle("claim any benefits","ClaimBenefitPage");
	    }
	    
	    //**************select benifits claim********************	    
	    @Given("^user is on claim benifit page$")
	    public void user_is_on_claim_benifit_page() throws Throwable 
	    {
	        
	    }
	   
	    @Then("^pregancy details page is displayed$")
	    public void pregancy_details_page_is_displayed() throws Throwable 
	    {
	        inpage.validatetitle("pregnant or have you given birth", "PregancyPage");
	    }
	    
	    //**************select pregnancy******************
	    @Given("^user is on pregnancy selection page$")
	    public void user_is_on_pregnancy_selection_page() throws Throwable 
	    {
	        
	    }

	    @Then("^injury or illness page is displayed$")
	    public void injury_or_illness_page_is_displayed() throws Throwable
	    {
	        inpage.validatetitle("injury or illness caused by serving", "InjuryPage");
	    }

	    //**********select injury or illness*****************
	    @Given("^user is on injury or illness selection page$")
	    public void user_is_on_injury_or_illness_selection_page() throws Throwable
	    {
	        
	    }

	    @Then("^diabetes page is displayed$")
	    public void diabetes_page_is_displayed() throws Throwable 
	    {
	        inpage.validatetitle("Do you have diabetes", "DiabetesPage");
	    }

	    ////////////****************select diabetes*****************
	    @Given("^user is on diabetes selection page$")
	    public void user_is_on_diabetes_selection_page() throws Throwable
	    {
	        
	    }

	    @Then("^glaucoma page is displayed$")
	    public void glaucoma_page_is_displayed() throws Throwable
	    {
	        inpage.validatetitle("Do you have glaucoma", "GlaucomaPage");
	    }

	    //***********select glaucoma*********************
	    @Given("^user is on glaucoma selection page$")
	    public void user_is_on_glaucoma_selection_page() throws Throwable 
	    {
	        
	    }

	    @Then("^care home page is displayed$")
	    public void care_home_page_is_displayed() throws Throwable
	    {
	        inpage.validatetitle("Do you live permanently in a care home","CareHomePage");
	    }
	    
	    //**************select carehome******************
	    @Given("^user is on carehome selection page$")
	    public void user_is_on_carehome_selection_page() throws Throwable
	    {
	        
	    }

	    @Then("^investments or property page is displayed$")
	    public void investments_or_property_page_is_displayed() throws Throwable
	    {
	        inpage.validatetitle("investments or property","InvstPropertyPage");
	    }
	    
	    //***********select investment 
	    @Given("^user is on investment selection page$")
	    public void user_is_on_investment_selection_page() throws Throwable 
	    {
	        
	    }

	    @Then("^display the final eligibility status page$")
	    public void display_the_final_eligibility_status_page() throws Throwable
	    {
	        inpage.geteligibilitydetails();
	    }
	    
	    
}
