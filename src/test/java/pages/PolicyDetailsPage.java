package pages;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.*;

public class PolicyDetailsPage {
    public PolicyDetailsPage setLastFirstName(String lastName, String firstName) {
        $(byName("lastName")).val(lastName);
        $(byName("firstName")).val(firstName);
        return this;
    }

    public PolicyDetailsPage checkAgree() {
        $("[for='user-agreement']").scrollTo().click();
        return this;
    }

    public BonusPage submit() {
        sleep(1000);
        $(byValue("Оформить")).click();
        return page(BonusPage.class);
    }
}
