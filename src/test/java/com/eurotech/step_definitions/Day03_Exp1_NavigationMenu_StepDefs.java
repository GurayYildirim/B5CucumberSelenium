package com.eurotech.step_definitions;

import com.eurotech.pages.Day04_DashboardPage;
import com.eurotech.pages.Day02_LoginPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Day03_Exp1_NavigationMenu_StepDefs {
    Day02_LoginPage day02LoginPage =new Day02_LoginPage();
    Day04_DashboardPage dashboardPage=new Day04_DashboardPage();
    @Then("The user schould be able to sees welcome message")
    public void the_user_schould_be_able_to_sees_welcome_message() {
        System.out.println("I see welcome message");
    }
    @Then("The user navigate to Developers menu")
    public void the_user_navigate_to_developers_menu() {
        System.out.println("I navigate developer menu");
    }
    @Then("The user able to see developer text")
    public void the_user_able_to_see_developer_text() {
        System.out.println("I see developers text");
    }
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("The user is on the login page");
    }
    @Then("The user should be able to sees welcome message")
    public void the_user_should_be_able_to_sees_welcome_message() {
        System.out.println("The user should be able to sees welcome message");
    }
    @Then("The user navigates to All Post menu")
    public void the_user_navigates_to_all_post_menu() {
        System.out.println("The user navigates to All Post menu");
    }
    @Then("The user able to see Posts text")
    public void the_user_able_to_see_posts_text() {
        System.out.println("The user able to see Posts text");
    }
    @Then("The user navigates to My Account menu")
    public void the_user_navigates_to_my_account_menu() {
        System.out.println("The user navigates to My Account menu");
    }
    @Then("The user able to see dashboard text")
    public void the_user_able_to_see_dashboard_text() {
        System.out.println("The user able to see dashboard text");
    }

    @Then("The user navigate to {string} menu")
    public void the_user_navigate_to_menu(String menuName) {
        dashboardPage.navigateToMenu(menuName);
    }


    @Then("The user schould be able to see Header as {string}")
    public void theUserSchouldBeAbleToSeeHeaderAs(String headerName) {
        BrowserUtils.waitFor(2);
        String actualHeader=dashboardPage.getHeaderText(headerName);
        Assert.assertEquals("Verify that header name is displayed",headerName,actualHeader);
    }
}
