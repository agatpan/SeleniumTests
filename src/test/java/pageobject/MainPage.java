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

    @FindBy(linkText = "Computers")
    private WebElement computersLinkElement;

    @FindBy(linkText = "Electronics")
    private WebElement electronicsLinkElement;

    @FindBy(linkText = "Apparel")
    private WebElement apparelLinkElement;

    @FindBy(linkText = "Digital downloads")
    private WebElement digitalDownloadsLinkElement;

    @FindBy(linkText = "Books")
    private WebElement booksLinkElement;

    @FindBy(linkText = "Jewelry")
    private WebElement yewelryLinkElement;

    @FindBy(linkText = "Gift Cards")
    private WebElement giftCardsLinkElement;

    public boolean isUserIsLoggedIn() {
        return logOutLinkElement.isDisplayed();
    }

    public boolean areLinkElementClickable() {
        return
                computersLinkElement.isDisplayed() &&
                electronicsLinkElement.isDisplayed() &&
                apparelLinkElement.isDisplayed() &&
                booksLinkElement.isDisplayed() &&
                yewelryLinkElement.isDisplayed() &&
                giftCardsLinkElement.isDisplayed();

    }
}