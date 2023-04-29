package ru.netology.SeleniumTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CallbackTest {

    @Test
    void shouldSubmitRequest() {
        open("http://localhost:9999");
        $("[data-test-id=callback-form]");
        $("[data-test-id=name] input").setValue("Василий");
        $("[data-test-id=phone] input").setValue("+79270000000");
        $("[data-test-id=agreement]").click();
        $("[data-test-id=submit]").click();
        $(".alert-success").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами ближайшее время."));
    }
}
