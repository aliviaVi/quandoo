import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public abstract class BasePage {

    public static final String BASE_URL = "https://www.quandoo.de/berlin";

    @FindBy(id = "onetrust-accept-btn-handler")
    public  SelenideElement btnCookies;

    public void clickOnBtn(SelenideElement button){
        button.click();
    }


}
