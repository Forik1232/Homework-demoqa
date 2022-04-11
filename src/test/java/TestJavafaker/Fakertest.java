package TestJavafaker;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Fakertest {


    public void openPage() {
        open("/automation-practice-form");

    }


    public void setFirstName(String Daniil) {
        $("[id=firstName]").setValue("Daniil");

    }

    public void setLastName(String value) {
        $("[id=lastName]").setValue("Medved");
    }

    public void setEmail(String value) {
        $("[id=userEmail]").setValue("9414354@mail.ru");

    }

    public void setlabel(String value) {
        String byText;
        $("#genterWrapper").$(byText(value)).click();

    }

    public void checkResult(String key, String value) {
        $("[class=modal-open]").$(byText(key)).shouldHave(text("Daniil"), text("Medved"),
                text("9414354@mail.ru"), text("Male"), text("8921941435"),
                text("18 July,1989"), text("English"), text("Sport"),
                text("1.jpg"),text("Nahimova1"),text("NCR Delhi"));
    }
}



