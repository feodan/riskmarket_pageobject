package steps;

import cucumber.api.java.en.And;
import pages.PaymentPage;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class BonusPageSteps {
    @And("I click Submit on Bonus page")
    public PaymentPage iClickSubmitOnBonusPage() {
        $(byText("Оплатить")).click();
        return page(PaymentPage.class);
    }
}
