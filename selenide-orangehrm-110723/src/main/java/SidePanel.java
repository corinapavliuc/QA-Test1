import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$$;

public class SidePanel {

    ElementsCollection links =$$(byClassName("oxm-main-menu-item-wrapper"));

    public void  checkLinksAmount(){
        links.shouldHave(size(21));
    }

}
