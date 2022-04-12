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
    SelenideElement subjectInput = $("#subjectsInput");
    SelenideElement pictureInput = $("#uploadPicture");
    SelenideElement adressInput = $("[id=currentAddress]");
    SelenideElement clicstate = $("#state");
    SelenideElement NCRInput = $(byText("NCR"));
    SelenideElement cityInput = $("#city");
    SelenideElement DelhiInput = $(byText("Delhi"));
    SelenideElement submitInput = $("#submit");
    SelenideElement ChrInput = $("[class=modal-open]");




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

    public Fakertest setEmail(String mail) {
        userEmailInput.setValue(mail);

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

    public Fakertest subjectInput(String object) {
        subjectInput.setValue(object);
        subjectInput.pressEnter();

        return this;
    }
    public Fakertest pictureInput(String picture) {
        pictureInput.uploadFromClasspath(picture);

        return this;
    }
    public Fakertest adressInput(String adress) {
        adressInput.setValue(adress);

        return this;
    }
    public Fakertest setStateInput() {
        clicstate.click();


        return this;
    }
    public Fakertest setNCRInput() {
        NCRInput.click();

        return this;
    }

    public Fakertest setcityInput() {
        cityInput.click();

        return this;
    }
    public Fakertest setDelhiInput() {
        DelhiInput.click();

        return this;
    }

    public Fakertest setSubmit() {
        submitInput.pressEnter();

        return this;
    }








    public Fakertest setcheckResult(String firstname, String lastname) {
        ChrInput.shouldHave(text(firstname), text(lastname));

        return this;
    }
}




