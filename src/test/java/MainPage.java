import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import net.bytebuddy.description.type.TypeList;
import net.bytebuddy.matcher.FilterableList;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

/**
 * Главная страница сайта
 */
public class MainPage {


    private final SelenideElement buttonFilterCategory = $x("//input[@id='rc_select_1']");
    private final SelenideElement buttonFilterMMORPG = $x("//input[@aria-activedescendant='rc_select_1_list_1']");
    private final SelenideElement buttonFilterShooter = $x("//div[@title='shooter']");
    private final SelenideElement buttonFilterStategy = $x("//div[@title='stategy']");
    private final SelenideElement buttonFilterMoba = $x("//div[@title='moba']");
    private final SelenideElement buttonFilterRacing = $x("//div[@title='racing']");
    private final SelenideElement buttonFilterSports = $x("//div[@title='sports']");
    private final SelenideElement buttonFilterSocial = $x("//div[@title='social']");

    private final SelenideElement buttonBack = $x("//button[@class='ant-btn css-17a39f8 ant-btn-primary ant-btn-lg']");


    private final SelenideElement textBoxInput_10 = $x("//span[@title='10 / page']");
    private final SelenideElement textBoxInput_20 = $x("//div[@title='20 / page']");
    private final SelenideElement textBoxInput_50 = $x("//div[@title='50 / page']");
    private final SelenideElement textBoxInput_100 = $x("//div[@title='100 / page']");
    private final SelenideElement rollButtonRight = $x("//span[@class='anticon anticon-right']");
    private final SelenideElement rollButtonLeft = $x("//span[@class='anticon anticon-left']");

    private final SelenideElement listButton_2 = $x("//li[@title='2']");
    private final SelenideElement listButton_4 = $x("//li[@title='4']");
    private final SelenideElement listButton_40 = $x("//li[@title='40']");
    private final SelenideElement buttonSwap = $x("//span[@class='ant-pagination-item-ellipsis']");
    private final ElementsCollection article_5 = $$x("//li[@title='5']");
    private final ElementsCollection article_2 = $$x("//li[@title='2']");
    private final ElementsCollection article_1 = $$x("//li[@title='1']");
    private final ElementsCollection article_40 = $$x("//li[@title='40']");
    private final ElementsCollection article_20 = $$x("//li[@title='20']");
    private final ElementsCollection article_50 = $$x("//li[@title='8']");
    private final ElementsCollection article_100 = $$x("//li[@title='4']");

    private final SelenideElement infoGame = $x("//div[@class='_container_vlg32_23']");


    public MainPage(String url) {
        Selenide.open(url);
    }

    public String clickOnListTwo() {
        listButton_2.click();
        return article_2.first().getAttribute("title");
    }

    public String clickButtonRightAndLeft() {
        rollButtonRight.click();
        rollButtonLeft.click();
        return article_1.first().getAttribute("title");

    }

    public String clickOnListFour() {
        listButton_4.click();
        return article_5.first().getAttribute("title");
    }

    public String clickButtonSwapRight() {
        buttonSwap.click();
        return article_5.first().getAttribute("title");
    }

    public String clickButtonSwapLeft() {
        buttonSwap.click();
        buttonSwap.click();
        return article_1.first().getAttribute("title");
    }

    public String clickOnListFourty() {
        listButton_40.click();
        return article_40.first().getAttribute("title");
    }

    public void clickOnButtonCategory() {
        buttonFilterCategory.sendKeys(Keys.ENTER);
        buttonFilterCategory.click();
        //webdriver().driver().getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        buttonFilterMMORPG.click();
        buttonFilterCategory.sendKeys(Keys.ENTER);
        buttonFilterCategory.click();
        buttonFilterShooter.click();
        buttonFilterCategory.sendKeys(Keys.ENTER);
        buttonFilterCategory.click();
        buttonFilterMoba.click();
        buttonFilterCategory.sendKeys(Keys.ENTER);
        buttonFilterCategory.click();
        buttonFilterStategy.click();
        buttonFilterCategory.sendKeys(Keys.ENTER);
        buttonFilterCategory.click();
        buttonFilterRacing.click();
        buttonFilterCategory.sendKeys(Keys.ENTER);
        buttonFilterCategory.click();
        buttonFilterSports.click();
        buttonFilterCategory.sendKeys(Keys.ENTER);
        buttonFilterCategory.click();
        buttonFilterSocial.click();
    }

    public String clickOnButtonQuantityOutput_20() {
        textBoxInput_10.click();
        textBoxInput_20.click();
        return article_20.first().getAttribute("title");
    }

    public String clickOnButtonQuantityOutput_50() {
        textBoxInput_10.click();
        textBoxInput_50.click();
        return article_50.first().getAttribute("title");
    }

    public String clickOnButtonQuantityOutput_100() {
        textBoxInput_10.click();
        textBoxInput_100.click();
        return article_100.first().getAttribute("title");
    }


    public String clickOnGameAndBack() {
        infoGame.click();
        buttonBack.click();
        return article_1.first().getAttribute("title");
    }
}
