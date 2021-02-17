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

//    @Then("I will enter the text into Email address field: {string}")
//    public void iWillEnterTheTextIntoEmailAddressField(String arg0) {
//        form.setEmail(arg0);
//    }


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
    // Horizontal Form

    @Then("Fill out email: {string}")
    public void fillOutEmail(String arg0) {
        form.setEmail2(arg0);
    }

    @Then("Fill out password: {string}")
    public void fillOutPassword(String arg0) {
        form.setPassword2(arg0);
    }

    @Then("Click on Sign In")
    public void clickOnSignIn() {
        form.clickButton2();
    }

    // Form Elements
    @Then("I enter text: {string}")
    public void iEnterText(String arg0) {
        form.enterText(arg0);
    }

    @Then("I enter password: {string}")
    public void iEnterPassword(String arg0) {
        form.enterPassword(arg0);
    }

    @Then("I enter placeholder text: {string}")
    public void iEnterPlaceholderText(String arg0) {
        form.enterPlaceHolder(arg0);
    }


    @AfterTest
    public void quit() {

    }



}