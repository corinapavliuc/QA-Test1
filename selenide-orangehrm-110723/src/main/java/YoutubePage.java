import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class YoutubePage {
    private SelenideElement popupTextYoutube = $(byClassName("vrGRNc"));

    public SelenideElement getPopupTextYoutube() {
        return popupTextYoutube;
    }
}
