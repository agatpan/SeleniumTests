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

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FirstTests {

    private WebDriver driver;
    private LoginPage loginPage;
    private MainPage mainPage;
    private RegisterPage registerPage;




    @Before
    public void setUp() {
git
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        mainPage = PageFactory.initElements(driver, MainPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
      //  registerPage = PageFactory.i

    }

    @Test
    public void loginTest() {
        driver.get("http://demo.nopcommerce.com/login");
        String email = "test@gmail.com";
        String password = "zxcv1234";
        loginPage.userLogin(email, password);

        assertTrue("User is logged in.", mainPage.isUserIsLoggedIn());



    }


    @After
    public void tearDown() {
        driver.close();

    }
}