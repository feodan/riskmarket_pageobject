import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class BonusPage {
    public PaymentPage submit() {
        $(byText("Оплатить")).click();
        return page(PaymentPage.class);
    }
}
