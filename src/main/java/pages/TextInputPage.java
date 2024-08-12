package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$x;

public class TextInputPage extends BasePage {

    private final SelenideElement inputText = $x("//input[@id='newButtonName']");
    private final SelenideElement button = $x("//button[@id='updatingButton']");



    @Step ("изменение текста кнопки на {textToType}")
    public String setText(String textToType){
        inputText.sendKeys(textToType);
        button.click();
        return textToType;
    }

    @Step("Ввод символов в инпут")
    public String getTextFromButton(){
        return button.getText();

    }



}