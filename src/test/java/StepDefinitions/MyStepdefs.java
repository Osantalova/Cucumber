package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.annotations.AfterTest;
import pageObjects.authenticgoods.Forms;

public class MyStepdefs {
    Forms form = new Forms();

    @Given("Navigate to: {string}")
    public void navigate(String arg0) {
        form.navigateTo(arg0);
    }
    // Basic Form
    @Then("I will enter the text into Email address field {string}")
    public void iWillEnterTheTextIntoEmailAddressField(String arg0) {
        form.setEmail(arg0);
    }


    @Then("I will enter the text into Password field: {string}")
    public void setMyPassword(String arg0) {
        form.setPassword(arg0);
    }

    @Then("Attach file: {string}")
    public void setMyFile(String arg0) {
        form.setFile(arg0);
    }

    @Then("Press on Submit button")
    public void pressOnSubmitButton() {
        form.clickButton();
    }


    @AfterTest
    public void quit() {

    }



}