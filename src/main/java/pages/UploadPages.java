package pages;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class UploadPages extends BasePage {

    private SelenideElement input = $x ("//input[@type='file']");
    ElementsCollection uploadFile = $$x("//div[@class='file-info']/p");

    public void uploadByClass(){
        WebDriver driver = WebDriverRunner.getWebDriver();
        Selenide.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Student\\IdeaProjects\\TestEMAutomatisation\\src\\main\\resources\\toUpload\\upload.txt");


    }
    public void uploadSelenide(){



        File fileToUpload = new File("src/main/resources/toUpload/upload.txt");
        Selenide.switchTo().frame(0);
        input.uploadFile(fileToUpload);
        Selenide.switchTo().defaultContent();

    }

    public boolean isFileUppload(List<String> fileName) {
        Selenide.switchTo().frame(0);
        if (uploadFile.isEmpty()){
            return false;

        }else {
            List<String> actualName = new ArrayList<>();
            uploadFile.forEach(file->actualName.add(file.getText()));

            Selenide.switchTo().defaultContent();
            return fileName.containsAll(actualName);

        }
    }

}