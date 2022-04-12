package TestJavafaker;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Fakertest {

    SelenideElement firstNameInput = $("[id=firstName]");
    SelenideElement lastNameInput = $("[id=lastName]");
    SelenideElement userEmailInput = $("[id=userEmail]");
    SelenideElement genderWrapperInput = $("label[for='gender-radio-1']");
    SelenideElement userNumberInput = $("[id=userNumber]");
    SelenideElement hobbiesInput = $("label[for='hobbies-checkbox-1']");
    SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
    SelenideElement monthInput = $(".react-datepicker__month-select");
    SelenideElement yearInput = $(".react-datepicker__year-select");
    SelenideElement clickInput = $("div[aria-label='Choose Tuesday, July 18th, 1989']");


    public Fakertest openPage() {
        open("/automation-practice-form");

        return this;

    }


    public Fakertest setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;

    }

    public Fakertest setLastName(String lastName) {
        lastNameInput.setValue(lastName);

        return this;
    }

    public Fakertest setEmail(String value) {
        userEmailInput.setValue("9414354@mail.ru");

        return this;

    }

    public Fakertest setlabel() {

        genderWrapperInput.click();

        return this;

    }

    public Fakertest setUserNumber(String number) {

        userNumberInput.setValue(number);

        return this;

    }
    public Fakertest sethobbies() {
        hobbiesInput.click();

        return this;
    }

    public Fakertest setdateOfBirth() {
        dateOfBirthInput.click();

        return this;
    }

    public Fakertest setmonthInput(String month,String year) {
        monthInput.selectOption(month);
        yearInput.selectOption(year);
        clickInput.click();

        return this;
    }







    public Fakertest checkResult(String key, String value) {
        $("[class=modal-open]").$(byText(key)).shouldHave(text("Daniil"), text("Medved"),
                text("9414354@mail.ru"), text("Male"), text("8921941435"),
                text("18 July,1989"), text("English"), text("Sport"),
                text("1.jpg"),text("Nahimova1"),text("NCR Delhi"));

        return this;
    }


}



