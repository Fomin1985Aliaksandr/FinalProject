package Tests;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.Set;

public class FrameTest extends BaseTest {

    @Test
    public void frameTaste(){
        WebDriver driver = null;
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(getFromProperties("frameUrl"));
       String uiVisionHandel =  driver.getWindowHandle();
        Set<String> windowHendeles = driver.getWindowHandles();
             driver.switchTo().window((windowHendeles.toArray()[0].toString()));
        String playgroundHandel = driver.getWindowHandle();



        driver.switchTo().frame(0).findElement((By) framesPage.frame1Input).sendKeys("Это файл 1");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1).findElement((By) framesPage.frame2Input).sendKeys("Это файл 2");
        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));

       driver.findElement((By) framesPage.frame3Input).sendKeys("это файл 3");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(3).findElement((By) framesPage.frame4Input).sendKeys("Это файл 4");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(4).findElement((By) framesPage.frame5Input).sendKeys("Это файл5");




        System.out.println("Test");
    }

}