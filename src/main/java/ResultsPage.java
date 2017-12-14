import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ResultsPage {
    public ElementsCollection getResults() {
        return $$("search-result-item");
    }

    public PolicyDetailsPage pressBuy() {
        $(byText("КУПИТЬ")).click();
        return page(PolicyDetailsPage.class);
    }
}
