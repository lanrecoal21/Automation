package StepDefinittions;

import Base.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class InvalidLogin  extends TestBase {

     @Before
     public void setup() throws IOException {
         initialize();
     }

    @Given("^I am on the landing page$")
    public void i_am_on_the_landing_page() throws Throwable {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @Given("^I press the SignIn link$")
    public void i_press_the_SignIn_link() throws Throwable {
        driver.findElement(By.linkText("Sign in")).click();

    }

    @When("^I enter username \"([^\"]*)\"$")
    public void i_enter_username(String email) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(email);
    }

    @When("^I enter \"([^\"]*)\"$")
    public void i_enter(String password) throws Throwable {
        driver.findElement(By.name("passwd")).sendKeys(password);

    }

    @When("^I press login$")
    public void i_press_login() throws Throwable {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^I should get \"([^\"]*)\"$")
    public void i_should_get(String ErrorMessages) throws Throwable {
        String ExpectedErrorMessage = ErrorMessages;
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\'center_column\']/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ErrorMessages);

     //   driver.quit();

    }
}
