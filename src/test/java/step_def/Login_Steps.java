package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.DemoWorkshopMethods;
import pageobjects.Login_Page;
import org.junit.*;

public class Login_Steps {
    WebDriver driver;
      Login_Page objlogin;
  
    @Given("^User is on login page$")
    public void user_is_on_login_page() throws Throwable {   
    	driver=DemoWorkshopMethods.openBrowser();
        objlogin = new Login_Page(driver);
        objlogin = PageFactory.initElements(driver,Login_Page.class );
        driver.navigate().to("http://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Log in")).click();
    }
     //Successful login
    
    @When("^User enters all valid data$")
    public void user_enters_all_valid_data() throws Throwable {
        objlogin.enterEmail("queenimuthabathula07@gmail.com");
        Thread.sleep(1000);
        objlogin.enterPassword("jasqueeni7");
        Thread.sleep(1000);
    }

    @When("^click on Log in$")
    public void click_on_Log_in() throws Throwable {
        objlogin.clickLogin();
    }

    @Then("^login should be successful$")
    public void login_should_be_successful() throws Throwable {
    	String str=driver.getTitle();
		  Assert.assertEquals(str, "Demo Web Shop"); 
		  driver=DemoWorkshopMethods.closeBrowser();

    }
    //Unsuccessful login 
    @When("^I enter Email  as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void i_enter_Email_as_and_Password_as(String arg1, String arg2) throws Throwable {
        objlogin.enterEmail(arg1);
        Thread.sleep(1000);
        objlogin.enterPassword(arg2);
         Thread.sleep(1000);
    }

    @Then("^login should be Unsuccessful$")
    public void login_should_be_Unsuccessful() throws Throwable {
    	String string=driver.getTitle();
		  Assert.assertNotEquals(string, "Demo Web Shop");
		  driver=DemoWorkshopMethods.closeBrowser();
      
            }

}