package StepDefinittions;

import Base.TestBase;
import Pages.PageLocatorsAndMethods;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class CreateNewUser extends TestBase {
       public int random;

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the application homescreen$")
    public void i_am_on_the_application_homescreen() throws Throwable {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();

    }

    @When("^I click the signIn link$")
    public void i_click_the_signIn_link() throws Throwable {
        PageLocatorsAndMethods page = PageFactory.initElements(driver, PageLocatorsAndMethods.class);
        page.ClickSignIn();
    }

    @When("^I enter My email address to create an account$")
    public void i_enter_My_email_address_to_create_an_account() throws Throwable {
        random = 100 + (int)(Math.random()*((1000 - 1) + 1));
    driver.findElement(By.id("email_create")).sendKeys("lanre.ikuesan"+ random  +"@gmail.com");
    }

    @When("^I click the Create account button$")
    public void i_click_the_Create_account_button() throws Throwable {
     PageLocatorsAndMethods page = PageFactory.initElements(driver,PageLocatorsAndMethods.class);
     page.ClickCreatAccButton();

    }

    @When("^I select my gender$")
    public void i_select_my_gender() throws Throwable {
        Thread.sleep(5000);
     PageLocatorsAndMethods page = PageFactory.initElements(driver,PageLocatorsAndMethods.class);
     page.SelectGender();
    }

    @When("^I enter all mandatory information$")
    public void i_enter_all_mandatory_information() throws Throwable {
     PageLocatorsAndMethods page = PageFactory.initElements(driver, PageLocatorsAndMethods.class);
     page.typeCustomerFirstName();
     page.typeCustomerLastName();
     page.typeUSerPassword();
     page.typeFirstName();
     page.typeLastName();
     page.typeAddress();
     page.typeCity();
     new Select(driver.findElement(By.name("id_state"))).selectByVisibleText("Illinois");
     page.typePostCode();
     page.typePhoneNumber();
     page.ClearAlias();
     page.typeUserAlias();


    }

    @When("^I click the register button$")
    public void i_click_the_register_button() throws Throwable {
    PageLocatorsAndMethods page = PageFactory.initElements(driver,PageLocatorsAndMethods.class);
    page.ClickSubmitAccountButton();
    }

    @Then("^my Account should be successfully created$")
    public void my_Account_should_be_successfully_created() throws Throwable {
        String ExpectedMessage = "Welcome to your account. Here you can manage all of your personal information and orders.";
        String ActualMessage =driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
        Assert.assertEquals(ExpectedMessage, ActualMessage);
        System.out.print(ActualMessage);
    driver.quit();
    }
}
