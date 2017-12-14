import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class SecondTest extends BaseTest {
    @Test
    public void testSecond() {
        $(xpath("(//button)[14]")).should(matchText("РАССЧИТАТЬ ПОЛИС"));
        $(xpath("(//button)[14]")).shouldHave(text("РАССЧИТАТЬ ПОЛИС"));
    }
}
