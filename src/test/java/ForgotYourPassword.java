import Base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


public class ForgotYourPassword  extends TestBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }


    @Given("^Am into the application homepage$")
    public void am_into_the_application_homepage() throws Throwable {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @Given("^I click the forget your password$")
    public void i_click_the_forget_your_password() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a")).click();

    }

    @Then("^I enter a valid email$")
    public void iEnterAValidEmail() {
        driver.findElement(By.id("email")).sendKeys("timmeenongene@yahoo.com");
    }

    @Then("^I click retrieve password button$")
    public void i_click_retrieve_password_button() throws Throwable {
        driver.findElement(By.id("SubmitCreate")).click();

    }

    @Then("^I get a confirmation message$")
    public void i_get_a_confirmation_message() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p")).getText();
        driver.quit();

    }
}


