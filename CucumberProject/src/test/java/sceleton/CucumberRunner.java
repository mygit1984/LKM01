package sceleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/*
 * The purpose of pretty is to get good pretty report
 * The purpose of
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports",
"json:src/cucumber-reports/reports.json"},monochrome=true,
features= {"src/test/resources/sceleton/login1.feature"},dryRun=false)
public class CucumberRunner {

}
