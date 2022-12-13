package com.eurotech.step_definitions;

import com.eurotech.pages.Day04_DashboardPage;
import com.eurotech.pages.Day02_LoginPage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Day02_Exp1_Login_StepDefs {
    Day02_LoginPage day02LoginPage =new Day02_LoginPage();
    Day04_DashboardPage dashboardPage=new Day04_DashboardPage();
    @Given("the user in on the login page")
    public void the_user_in_on_the_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        day02LoginPage.loginAsTeacher();
    }

    @Then("The user schould be able to login")
    public void the_user_schould_be_able_to_login() {
        BrowserUtils.waitFor(2);
        String actualText=dashboardPage.welcomeMessage.getText();
        Assert.assertTrue(actualText.contains("Welcome"));
    }


    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {
       day02LoginPage.loginAsStudent();
    }

    @When("The user enters developer credentials")
    public void theUserEntersDeveloperCredentials() {
        day02LoginPage.loginAsDeveloper();
    }

    @When("The user enters tester credentials")
    public void theUserEntersTesterCredentials() {
        System.out.println("I enter tester and password and click login button");
    }

    @When("The user enters programmer credentials")
    public void the_user_enters_programmer_credentials() {
        System.out.println("I enter programmer and password and click login button");

    }


    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        day02LoginPage.login(username,password);
    }

    @And("The welcome message contains {string}")
    public void theWelcomeMessageContains(String user) {
        BrowserUtils.waitFor(2);
        String actualMessage=dashboardPage.welcomeMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertTrue(actualMessage.contains(user));
    }

    @Then("The warning message contains {string}")
    public void theWarningMessageContains(String expectedMessage) {
        BrowserUtils.waitFor(2);
        day02LoginPage.getDisapperingWarningMessage(expectedMessage);

        // to find disappearing warning message
//        String validationMessage = Driver.get().findElement(By.id("loginpage-input-email")).getAttribute("validationMessage");
//        System.out.println("validationMessage = " + validationMessage);
//        Assert.assertEquals(expectedMessage,validationMessage);
    }


}
