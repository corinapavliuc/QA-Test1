import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class SidePanelTest extends BaseTest{

    @Test
    public  void allLinksAreDisplayed(){
        LoginPage loginPage = new LoginPage();
        loginPage.successLogin("Admin","admin123");

    }


}
