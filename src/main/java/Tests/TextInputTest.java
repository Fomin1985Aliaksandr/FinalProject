package Tests;

import Tests.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class TextInputTest extends BaseTest {

    @Test(description = "тестирование ввода")
    public void testInputText(){

        homePage.getTestDirectory(HomePage.Links.TEXT_INPUT);
        String startButtonValue = textInputPage.getTextFromButton();
takeScreenshot();
        String expectedText = textInputPage.setText("Hallo world");
        String actualText = textInputPage.getTextFromButton();


        Assert.assertEquals(actualText,"Hallo world");
        Assert.assertNotEquals(actualText,startButtonValue);
    }

}
// анотация: в TextInputPage повесить анотацию Step, TextInputTest расписать места
//где делаются скрины --takeScreenshot--

// 1 выполнить тест 2 перейти в консоль maven 3 выбрать mvn allure:serv