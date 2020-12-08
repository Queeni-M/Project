package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_Page {
    WebDriver driver;
    @FindBy(linkText="Books")
    @CacheLookup
    WebElement books;
    
    @FindBy(linkText="Fiction")
    @CacheLookup
    WebElement Fiction;
    
    @FindBy(id="add-to-cart-button-45")
    @CacheLookup
    WebElement addtocart;
    
    @FindBy(xpath="//*[@id='bar-notification']/p")
    @CacheLookup
    WebElement displaymsg;
    
    public AddToCart_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    
    public void clickBooks(){
        books.click();
    }
    public void clickFiction(){
        Fiction.click();
    }
    
    public void clickAddToCart(){
        addtocart.click();
    }
}