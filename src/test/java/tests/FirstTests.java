package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageobject.LoginPage;
import pageobject.MainPage;
import pageobject.RegisterPage;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FirstTests {

    private WebDriver driver;
    private LoginPage loginPage;
    private MainPage mainPage;
    private RegisterPage registerPage;




    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        mainPage = PageFactory.initElements(driver, MainPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        registerPage = PageFactory.initElements(driver, RegisterPage.class);

    }

    @Test
    public void loginTest() {
        driver.get("http://demo.nopcommerce.com/login");
        String email = "test3@gmail.com";
        String password = "zxcv1234";
        loginPage.userLogin(email, password);

        assertTrue("User is logged in.", mainPage.isUserIsLoggedIn());

    }

    @Test
    public void registerTest(){

        driver.get("http://demo.nopcommerce.com/register");

        String firstName = "Ada";
        String lastName = "Kowalska";
        String email = "test3@gmail.com";
        String password = "zxcv1234";
        String confirmPassword = "zxcv1234";
        registerPage.registerUserForm(firstName, lastName, email, password, confirmPassword);
        registerPage.clickOnSubmitButton();

        /*assertTrue("User was not reggister correctly.", driver.getCurrentUrl().equals("http://demo.nopcommerce" +
                ".com/register"));*/

       assertThat(driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText()).contains("The specified email already exists");

    }

    @Test
    public void findAndClickMainPageElements(){
        driver.get("http://demo.nopcommerce.com");

        assertTrue(mainPage.areLinkElementClickable());

    }


    @After
    public void tearDown() {
        driver.close();

    }
}