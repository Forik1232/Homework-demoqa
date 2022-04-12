package guru.qa;

import TestJavafaker.Fakertest;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class DemoqaTest {

    Fakertest fakertest = new Fakertest();

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";




    }

    @Test
    void practiceform() {

        fakertest.openPage()
        .setFirstName("Daniil")
        .setLastName("Medved")
        .setEmail("9414354@mail.ru")
        .setlabel()
        .setUserNumber("8921941435")
        .sethobbies()
        .setdateOfBirth()
        .setmonthInput("July", "1989");


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
