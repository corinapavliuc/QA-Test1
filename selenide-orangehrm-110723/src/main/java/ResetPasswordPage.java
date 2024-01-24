import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class ResetPasswordPage {
    private SelenideElement usernameInputField = $(byName("úsername"));
    private SelenideElement cancelButton = $(byClassName("orangehrm-forgot-password-button--cancel"));
    private SelenideElement resetButton = $(byClassName("orangehrm-forgot-password-button--reset"));
    private SelenideElement resetPasswordTitle = $(byClassName("orangehrm-forgot-password-title"));
    private SelenideElement errorMessage = $(byClassName("oxd-input-field-error-message"));
    private SelenideElement passwordForgotButton = $(byClassName("orangehrm-login-forgot-header"));






    public void clickOnForgotPasswordButton(){
        passwordForgotButton.click();
    }
    public SelenideElement getUsernameInputField() {
        return usernameInputField;
    }

    public SelenideElement getCancelButton() {
        return cancelButton;
    }

    public SelenideElement getResetButton() {
        return resetButton;
    }

    public SelenideElement getResetPasswordTitle() {
        return resetPasswordTitle;
    }

    public SelenideElement getErrorMessage() {
        return errorMessage;
    }
    public String enterUsername(String usernameValue) {
       getUsernameInputField().setValue(usernameValue);
        return usernameValue;
    }
}
