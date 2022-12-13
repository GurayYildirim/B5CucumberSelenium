package com.eurotech.step_definitions;

import com.eurotech.pages.Day04_DashboardPage;
import com.eurotech.pages.Day06_EditProfilePage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Day06_Exp01_EditProfile_StepDefs {
    Day04_DashboardPage dashboardPage=new Day04_DashboardPage();
    Day06_EditProfilePage day06_editProfilePage=new Day06_EditProfilePage();


    @When("The user navigates to {string}")
    public void the_user_navigates_to(String module) {
        BrowserUtils.waitFor(2);
        dashboardPage.navigateToMenu(module);
    }
    @When("The user select status {string}")
    public void the_user_select_status(String type) {
        day06_editProfilePage.selectMenu(type);
    }
    @When("The user sliders the slider")
    public void the_user_sliders_the_slider() {
        WebElement slider=Driver.get().findElement(By.xpath("//input[@type='range']"));
        for (int i = 0; i < 4; i++) {
            BrowserUtils.waitFor(2);
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
        /*
        1.Yol
        Actions move=new Actions(Driver.get());
        Action action=(Action) move.dragAndDropBy(day06_editProfilePage.sliderBtn,3,7).build();
        BrowserUtils.waitFor(3);
         */

    }
    @When("The user add {string} {string}")
    public void the_user_add(String inputBoxName, String userInformation) {
        day06_editProfilePage.addinfo(inputBoxName,userInformation);

    }
    @Then("The user click on submit button")
    public void the_user_click_on_submit_button() {
        day06_editProfilePage.submitBtn.click();

    }

    @And("The user sliders the slider {int}")
    public void theUserSlidersTheSlider(int handelNum) {
        for (int i = 0; i <handelNum; i++) {
            BrowserUtils.waitFor(1);
            day06_editProfilePage.sliderBtn.sendKeys(Keys.ARROW_LEFT);
        }
        for (int i = 0; i <handelNum+4; i++) {
            BrowserUtils.waitFor(1);
            day06_editProfilePage.sliderBtn.sendKeys(Keys.ARROW_RIGHT);
        }
        /*
        1.Yol
        Actions move=new Actions(Driver.get());
        Action action=(Action) move.dragAndDropBy(day06_editProfilePage.sliderBtn,3,7).build();
        BrowserUtils.waitFor(3);
         */

    }


    @And("The user sliders the slider {string}")
    public void theUserSlidersTheSlider(String handelNum) {
        int handelNumMtd=Integer.parseInt(handelNum);
        System.out.println("handelNumMtd = " + handelNumMtd);
        for (int i = 0; i <handelNumMtd; i++) {
            BrowserUtils.waitFor(1);
            day06_editProfilePage.sliderBtn.sendKeys(Keys.ARROW_LEFT);
        }
        for (int i = 0; i <handelNumMtd+4; i++) {
            BrowserUtils.waitFor(1);
            day06_editProfilePage.sliderBtn.sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
