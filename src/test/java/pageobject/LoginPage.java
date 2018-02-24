package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{

    @FindBy(name = "Email")
    private WebElement emaliFieldElement;

    @FindBy(name = "Password")
    private WebElement passwordFieldElement;

    @FindBy(className = "login-button")
    private WebElement submitButton;

    public void userLogin(String email, String password) {
        emaliFieldElement.sendKeys(email);
        passwordFieldElement.sendKeys(password);
        submitButton.click();
    }
}