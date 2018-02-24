package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    @FindBy(name = "Gender")
    private WebElement genderNameButton;

    @FindBy(name = "FirstName")
    private WebElement firstNameField;

    @FindBy(name = "LastName")
    private WebElement lastNameField;

    @FindBy(name = "Email")
    private WebElement userNameField;

    @FindBy(name = "Password")
    private WebElement passwordField;

    @FindBy(name = "ConfirmPassword")
    private WebElement confirmPasswordField;

    @FindBy(name = "register-button")
    private WebElement submitButton;



    public void registerUserForm(String firstName, String lastName, String email, String password, String
            confirmPassword) {

        genderNameButton.click();
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        userNameField.sendKeys(email);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(confirmPassword);
    }


    public void clickOnSubmitButton() {
        submitButton.click();
    }
}
