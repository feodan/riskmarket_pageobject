package steps;

import cucumber.api.java.en.And;
import pages.BonusPage;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.*;

public class PolicyDetailsPageSteps {
    @And("I fill last (.*) and first (.*) names")
    public void iFillLastAndFirstNames(String lastName, String firstName) {
        $(byName("lastName")).val(lastName);
        $(byName("firstName")).val(firstName);
    }

    @And("I check Agree")
    public void iCheckAgree() {
        $("[for='user-agreement']").scrollTo().click();
    }

    @And("I click Submit on Details page")
    public BonusPage iClickSubmit() {
        sleep(1000);
        $(byValue("Оформить")).click();
        return page(BonusPage.class);
    }
}
