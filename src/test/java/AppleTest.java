import org.testng.Assert;
import org.testng.annotations.Test;

public class AppleTest extends BaseTest2 {

    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "iPhone 13";

    @Test

    public void checkHref(){

        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.search(SEARCH_STRING);
        SearchPages searchPages = new SearchPages();
        String href= searchPages.getHrefFrontFirstArticle();
        Assert.assertFalse(href.contains("5 причин поменять iPhone 13 на iPhone 15 и одна этого не делать"));
        int a = 0;

    }

}
