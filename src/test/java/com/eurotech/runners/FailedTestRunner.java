package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //class'a run edebilme yetenegini veriyor
@CucumberOptions(
        plugin = {"html:target/failed-html-report.html"},
                features="@target/rerun.txt",
                glue = "com/eurotech/step_definitions"
)
public class FailedTestRunner { //6.gün olusturuldu. Pom.xml'e kayit eklendi
    /*
    <rerunFailingTestsCount>1</rerunFailingTestsCount>
    ayrica bu satirda eklendi bu fail testin kac defa calistirilacagini belirleyecek
    Bu test bir defa calistirilacak
     */
}
