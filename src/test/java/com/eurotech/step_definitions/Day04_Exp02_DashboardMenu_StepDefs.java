package com.eurotech.step_definitions;

import com.eurotech.pages.Day04_DashboardPage;
import com.eurotech.pages.Day02_LoginPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Day04_Exp02_DashboardMenu_StepDefs {
    Day04_DashboardPage dashboardPage=new Day04_DashboardPage();
    Day02_LoginPage day02LoginPage =new Day02_LoginPage();



    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> expectedList) {
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);
        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.menuList);
        Assert.assertEquals(expectedList,actualList);
    }

    @When("The user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userCredentials ) {
        System.out.println("userCredentials = " + userCredentials);
        day02LoginPage.login(userCredentials.get("username"),userCredentials.get("password"));
        BrowserUtils.waitFor(1);
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(userCredentials.get("message")));
        // Welcome Teacher         contains                     Teacher
    }


}
