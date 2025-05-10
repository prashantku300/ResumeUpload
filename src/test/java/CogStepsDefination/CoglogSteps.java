package CogStepsDefination;

import org.openqa.selenium.WebDriver;

import CogPage.CogTestPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoglogSteps{
	
	CogTestPage qtesting= new CogTestPage();
	
WebDriver driver;
	
@Given("user lunch site url")
public void user_lunch_site_url() {
	qtesting.user_lunch_site_url();
	
}

@When("user enter correct username and password")
public void user_enter_correct_username_and_password() {
   qtesting.user_enter_correct_username_and_password();
	
}

@And("user click on login button")
public void user_click_on_login_button() {
   qtesting.user_click_on_login_button();
	
}

@Then("validate successful login")
public void validate_successful_login() {
	qtesting.validate_successful_login();
	
	}

@Given("user click on update profile button")
public void user_click_on_update_profile_button() {
	qtesting.user_click_on_update_profile_button();
	
}

@When("user click on update resume button")
public void user_click_on_update_resume_button() {
	qtesting.user_click_on_update_resume_button();
	
}

@And("user upload select resume from system")
public void user_upload_select_resume_from_system() {
	qtesting.user_upload_select_resume_from_system();
	
}

@Then("validate successful updation")
public void validate_successful_updation() {
	qtesting.validate_successful_updation();

}
	
	


}
