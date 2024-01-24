import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class FacebookPage {
    private SelenideElement popupTextFacebook = $(byAttribute("aria-label", "Facebook"));

    public SelenideElement getPopupTextFacebook() {
        return popupTextFacebook;
    }
}

