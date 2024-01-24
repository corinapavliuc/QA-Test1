import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    final  String Base_Url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @Before
    public void setUp(){
        open(Base_Url);
    }
    @After
    public  void tearDown(){
        closeWebDriver();
    }
    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    LinkedPage linkedPage = new LinkedPage();

    SidePanel sidePanel = new SidePanel();
}
