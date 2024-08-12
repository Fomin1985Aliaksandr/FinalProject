package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Text;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage {

    String linkedPattern = "//h3/a[text()='%s']";

    SelenideElement textInput = $x("//h3/a[text()='Text Input']");

    public void getTextInputPage() {textInput.click();
    }

    @Step ("переход по ссылке")
    public void getTestDirectory(Links targetLinks) {
        $x(String.format(linkedPattern, targetLinks.linkValue)).click();

    }




    public enum Links {


        TEXT_INPUT("Text Input"),
        DYNAMIC_TABLE("Dynamic Table"),
        UPLOAD ("File Upload");
        final String linkValue;

        Links(String s) {
            linkValue = s;

        }

    }


}