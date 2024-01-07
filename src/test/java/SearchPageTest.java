import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SearchPageTest {
    SearchPage searchPage;
    @BeforeEach
    public void setUp(){
        searchPage = open(BasePage.BASE_URL, SearchPage.class);
        searchPage.clickOnBtn(searchPage.btnCookies);
    }

    @Test
    public void topRatedBtnActive(){
        searchPage = open(BasePage.BASE_URL, SearchPage.class);
        searchPage.clickOnBtn(searchPage.getTopRatedBtn());
        searchPage.btnAttribute().shouldHave(Condition.attribute("data-state", "active"));
        searchPage.selectedFilters().shouldBe(Condition.exist);
        searchPage.getSliderResult().shouldBe(Condition.attribute("class","rc-slider-mark-text rc-slider-mark-text-active"));

    }
    @Test
    public void ifAfricanCuisineCheckedTest(){
        searchPage.clickOnBtn(searchPage.getAfricanCuisineBtn());
        String numbersString = searchPage.getNumbersOfAfricanCuisine().getText();
        String[] strings = numbersString.split("");

        String numberFromArray = strings[1];
        searchPage.getNumbersOfAfricanCuisine().shouldHave(Condition.text(numberFromArray));

        searchPage.getAfricanCuisineChecked()
                .shouldHave(Condition.attribute("selected","true"));

        searchPage.getMerchandCards().getSize().toString().equals(5);
    }
}
