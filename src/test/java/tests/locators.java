package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class locators {

    // Задание 1. Разницы между записью локатора нет

    @Test
    void softAssertionsPage() {
        open("https://ru.selenide.org/documentation.html");

        $(".left-menu div").shouldHave(text("Доки"));
        $(".left-menu").$("div").shouldHave(text("Доки"));

    }
}
