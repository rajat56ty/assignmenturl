package StepDefinitions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.fedcm.model.LoginState;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginSteps  {
	 RegistrationPage rp;

	WebDriver driver;
	@Given("User is in Log in Page")
	public void user_is_in_log_in_page() throws Exception {
	    System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\ASUS\\Downloads\\bddframework-main\\bddframework-main\\FrameworkNew\\src\\test\\resources\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	    //WebDriverWait.chromedriver().driverVersion("130.0.6723.91").setup();
	    //driver = new ChromeDriver();
	        driver = new ChromeDriver();
	        rp=new RegistrationPage(driver);
//	    login d = new login(driver);
	    
//	    WebDriverManager.firefoxdriver().setup();
//	    WebDriver driver = new FirefoxDriver();
      
	    
	        
	        //driver.get("www.google.com");
	    //driver.get("https://www.google.com");
	    driver.get("https://magento.softwaretestingboard.com/ ");
	    rp.openRegistrationPage();
	    //driver.findElement(By.xpath("//div[@class=\"panel header\"]//a[contains(text(),\"Create an Account\")]")).click();

//	    driver.findElement(By.xpath("//span[contains(text(),\"Create New Customer Account\")]")).isDisplayed();
//	    driver.findElement(By.xpath("//input[@id = \"firstname\"]")).isDisplayed();
//	    driver.findElement(By.xpath("//input[@id = \"firstname\"]")).sendKeys("rajat");
//	    driver.findElement(By.xpath("//input[@id = \"lastname\"]")).sendKeys("tripathy");
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)");
//        driver.findElement(By.xpath("//input[@id = \"email_address\"]")).isDisplayed();
//	    driver.findElement(By.xpath("//input[@id = \"email_address\"]")).sendKeys("rajattripathy19047@gmail.com");
//	  driver.findElement(By.xpath("//button[@title=\"Create an Account\"]//span[contains(text(),\"Create an Account\")]")).isDisplayed();
//	    driver.findElement(By.xpath("//button[@title=\"Create an Account\"]//span[contains(text(),\"Create an Account\")]")).click();
//	
//	    driver.findElement(By.xpath("  //input[@id = \"password\"]")).isDisplayed();
//	   driver.findElement(By.xpath("  //input[@id = \"password\"]")).sendKeys("SB54*dbf");
//
//
//		
//	 
//	   
//	   driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]")).click();
//		   driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]")).sendKeys("SB54*dbf");
//		   driver.findElement(By.xpath("//button[@title=\"Create an Account\"]")).click();
//		   driver.findElement(By.xpath("//button[@title=\"Create an Account\"]")).sendKeys("SB54*dbf");
//		   driver.findElement(By.xpath("//div[contains(text(),\"There is already an account with this email address. If you are sure that it is your email address, \")]")).isDisplayed();


	 
	    
//	  
//	        // Maximize the browser
//	        driver.manage().window().maximize();
//	        //Thread.sleep(100000);
//	        
//	        
//	        //2nd test case
//	        driver.get("https://magento.softwaretestingboard.com/ ");
//	        driver.findElement(By.xpath("(//a[contains(text(),\" Sign In\")])[1]")).click();
//	      
//	        driver.findElement(By.xpath("//input[@type =\"email\" and @class=\"input-text\" and @title=\"Email\"] ")).sendKeys("rajattripathy19047@gmail.com");
//
//	       driver.findElement(By.xpath("//input[@type =\"password\" and @class=\"input-text\" and @title=\"Password\"] ")).sendKeys("SB54*dbf");
//	       //driver.findElement(By.xpath("(//a[contains(text(),\" Sign In\")])[1]")).click();
//	    		   driver.findElement(By.xpath("(//button[@type=\"submit\"]//span[contains(text(),\"Sign In\")])[1]")).click();
//	    		 
//	    		   driver.findElement(By.xpath("//div[@class=\"panel header\"]//li[@class=\"greet welcome\"]")).isDisplayed();
	}


	@When("User put valid id and password {string} and {string}")
	public void user_put_valid_id_and_password(String firstName,String enterLastName ) {
		  RegistrationPage rp=new RegistrationPage(driver);
		  rp.enterFirstName("rajat");	
		  rp.enterLastName("tripathy");
		  
		  
	}

	@And("User put valid emailid and password {string} and {string} and confirmpassword {string}")
	public void user_put_valid_emailid_and_password_and_confirmpassword(String email, String password, String confirmPassword) {
		  RegistrationPage rp=new RegistrationPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
	  rp.enterEmail("rajatripathy19047@gmail.com");
	  rp.enterPassword("SB54*dbf");
	    rp.confirmPassword("SB54*dbf");
	    
	}

@And("User clicks on log in button")
public void user_clicks_on_log_in_button() {
	 RegistrationPage rp=new RegistrationPage(driver);
	rp.submitForm();
}

@Then("User should be on Home Page")
public void user_should_be_on_home_page() {
	RegistrationPage rp=new RegistrationPage(driver);
	rp.successfullydisplayed.isDisplayed();;
  
}

@Given("User is in Signin Page")
public void user_is_in_signin_page() {
    // Instantiate the SignInPage and open the URL for the Sign-in page
	  RegistrationPage rp=new RegistrationPage(driver);
    rp. siginin.click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1000)");
}
@When("User put valid emailid and password {string} and {string}")
public void user_put_valid_emailid_and_password(String emailid, String password) {
	
}
@And ("User click on log in button")
public void user_click_log_in_button() {
	
}
}



//package steps;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.java.en.*;
//
//public class LoginSteps<login>  {
//
//    WebDriver driver;
//    LoginState loginPage;
//    RegistrationPage registrationPage;
//
//    @Given("User is in Log in Page")
//    public void user_is_in_log_in_page() throws Exception {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        // Initialize page objects
////        loginPage = new LoginPage(driver);
//        //WebDriverManager.chromedriver().driverVersion("130.0.6723.91").setup();
//	    driver = new ChromeDriver();
////	        //driver = new ChromeDriver();
//	    //loginPage d = new loginPage(driver);
//        registrationPage = new RegistrationPage(driver);
//
//        // Open the website and navigate to registration
//        driver.get("https://magento.softwaretestingboard.com/");
//        registrationPage.openRegistrationPage();
//    }
//
//    @When("User registers with valid details")
//    public void user_registers_with_valid_details() {
//        registrationPage.enterFirstName("Rajat");
//        registrationPage.enterLastName("Tripathy");
//        registrationPage.enterEmail("rajattripathy19047@gmail.com");
//        registrationPage.enterPassword("SB54*dbf");
//        registrationPage.confirmPassword("SB54*dbf");
//        registrationPage.submitForm();
//    }
//
////    @When("User puts valid id and password")
////    public void user_put_valid_id_and_password() {
////        loginPage.openLoginPage();
////        loginPage.enterEmail("rajattripathy19047@gmail.com");
////        loginPage.enterPassword("SB54*dbf");
////    }
////
////    @And("User clicks on log in button")
////    public void user_click_on_log_in_button() {
////        loginPage.clickSignIn();
////    }
////
////    @Then("User should be on Home Page")
////    public void user_should_be_on_home_page() {
////        System.out.println("User is on the Home Page");
////    }
//}
