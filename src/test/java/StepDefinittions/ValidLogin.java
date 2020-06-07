package StepDefinittions;

import Base.TestBase;
import Pages.PageLocatorsAndMethods;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ValidLogin extends TestBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }


    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @And("^I click the signIn$")
    public void iClickTheSignIn() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @When("^I enter my user email \"([^\"]*)\" address$")
    public void iEnterMyUserEmailAddress(String email) throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js. executeScript("window. scrollBy(0,250)", "");
        PageLocatorsAndMethods page = PageFactory.initElements(driver,PageLocatorsAndMethods.class);
        page.typeLoginEmail(email);
        //driver.findElement(By.name("email")).sendKeys(value);

    }

    @And("^I enter my user password \"([^\"]*)\" detail$")
    public void iEnterMyUserPasswordDetail(String password) throws Throwable {
        PageLocatorsAndMethods page = PageFactory.initElements(driver,PageLocatorsAndMethods.class);
        page.typeLoginPasswd(password);
        //driver.findElement(By.name("passwd")).sendKeys(value);

    }

    @When("^I click the login button$")
    public void i_click_the_login_button() throws Throwable {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() throws Throwable {
        String NameOfUser = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
        System.out.println(NameOfUser);
    }



}
