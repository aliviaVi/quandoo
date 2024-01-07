import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    public SelenideElement getTopRatedBtn() {
        return topRatedBtn;
    }

    public SelenideElement getSelectedFilters() {
        return selectedFilters;
    }

    public SelenideElement getAfricanCuisineBtn() {
        return africanCuisineBtn;
    }

    @FindBy(xpath = "//button[@data-qa = 'filter-button-top-rated']")
    private SelenideElement topRatedBtn;
    @FindBy(xpath = "//span[contains(.,'Review score: 4-6')]")
    private SelenideElement selectedFilters;
    @FindBy(xpath = "//*[@id='desktop-filters-wrapper']/div[2]/div[2]/div/li[2]/label/i")
    private SelenideElement africanCuisineBtn;
    @FindBy(xpath = "//input[@data-cuisine-id = '03c331d2-8f5f-4d45-8731-e5e98ebfee00']")
    private SelenideElement africanCuisineChecked;
    @FindBy(xpath = "//span[@class='rc-slider-mark-text rc-slider-mark-text-active'][normalize-space()='4']")
    private SelenideElement sliderResult;

    @FindBy(xpath = "//label[@class='j2exl7-2 jgNzqM']//span[@class='j2exl7-6 hqdVci'][normalize-space()='(5)']")
    private SelenideElement numbersOfAfricanCuisine;
    @FindBy(xpath = "//div[@data-qa='merchant-card-wrapper']")
    private SelenideElement merchandCards;

    public SelenideElement getMerchandCards() {
        return merchandCards;
    }

    public SelenideElement getAfricanCuisineChecked() {
        return africanCuisineChecked;
    }

    public SelenideElement getNumbersOfAfricanCuisine() {
        return numbersOfAfricanCuisine;
    }

    public SelenideElement getSliderResult() {
        return sliderResult;
    }

    @Override
    public void clickOnBtn(SelenideElement button) {
        button.click();
    }

    public SelenideElement btnAttribute() {
       return topRatedBtn;
    }

    public SelenideElement selectedFilters(){
        return  selectedFilters;
    }
}
