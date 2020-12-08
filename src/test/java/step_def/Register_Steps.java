package step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.DemoWorkshopMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.Register_Page;
import org.junit.*;
import org.openqa.selenium.support.PageFactory;

public class Register_Steps {
    WebDriver driver;
    Register_Page objRegister;
    
    //Open the DemoWebshop website and navigate to register 
    
    @Given("^user is on registration page$")
    public void user_is_on_registration_page() throws Throwable {
   driver=DemoWorkshopMethods.openBrowser();
   driver.get("http://demowebshop.tricentis.com/register");
   objRegister= new Register_Page(driver);
   objRegister = PageFactory.initElements(driver,Register_Page.class );    	
    }
    
    //Enter the valid data in all fields    
    
    @When("^user enters all valid data in their fields$")
    public void user_enters_all_valid_data_in_their_fields() throws Throwable {
         //register to application
        objRegister.clickGenderFemale();
        objRegister.setFirstName("Queeni");
        objRegister.setLastName("Muthabathula");
        objRegister.setEmail("queenimuthabathula07@gmail.com");
        objRegister.setPassword("jasqueeni7");
        objRegister.setConfirmPassword("jasqueeni7");
        objRegister.clickRegister();
    }

    @Then("^message displayed Register Successful$")
    public void message_displayed_Register_Successful() throws Throwable {
   String str1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();        
        String str2="Your registration completed";
        Assert.assertEquals(str1,str2);
       driver=DemoWorkshopMethods.closeBrowser();
    }

 
    //Leave the First Name blank and enter remaining data
    
    @When("^user leaves first Name blank$")
    public void user_leaves_first_Name_blank() throws Throwable {
     
        objRegister.clickGenderFemale();
        objRegister.setFirstName("");
        objRegister.setLastName("Muthabathula");
        objRegister.setEmail("queenimuthabathula07@gmail.com");
        objRegister.setPassword("jasqueeni7");
        objRegister.setConfirmPassword("jasqueeni7");
        objRegister.clickRegister();
    }

 

    @When("^clicks the register button$")
    public void clicks_the_register_button() throws Throwable {
        objRegister.clickRegister();
    }

    @Then("^display firstname error message$")
    public void display_firstname_error_message() throws Throwable {
    	String actual=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/span[2]/span")).getText();        
        String expect="First name is required";
        Assert.assertEquals(actual,expect);
        driver=DemoWorkshopMethods.closeBrowser();

    }

 
    //Leave the Last Name blank and enter remaining data
    
    @When("^user leaves last Name blank and clicks the button$")
    public void user_leaves_last_Name_blank_and_clicks_the_button() throws Throwable {
         objRegister.clickGenderFemale();
            objRegister.setFirstName("Queeni");
            objRegister.setLastName("");
            objRegister.setEmail("queenimuthabathula07@gmail.com");
            objRegister.setPassword("jasqueeni7");
            objRegister.setConfirmPassword("jasqueeni7");
            objRegister.clickRegister();
    }

 

    @Then("^display lastname error message$")
    public void display_lastname_error_message() throws Throwable {
        String actual1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/span[2]/span")).getText();        
        String expect1="Last name is required";
        Assert.assertEquals(actual1,expect1);
        driver=DemoWorkshopMethods.closeBrowser();

    }

 
    //Enter the incorrect format in the email field
    
    @When("^user enters all data$")
    public void user_enters_all_data() throws Throwable {
        
        objRegister.clickGenderFemale();
        objRegister.setFirstName("Queeni");
        objRegister.setLastName("Muthabathula");
        objRegister.setEmail("kdfWEGDFBgmail.com");
        objRegister.setPassword("jasqueeni7");
        objRegister.setConfirmPassword("jasqueeni7");
        objRegister.clickRegister();
    }

 

    @When("^user enters incorrect email format and clicks the button$")
    public void user_enters_incorrect_email_format_and_clicks_the_button() throws Throwable {
       // objRegister.setEmail("asaddafdgmail.com");
           objRegister.clickRegister();
    }

 

    @Then("^display email error message$")
    public void display_email_error_message() throws Throwable {
    	 String actual2=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/span[2]/span")).getText();        
         String expect2="Wrong email";
         Assert.assertEquals(actual2,expect2);
         driver=DemoWorkshopMethods.closeBrowser();

    }

 
    //Leave the password field blank and enter remaining data
    
    
    @When("^user leaves password blank and clicks the button$")
    public void user_leaves_password_blank_and_clicks_the_button() throws Throwable {
        objRegister.clickGenderFemale();
        objRegister.setFirstName("Queeni");
        objRegister.setLastName("Muthabathula");
        objRegister.setEmail("queenimuthabathula07@gmail.com");
        objRegister.setPassword("");
        objRegister.setConfirmPassword("jasqueeni7");
        objRegister.clickRegister();
    }

 

    @Then("^display password error message$")
    public void display_password_error_message() throws Throwable {
    	 String actual3=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/span[2]/span")).getText();        
         String expect3="Passord is required";
         Assert.assertEquals(actual3,expect3);
         driver=DemoWorkshopMethods.closeBrowser();

    }

 
   //Leave the confirm password field  blank and enter remaining data
    @When("^user leaves confirm password blank and clicks the button$")
    public void user_leaves_confirm_password_blank_and_clicks_the_button() throws Throwable {
        objRegister.clickGenderFemale();
        objRegister.setFirstName("Queeni");
        objRegister.setLastName("Muthabathula");
        objRegister.setEmail("queenimuthabathula07@gmail.com");
        objRegister.setPassword("jasqueeni7");
        objRegister.setConfirmPassword("");
        objRegister.clickRegister();
    }

 

    @Then("^display confirm password error message$")
    public void display_confirm_password_error_message() throws Throwable {
    	String actual4=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/span[2]/span")).getText();        
        String expect4="Passord is required";
        Assert.assertEquals(actual4,expect4);
        driver=DemoWorkshopMethods.closeBrowser();

    }    

}