import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract public class BaseTest2 {
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        Configuration.browser="chrome";
        Configuration.webdriverLogsEnabled=true;
        Configuration.browserSize = "1300x500";
        Configuration.headless = false;

    }

    @BeforeTest
    public void init(){
        setUp();
    }


    @AfterTest
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
