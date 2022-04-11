package guru.qa;

import TestJavafaker.Fakertest;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class DemoqaTest {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";


    }

    @Test
    void practiceform() {
        Fakertest fakertest = new Fakertest();
        fakertest.openPage();

        fakertest.setFirstName("Daniil");
        fakertest.setLastName("Medved");
        fakertest.setEmail("9414354@mail.ru");
        fakertest.setlabel("Male");


        $("[id=userNumber]").setValue("8921941435");
        $("label[for='hobbies-checkbox-1']").click();
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1989");
        $("div[aria-label='Choose Tuesday, July 18th, 1989']").click();
        $("#subjectsInput").setValue("E").pressEnter();
        $("#uploadPicture").uploadFromClasspath("1.jpg");
        $("[id=currentAddress]").setValue("Nahimova1");
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Delhi")).click();
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        $("#submit").click();

        $("[class=modal-open]").shouldHave(text("Daniil"), text("Medved"),
                text("9414354@mail.ru"), text("Male"), text("8921941435"),
                text("18 July,1989"), text("English"), text("Sport"),
                text("1.jpg"),text("Nahimova1"),text("NCR Delhi"));


























    }

}
