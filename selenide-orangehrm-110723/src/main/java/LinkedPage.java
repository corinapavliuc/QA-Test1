import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class LinkedPage {
    private SelenideElement popupText = $(byClassName("contextual-sign-in-modal__join-now"));

    public SelenideElement getPopupText() {
        return popupText;
    }
}



