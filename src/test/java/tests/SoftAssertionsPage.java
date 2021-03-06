package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsPage {

    // Задание 2

    @Test
    void softAssertionsPage() {
        open("https://github.com");
        $(".header-search-input").setValue("selenide").pressEnter();
        $("a[href='/selenide/selenide']").click();
        $("a[href='/selenide/selenide/wiki']").click();
        $$(".d-block").findBy(text("SoftAssertions")).shouldBe(visible);
        $$(".Box-row").findBy(text("SoftAssertions")).click();
        $("ol[start='3'] li").shouldHave(text("Using JUnit5 extend"));
    }
}
