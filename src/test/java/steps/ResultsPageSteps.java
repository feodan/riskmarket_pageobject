package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PolicyDetailsPage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

public class ResultsPageSteps {
    @Then("I see the Results page")
    public void iSeeTheResultsPage() {
        $$("search-result-item").shouldBe(sizeGreaterThan(10));
    }

    @When("I click Buy")
    public PolicyDetailsPage iClickBuy() {
        $(byText("КУПИТЬ")).click();
        return page(PolicyDetailsPage.class);
    }
}
