package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DinamicTablePage extends BasePage {

    SelenideElement expectedValue = $x("//div[@class='container']/p[@class='bg-warning']");
    ElementsCollection headers    =  $$x("//span[@role='columnheader']");
    ElementsCollection rows  = $$x("span[@role='cell' and text()='Chrome']/following-sibling::span");

    public String getExpectedValue (){

        String expectedTense = expectedValue.getText();



        return expectedTense.substring(12);




    }

    private int getCpuIndex(){


        for (int i = 0;i<headers.size();i++) {
            if (headers.get(i).getText().equals("CPU")) {
                return i;}
        }

        return 0;


    }

    public String getTableValue (){
        return   rows.get(getCpuIndex()-1).getText ();
    }



}