package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class RegistrationPage {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Create an Account')]")
    WebElement createAccountLink;

    @FindBy(xpath = "//input[@id ='firstname']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id = 'lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id = 'email_address']")
    WebElement emailAddressField;

    @FindBy(xpath = " //input[@id = 'password']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@id='password-confirmation']")
    WebElement confirmPasswordField;

    @FindBy(xpath = "//button[@title='Create an Account']")
    WebElement createAccountButton;
    

    @FindBy(xpath = ("//div[contains(text(),\"There is already an account with this email address. If you are sure that it is your email address, \")]"))
    WebElement successfullydisplayed;
    
    @FindBy(xpath = ("(//a[contains(text(),'Sign In')])[1]"))
    WebElement siginin;
    
    @FindBy(xpath=("//input[@type =\"email\" and @class=\"input-text\" and @title=\"Email\"] "))
    WebElement title;
    
    @FindBy(xpath=("//input[@type =\"password\" and @class=\"input-text\" and @title=\"Password\"] "))
    WebElement password;
    
    @FindBy(xpath=("(//button[@type=\"submit\"]//span[contains(text(),\"Sign In\")])[1]"))
    WebElement signin;


    // Constructor
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void openRegistrationPage() {
        createAccountLink.click();
        firstName.sendKeys("rajat");
       lastName.sendKeys("tripathy");
       emailAddressField.sendKeys("rajtripathy19047@gmail.com");
       passwordField.sendKeys("SB54*dbf");
       confirmPasswordField.sendKeys("SB54*dbf");
       createAccountButton.click();
       successfullydisplayed.isDisplayed();
       siginin.click();
       title.sendKeys("rajattripathy19047@gmail.com");
       password.sendKeys("SB54*dbf");
       signin.click();
    }

    public void enterFirstName(String firstName) {
    	//firstName.sendKeys("rajat");
    }

    public void enterLastName(String lastName) {
        //lastName.sendKeys("tripathy");
    }

    public void enterEmail(String email) {
        emailAddressField.sendKeys("rajtripathy19047@gmail.com");
    }

    public void enterPassword(String password) {
        passwordField.sendKeys("SB54*dbf");
    }

    public void confirmPassword(String password) {
        confirmPasswordField.sendKeys("SB54*dbf");
    }

    public void submitForm() {
        createAccountButton.click();
    }
}