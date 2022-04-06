package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelectorMode;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.w3c.dom.Text;


import java.util.spi.CalendarDataProvider;

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
        $("label[for='gender-radio-1']").click();
        $("[id=userNumber]").setValue("8921941435");
        $("label[for='hobbies-checkbox-1']").click();
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1989");
        $("div[aria-label='Choose Tuesday, July 18th, 1989']").click();
        











    }

}
