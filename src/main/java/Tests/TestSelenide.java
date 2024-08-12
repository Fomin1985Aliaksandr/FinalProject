package Tests;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenide {

    @Test
    public void testSelenide(){

        open("http://www.uitestingplayground.com/home");
    }
}