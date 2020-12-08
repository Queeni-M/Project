package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.DemoWorkshopMethods;
import pageobjects.AddToCart_Page;

public class AddToCart_Steps {
     WebDriver driver;
     AddToCart_Page objweb;
   
@Given("^User is on home page$")
public void user_is_on_home_page() throws Throwable {   
	driver=DemoWorkshopMethods.openBrowser();
    objweb = new AddToCart_Page(driver);
    objweb = PageFactory.initElements(driver,AddToCart_Page.class );
    driver.navigate().to("http://demowebshop.tricentis.com");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.name("Email")).sendKeys("queenimuthabathula07@gmail.com");
    driver.findElement(By.name("Password")).sendKeys("jasqueeni7");
}


@When("^User clicks on books link$")
public void user_clicks_on_books_link() throws Throwable {
    objweb.clickBooks();
    }

@When("^selects a book to add to cart$")
public void selects_a_book_to_add_to_cart() throws Throwable {
    objweb.clickFiction();
    }

@When("^click on Add to cart$")
public void click_on_Add_to_cart() throws Throwable {
    objweb.clickAddToCart();
    }

@Then("^item is added to cart successfully$")
public void item_is_added_to_cart_successfully() throws Throwable {
    System.out.println("The product has been added to your shopping cart");
    Thread.sleep(1000);
    driver=DemoWorkshopMethods.closeBrowser();
    }

}