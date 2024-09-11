import org.apache.hc.core5.util.Asserts;
import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
//import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskTest extends BaseTest {
    MainPage mainPage;

    private final static String BASE_URL = "https://makarovartem.github.io/frontend-avito-tech-test-assignment/";
    //private final static String SERCH_20 = "20";
    //private final static String SERCH_50 = "50";
    //private final static String SERCH_100 = "100";

    @BeforeEach
    public void beforeEach() {
        mainPage = new MainPage(BASE_URL);
    }

    //проверка перехода по страницам с помощью пагинации(нажатие на цифру)
    @Test
    public void checkNextItem() {
        String title = mainPage.clickOnListTwo();
        Assertions.assertTrue(title.contains("2"));
    }

    //проверка перехода по страницам с помощью пагинации(нажатие на стрелку +1 и -1)
    @Test
    public void checkButtonRightAndLeft() {
        String title = mainPage.clickButtonRightAndLeft();
        Assertions.assertTrue(title.contains("1"));
    }

    //проверка открытия новой страницы (переход на 4 пункт-> открывается доступ к 5)
    @Test
    public void checkingOpeningANewPoint() {
        String title = mainPage.clickOnListFour();
        Assertions.assertTrue(title.contains("5"));
    }

    //проверка кнопки скролла вправо на пагинации
    @Test
    public void checkSwapButtonsRight() {
        String title = mainPage.clickButtonSwapRight();
        Assertions.assertTrue(title.contains("5"));
    }

    //проверка кнопки скролла влево на пагинации
    @Test
    public void checkSwapButtonsLeft() {
        String title = mainPage.clickButtonSwapLeft();
        Assertions.assertTrue(title.contains("1"));
    }

    //проверка граничащего значения пагинации
    @Test
    public void checkBorderPagination() {
        String title = mainPage.clickOnListFourty();
        Assertions.assertTrue(title.contains("40"));
    }


    //проверка увелечения бордов игр на странице(20/page)
    @Test
    public void checkPage_20() {
        String title = mainPage.clickOnButtonQuantityOutput_20();
        Assertions.assertTrue(title.contains("20"));

    }

    //проверка увелечения бордов игр на странице(50/page)
    @Test
    public void checkPage_50() {
        String title = mainPage.clickOnButtonQuantityOutput_50();
        Assertions.assertTrue(title.contains("8"));

    }

    //проверка увелечения бордов игр на странице(100/page)
    @Test
    public void checkPage_100() {
        String title = mainPage.clickOnButtonQuantityOutput_100();
        Assertions.assertTrue(title.contains("4"));

    }

    /*
    @Test
    public void checkFilterCategory() {
        mainPage.clickOnButtonCategory();
        int x =0;
    }
     */


    //проверка возврата на главную страницу с помощью кнопки Back to main
    @Test
    public void CheckingLoginToGameAndBack() {
        String title = mainPage.clickOnGameAndBack();
        Assertions.assertTrue(title.contains("1"));
    }

}
