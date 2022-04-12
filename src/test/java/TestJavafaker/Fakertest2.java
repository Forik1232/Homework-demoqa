package TestJavafaker;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Fakertest2 {




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




    public Fakertest2 openPage() {
        open("/automation-practice-form");

        return this;

    }


    public Fakertest2 setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;

    }

    public Fakertest2 setLastName(String lastName) {
        lastNameInput.setValue(lastName);

        return this;
    }

    public Fakertest2 setEmail(String mail) {
        userEmailInput.setValue(mail);

        return this;

    }

    public Fakertest2 setlabel() {

        genderWrapperInput.click();

        return this;

    }

    public Fakertest2 setUserNumber(String number) {

        userNumberInput.setValue(number);

        return this;

    }
    public Fakertest2 sethobbies() {
        hobbiesInput.click();

        return this;
    }

    public Fakertest2 setdateOfBirth() {
        dateOfBirthInput.click();

        return this;
    }

    public Fakertest2 setmonthInput(String month, String year) {
        monthInput.selectOption(month);
        yearInput.selectOption(year);
        clickInput.click();

        return this;
    }

    public Fakertest2 subjectInput(String object) {
        subjectInput.setValue(object);
        subjectInput.pressEnter();

        return this;
    }
    public Fakertest2 pictureInput(String picture) {
        pictureInput.uploadFromClasspath(picture);

        return this;
    }
    public Fakertest2 adressInput(String adress) {
        adressInput.setValue(adress);

        return this;
    }
    public Fakertest2 setStateInput() {
        clicstate.click();


        return this;
    }
    public Fakertest2 setNCRInput() {
        NCRInput.click();

        return this;
    }

    public Fakertest2 setcityInput() {
        cityInput.click();

        return this;
    }
    public Fakertest2 setDelhiInput() {
        DelhiInput.click();

        return this;
    }

    public Fakertest2 setSubmit() {
        submitInput.pressEnter();

        return this;
    }








    public Fakertest2 setcheckResult(String firstname, String lastname) {
        ChrInput.shouldHave(text(firstname), text(lastname));

        return this;
    }
}




