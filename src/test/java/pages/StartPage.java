package pages;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StartPage {
    public StartPage loginAs(String name, String password) {
        $(byText("Войти")).click();
        $(byName("userName")).val(name);
        $(byName("password")).val(password);
        $(byText("Войти")).click();
        $(".modal-content").waitUntil(disappear, 3000);
        return this;
    }

    public StartPage selectCountries(String... countries) {
        for (String s : countries) {
            $(".countries-widget__wrapper input").append(s).pressEnter();
            sleep(100);
        }
        return this;
    }

    public StartPage specifyDateOfJourney() {
        $("#preview").click();
        $(".period-control__popup-day", 50).click();
        $(".period-control__popup-day", 60).click();
        return this;
    }

    public StartPage birthdayOfTourists(String date) {
        $(byText("Кто едет")).click();
        $("input[placeholder='дд.мм.гггг']").val(date);
        return this;
    }

    public ResultsPage pressCalculationPolicy() {
        $(byText("Рассчитать полис")).click();
        return page(ResultsPage.class);
    }
}
