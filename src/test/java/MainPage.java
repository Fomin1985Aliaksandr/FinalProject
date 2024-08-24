import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {


    private final SelenideElement textBoxInput = $x("//input[@type='text']");

    public MainPage(String url){
        Selenide.open(url);

    }

    /**
     * Выполняется поиск на сайте и нажимается кнопка Entern
     * @param searchString
     */
    public void search(String searchString){
textBoxInput.setValue(searchString);
textBoxInput.sendKeys(Keys.ENTER);
    }


}
