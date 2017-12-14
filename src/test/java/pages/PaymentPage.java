package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.openqa.selenium.By.id;

public class PaymentPage {
    public String getUrl() {
        return url();
    }

    public SelenideElement getCardNumber() {
        return $(id("ccnumber"));
    }
}
