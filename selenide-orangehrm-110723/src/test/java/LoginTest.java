import com.codeborne.selenide.Condition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertTrue;

public class LoginTest {

    @Before
    public void setUp() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }

    @Test
    public void successLogin() {
//      open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("Admin");
        loginPage.enterPasssword("admin123");
        loginPage.clickOnLoginButton();
//DashboardPage dashboardPage = new DashboardPage();
//dashboardPage.getHeader().shouldBe(visible).shouldHave(text("Dashboard"));
//        $(byTagName("h6")).shouldBe(Condition.visible).shouldHave(text("Dashboard"));
//        $(byTagName("h6")).shouldHave(text("Dashboard"));

    }

    /////invalid password
    @Test
    public void invalidPassword() {
//        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("Admin");
        loginPage.enterPasssword("invalidPassword");
        loginPage.clickOnLoginButton();
        // Assert that an error message is displayed
        loginPage.getErrorMessageTest().shouldBe(visible);
        loginPage.getErrorMessageTest().shouldHave(text("Invalid credentials"));

    }

    //non existing user
    @Test
    public void nonExistingUser() {
//        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("nonExistingUser");
        loginPage.enterPasssword("somePassword");
        loginPage.clickOnLoginButton();
        // Assert that an error message is displayed
        loginPage.getErrorMessageTest().shouldBe(visible);
        loginPage.getErrorMessageTest().shouldHave(text("Invalid credentials"));
    }

    //check that logo is displayed
    @Test
    public void elementsAreDisplayed() {
        LoginPage loginPage = new LoginPage();
        // Assuming you have a method in LoginPage class to get the logo element
        loginPage.getLogo().shouldBe(visible);
        loginPage.logoImageIsCorrect();
        //creds section is displayed
        loginPage.getCredSection().shouldBe(visible);
        loginPage.getLinkedInIcon().shouldBe(visible);
        loginPage.getFacebookIcon().shouldBe(visible);
        loginPage.getTwitterIcon().shouldBe(visible);
        loginPage.getYouTubeIcon().shouldBe(visible);
    }

    @Test
    public void allLinksAreCorrect() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickOnLinkedInIcon();
        LinkedPage linkedPage = new LinkedPage();
        //   sleep(20000);
        switchTo().window(1);
        linkedPage.getPopupText().shouldHave(text("LinkedIn"));
        closeWindow();
        //CHECK facebook link
        FacebookPage facebookPage = new FacebookPage();
        switchTo().window(0);
        loginPage.clickOnFacebookIcon();
        switchTo().window(1);
        facebookPage.getPopupTextFacebook().shouldBe(visible);
        closeWindow();
        //CHECK twitter link
        TwitterPage twitterPage = new TwitterPage();
        switchTo().window(0);
        loginPage.clickOnTwitterIcon();
        switchTo().window(1);
        sleep(15000);
        twitterPage.getPopupTextTwitter().shouldBe(visible);
        closeWindow();
        //CHECK youtube link
        YoutubePage youtubePage = new YoutubePage();
        switchTo().window(0);
        loginPage.clickOnYoutubeIcon();
        switchTo().window(1);
        youtubePage.getPopupTextYoutube().shouldHave(text("Youtube"));

    }

    @Test
    public void resetPasswordPage() {
        //Username input field
        //Cancel button
        //Reset Password button
        LoginPage loginPage = new LoginPage();
        loginPage.clickOnForgotPasswordButton();
        ResetPasswordPage resetPasswordPage = new ResetPasswordPage();

        resetPasswordPage.getUsernameInputField().shouldBe(visible);
        resetPasswordPage.getCancelButton().shouldBe(visible);
        resetPasswordPage.getResetButton().shouldBe(visible);
    }

    @Test
    public void resetPasswordLinkSending() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickOnForgotPasswordButton();
        ResetPasswordPage resetPasswordPage = new ResetPasswordPage();
        resetPasswordPage.enterUsername("jack167");
        resetPasswordPage.clickOnForgotPasswordButton();
        resetPasswordPage.getResetPasswordTitle().shouldHave(text("Reset Password link sent successfully"));
    }

    @Test
    public void resetPasswordWithoutUsername() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickOnForgotPasswordButton();
        ResetPasswordPage resetPasswordPage = new ResetPasswordPage();
        resetPasswordPage.clickOnForgotPasswordButton();
        resetPasswordPage.getErrorMessage().shouldHave(text("Required"));
    }

}


