package steps;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.ResultsPage;
import pages.StartPage;

import java.util.List;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StartPageSteps {
    StartPage startPage;

    @Given("I open (.*) page")
    public void iOpenPage(String url) {
        System.setProperty("webdriver.chrome.driver", "D:/dev/WebDrivers/chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.timeout = 30000;
        Configuration.collectionsTimeout = 30000;
        /*StartPage*/
        startPage = open(url, StartPage.class);
    }

    @And("I login as (.*) with password (.*)")
    public void iLogin(String name, String password) {
        $(byText("Войти")).click();
        $(byName("userName")).val(name);
        $(byName("password")).val(password);
        $(byText("Войти")).click();
        $(".modal-content").waitUntil(disappear, 3000);
    }

    @And("I select countries (.*)")
    public void iSelectCountries(List<String> countries) {
        for (String s : countries) {
            $(".countries-widget__wrapper input").append(s).pressEnter();
            sleep(100);
        }
    }

    @And("I specify date of journey")
    public void iSpecifyDateOfJourney() {
        $("#preview").click();
        $(".period-control__popup-day", 50).click();
        $(".period-control__popup-day", 60).click();
    }

    @And("I specify birthday of tourists (.*)")
    public void iSpecifyBirthdayOfTourists(String date) {
        $(byText("Кто едет")).click();
        $("input[placeholder='дд.мм.гггг']").val(date);
    }

    @When("I press Calculate button")
    public ResultsPage iPressCalculateButton() {
        $(byText("Рассчитать полис")).click();
        return page(ResultsPage.class);
    }
}
