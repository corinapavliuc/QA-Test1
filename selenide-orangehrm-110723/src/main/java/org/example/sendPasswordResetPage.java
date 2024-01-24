package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;

public class sendPasswordResetPage {
    private SelenideElement confirmationText =$(byTagName("username"));
}
