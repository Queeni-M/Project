package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.DemoWorkshopMethods;

 

 

public class Register_Page {
    WebDriver driver;
    
    @FindBy(id="gender-male")
    @CacheLookup
    WebElement male;

 

    //using how class
    @FindBy(how=How.ID, using="gender-female")
    @CacheLookup
    WebElement female;

 

    @FindBy(xpath="//*[@id='FirstName']")
    @CacheLookup
    WebElement fname;
    
    @FindBy(css="#LastName")
    @CacheLookup
    WebElement lname;
    
    @FindBy(name="Email")
    @CacheLookup
    WebElement email;
    
    @FindBy(name="Password")
    @CacheLookup
    WebElement password;
    
    @FindBy(name="ConfirmPassword")
    @CacheLookup
    WebElement confirmpwd;

 

    @FindBy(id="register-button")
    @CacheLookup
    WebElement register;

 

    public Register_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    
    //setters
    
    public void setFirstName(String firstname){
    	DemoWorkshopMethods.sendData(fname,firstname);
        }
    
    public void setLastName(String lastname){
    	DemoWorkshopMethods.sendData(lname,lastname);
            }
    
    public void setEmail(String Email){
    	DemoWorkshopMethods.sendData(email,Email);
            }
    
    public void setPassword(String Password){
    	DemoWorkshopMethods.sendData(password,Password);
            }
    
    public void setConfirmPassword(String Confirmpwd){
    	DemoWorkshopMethods.sendData(confirmpwd,Confirmpwd);
            }
    public void clickGenderMale(){
    	DemoWorkshopMethods.clickButton(male);
    }
    
    public void clickGenderFemale(){
    	DemoWorkshopMethods.clickButton(female);
    }
    public void clickRegister(){
    	DemoWorkshopMethods.clickButton(register);
    }
  
//getters
    
    public WebElement getFirstName(){
        return fname;
    }
    public WebElement getLastName(){
        return lname;
    }
    public WebElement getEmail(){
        return email;
    }
    public WebElement getPassword(){
        return password;
    }
    public WebElement getConfirmPassword(){
        return confirmpwd;
    }
    public WebElement getclickGenderMale(){
        return male;
    }
    public WebElement getclickGenderFemale(){
        return female;
    }
    public WebElement getclickregister(){
        return register;
    }
    
}

