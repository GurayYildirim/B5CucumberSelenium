package com.eurotech.step_definitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //TestBase clasi gibi
    @Before  //cucumber.java'yi kullaniyoruz //her senaryodan önce calisir.
    public void setup(){

        System.out.println("\n This is coming from Before method");
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[]screenshot= ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }
    @Before("@Db")
    public void setupDb(){
        System.out.println("\tConnecting DB");
    }
    @After ("@Db")
    public void closeDb(){
        System.out.println("\tClosing DB");
    }
}
