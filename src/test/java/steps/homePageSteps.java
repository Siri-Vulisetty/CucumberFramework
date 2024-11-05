package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;
import pages.homePage;
import utilities.baseDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;

public class homePageSteps extends baseDriver {
	
	homePage h;
	
	@Given("I was on the Home page of Kent Air Application")
	public void i_was_on_the_home_page_of_kent_air_application() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		launchBrowser();
		launchApplication("https://www.kentair.org.uk/");
		
	}

	@When("I will capture the title of page")
	public void i_will_capture_the_title_of_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		//System.out.println("When");
		h=new homePage(driver);
		
		h.clickOnAcceptCookies();
	}

	@Then("I validate title of page")
	public void i_validate_title_of_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//System.out.println("Then");
		
		String expectedTitle="Kent and Medway Air Quality";
//(h.returntitle(), expectedTitle);
		
		Assert.assertEquals(h.returntitle(), expectedTitle);
	}
	
			
	




}
