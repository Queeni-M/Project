package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class Login_Page {

 

    WebDriver driver;
    
    @FindBy(name="Email")
    @CacheLookup
    WebElement lemail;
    
    @FindBy(name="Password")  
    @CacheLookup
    WebElement lpassword;
    
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
    @CacheLookup
    WebElement login;
    
    public Login_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    
    
    public void enterEmail(String Email){
        lemail.sendKeys(Email);
            }
    
    public void enterPassword(String Password){
        lpassword.sendKeys(Password);
    }
    
    public void clickLogin(){
        login.click();
    }
}