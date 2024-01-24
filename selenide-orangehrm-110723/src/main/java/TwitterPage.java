import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TwitterPage  {
    private SelenideElement popupTextTwitter = $x("//span[@class='css-1qaijid r-bcqeeo r-qvutc0 r-poiln3' and text()='New to X?']");

    public SelenideElement getPopupTextTwitter() {
        return popupTextTwitter;
    }
}
