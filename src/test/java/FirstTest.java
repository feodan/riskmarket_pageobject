

import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.enabled;

public class FirstTest extends BaseTest {
    @Test
    public void firstTest() {
        /**action*/
        startPage
                .loginAs(userName, userPwd)
                .selectCountries("Шенген", "Финляндия", "Китай")
                .specifyDateOfJourney()
                .birthdayOfTourists("18.06.1987");
        resultsPage
                = startPage.pressCalculationPolicy();

        /**check*/
        resultsPage
                .getResults().shouldBe(sizeGreaterThan(10));

        /**action*/
        detailsPage = resultsPage.pressBuy();
        detailsPage.setLastFirstName("TESTOVIY", "TEST").setPassport("123456789").checkAgree();
        bonusPage = detailsPage.submit();
        paymentPage = bonusPage.submit();

        /**check*/
        paymentPage.getUrl().equals("https://form.payonlinesystem.com/default/draft/form#card");
        paymentPage.getCardNumber().shouldBe(enabled);
    }
}
