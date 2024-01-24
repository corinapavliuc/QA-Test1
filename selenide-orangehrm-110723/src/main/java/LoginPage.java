import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
  private   SelenideElement usernameInputField = $("[name='username']");
    private SelenideElement passwordInputField = $("[placeholder=\"Password\"]");
   private SelenideElement loginButton = $("[type='submit']");
 private  SelenideElement errorMessageTest =$(byClassName("oxd-alert-content-text"));

 private SelenideElement logo = $(byAttribute("alt","company-branding"));
//         "[alt=\"company-branding\"]");

    private SelenideElement CredSection=$(byClassName("orangehrm-demo-credentials"));

    private SelenideElement linkedInIcon = $x("//a[contains(@href,'linkedin')]");

    private SelenideElement facebookIcon = $x("//a[contains(@href,'facebook')]");

    private SelenideElement twitterIcon = $x("//a[contains(@href,'twitter')]");

    private SelenideElement youTubeIcon = $x("//a[contains(@href,'youtube')]");
    private SelenideElement passwordForgotButton = $(byClassName("orangehrm-login-forgot-header"));

    public void enterUsername(String usernameValue){
   usernameInputField.shouldBe(visible, Duration.ofSeconds(10));
    usernameInputField.setValue(usernameValue);
}
public void enterPasssword(String passwordValue){
    passwordInputField.setValue(passwordValue);
}
public void  clickOnLoginButton(){
    loginButton.click();
}
    public void clickOnForgotPasswordButton(){
        passwordForgotButton.click();
    }
    public SelenideElement getErrorMessageTest() {
        return errorMessageTest;
    }

    public SelenideElement getLogo() {
        return logo;
    }
    public void logoImageIsCorrect(){
        logo.shouldHave(Condition.attributeMatching("src", ".*ohrm_branding.png.*"));
    }

    public SelenideElement getCredSection() {
        return CredSection;
    }

    public SelenideElement getLinkedInIcon() {
        return linkedInIcon;
    }

    public void clickOnLinkedInIcon(){
        linkedInIcon.click();

}
public  void clickOnFacebookIcon(){
        facebookIcon.click();
}
public void clickOnTwitterIcon(){
        twitterIcon.click();
}
public  void clickOnYoutubeIcon(){
        youTubeIcon.click();
}
    public SelenideElement getFacebookIcon() {
        return facebookIcon;
    }

    public SelenideElement getTwitterIcon() {
        return twitterIcon;
    }

    public SelenideElement getYouTubeIcon() {
        return youTubeIcon;
    }
    public void successLogin(String usernameValue, String passwordValue){
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername(usernameValue);
        loginPage.enterPasssword(passwordValue);
        loginPage.clickOnLoginButton();
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getHeader().shouldBe(visible).shouldHave(text("Dashboard"));
    }

    }






