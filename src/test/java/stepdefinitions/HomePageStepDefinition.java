package stepdefinitions;

import org.testng.Assert;

import initdriver.GetDriverIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WelcomePage;

public class HomePageStepDefinition {
	
	WelcomePage wp = new WelcomePage(GetDriverIn.getDriver());

@Given("user is on homepage")
public void user_is_on_homepage() {
    Assert.assertEquals(wp.getTitle(), "React App");
}

@When("user enters {string}")
public void user_enters(String notetodo) throws InterruptedException {
    wp.enternote(notetodo);
    Thread.sleep(2000);
}
@When("user clicks add button")
public void user_clicks_add_button() {
    wp.clicksubmit();
}
/*@Then("note should get added")
public void note_should_get_added() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}*/
	
}
