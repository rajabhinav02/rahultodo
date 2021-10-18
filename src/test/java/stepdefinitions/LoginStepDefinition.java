package stepdefinitions;

import java.util.List;

import org.testng.Assert;

import initdriver.GetDriverIn;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDefinition {

	LoginPage lp = new LoginPage(GetDriverIn.getDriver());

@Given("user is on login page")
public void user_is_on_login_page() {
    String title= lp.getTitle();
    Assert.assertEquals(title, "React App");
}
@When("user enters the following details")
public void user_enters_the_following_details(DataTable dt) {
   // List<List<String>> ls=dt.asLists();
	List<String> ls=dt.asList();
    
    lp.enteremailpwd(ls.get(0), ls.get(1));
}
@When("user clicks on login button")
public void user_clicks_on_login_button() {
    lp.clicklogin();
}

@Then("user should move to homepage")
public void user_should_move_to_homepage() {
	String title= lp.getTitle();
    Assert.assertEquals(title, "React App");
}
	
}
