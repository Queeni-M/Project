package test_runner;

//import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 

//@RunWith(Cucumber.class) 
@CucumberOptions(features="Features", glue={"step_def"},
tags={"@Add_to_cart"})

public class Test_Runner extends AbstractTestNGCucumberTests {

 

}