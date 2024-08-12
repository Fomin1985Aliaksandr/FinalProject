package pages;

import org.openqa.selenium.WebElement;

public class CustomInput {
    WebElement element;

    CustomInput(WebElement element){
        this.element=element;


    }

    public void sendKey(String text){
        element.clear();
        element.sendKeys(text);
    }

    public void click(){

        element.click();
    }
}