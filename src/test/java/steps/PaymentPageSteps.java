package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.openqa.selenium.By.id;

public class PaymentPageSteps {
    @Then("url is (.*)")
    public void urlIs(String url) {
        url().equals(url);
    }

    @And("Card Number field is enabled")
    public void cardNumberFieldIsEnabled() {
        $(id("ccnumber")).shouldBe(enabled);
    }
}
