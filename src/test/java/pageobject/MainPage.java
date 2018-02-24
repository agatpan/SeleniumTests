package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(linkText = "Log in")
    private WebElement logInLinkElement;

    @FindBy(linkText = "Log out")
    private WebElement logOutLinkElement;

    @FindBy(linkText = "Register")
    private WebElement registerLinkElement;


    @FindBy(name = "userName")
    private WebElement userNameFieldElement;

    @FindBy(name = "password")
    private WebElement passwordFieldElement;

    @FindBy(name = "login")
    private WebElement signInButton;

    public boolean isUserIsLoggedIn() {
        return logOutLinkElement.isDisplayed();
    }
}
