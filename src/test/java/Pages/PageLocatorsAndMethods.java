package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.text.DecimalFormat;

public class PageLocatorsAndMethods {

    //Insert Your locators here

    @FindBy (how= How.LINK_TEXT, using = "Sign in")
    public static WebElement SignInLink;

    @FindBy (how= How.NAME, using = "SubmitCreate")
    public static WebElement CreateAccButton;

    @FindBy (how= How.ID, using = "id_gender1")
    public static WebElement SelectGender;

    @FindBy (how= How.NAME, using = "customer_firstname")
    public static WebElement UserFirstNAme;

    @FindBy (how= How.NAME, using = "customer_lastname")
    public static WebElement Userlastname;

    @FindBy (how= How.XPATH, using = "//*[@id=\"passwd\"]")
    public static WebElement Password;

    @FindBy (how= How.ID, using = "firstname")
    public static WebElement FirstName;

    @FindBy (how= How.ID, using = "lastname")
    public static WebElement LastName;

    @FindBy (how= How.ID, using = "address1")
    public static WebElement  Address;

    @FindBy (how= How.NAME, using = "city")
    public static WebElement City;

    @FindBy (how= How.XPATH, using = "//*[@id=\"postcode\"]")
    public static WebElement PostCode;

    @FindBy (how= How.ID, using = "phone_mobile")
    public static WebElement PhoneNumber;

    @FindBy (how= How.NAME, using = "alias")
    public static WebElement UserAlias;

    @FindBy (how= How.ID, using = "submitAccount")
    public static WebElement submitAccountutton;

    @FindBy (how= How.NAME, using = "email")
    public static WebElement LoginEmail;

    @FindBy (how= How.NAME, using = "passwd")
    public static WebElement LoginPassword;





    //Declare Your Methods Here
    public void ClickSignIn() {SignInLink.click();}
    public void ClickCreatAccButton() {CreateAccButton.click();}
    public void SelectGender() {SelectGender.click();}
    public void typeCustomerFirstName() {UserFirstNAme.sendKeys("Lanre");}
    public void typeCustomerLastName() {Userlastname.sendKeys("Iwalehin");}
    public void typeUSerPassword() {Password.sendKeys("automation");}
    public void typeFirstName() {FirstName.sendKeys("Lanre");}
    public void typeLastName() {LastName.sendKeys("Iwalehin");}
    public void typeAddress() {Address.sendKeys("2 Bowen Crescent");}
    public void typeCity() {City.sendKeys("chicago");}
    public void typePostCode() {PostCode.sendKeys("00000");}
    public void typePhoneNumber() {PhoneNumber.sendKeys("123456789");}
    public void ClearAlias() {UserAlias.clear();}
    public void typeUserAlias() {UserAlias.sendKeys("Padova");}
    public void ClickSubmitAccountButton() {submitAccountutton.click();}
    public void typeLoginEmail(String email) {LoginEmail.sendKeys(email);}
    public void typeLoginPasswd(String password) {LoginPassword.sendKeys(password);}
}
