package Tests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

import org.openqa.selenium.OutputType;
import org.testng.annotations.*;
import pages.*;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.Properties;
import static com.codeborne.selenide.Selenide.open;


public class BaseTest {

    protected   HomePage homePage = new HomePage ();
    protected DinamicTablePage dinamicTablePage = new DinamicTablePage();
    protected FramesPage framesPage = new FramesPage();
    protected TextInputPage textInputPage  = new TextInputPage();
    protected UploadPages uploadPages = new UploadPages();




    public static void takeScreenshot(){

        byte[] bytes = Selenide.screenshot(OutputType.BYTES);
        if(bytes!=null) {
            Allure.addAttachment("Screen", "imp/png", new ByteArrayInputStream(bytes), ".png");
        }else{
            System.out.println("Не удалось сделать скрин");
        }
    }


    @BeforeSuite
    public void setUp(){
        Configuration.browser = System.getProperty("browser","chrome");
        Configuration.headless = false;
        Configuration.downloadsFolder = "src/main/resources/downloadDirectory";
        Configuration.fastSetValue =false;
    }
    @BeforeClass
    public void prepare() {
        open(getFromProperties("homeUrl"));
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
    public String getFromProperties(String propertyKey) {
        try {

            Properties props = new Properties();
            FileInputStream  inputStream = new FileInputStream("src/main/resources/aplication.properties");
            props.load(inputStream);
            return props.getProperty(propertyKey);
        } catch (Exception e) {
            System.out.println("Не удалось загрузить файл");
        }
        return propertyKey;
    }


}