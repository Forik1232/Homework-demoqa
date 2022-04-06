package guru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class DemoqaTest {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void practiceform() {
        open("/automation-practice-form");

        $("[id=firstName]").setValue("Daniil");
        $("[id=lastName]").setValue("Medved");
        $("[id=userEmail]").setValue("9414354@mail.ru");
        $("[id=genterWrapper]").setValue("Daniil");
    }

}
