package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWithoutSelenide {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
//        System.setProperty("webdriver.chrom.driver", "src/main/java/resources/driver/chromedriver.exe");

        driver = new ChromeDriver();
        // driver.manage().window().setSize(new Dimension(100,100));
    }

    @Test(testName = "registration")
    public void openVmastabe() {

        driver.get("https://vmasshtabe.ru/");
        System.out.println("Этот E-mail уже используется другим пользователем");


        WebElement regButton = driver.findElement(By.xpath("//a[@class='link']"));
        regButton.findElement(By.xpath("//a[@class='link']")).click();   // Нажатие на кнопку регистрация и переход на страницу регистрации

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Aliaksandr_fomin@list.ru"); // Заполнение e-mail
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sweet1985dreams");      // Заполнение password
        driver.findElement(By.xpath("//input[@id='password2']")).sendKeys("Sweet1985dreams");    // Подтверждение password

        WebElement registrationButton = driver.findElement(By.xpath("//input[@value='Зарегистрироваться']"));
        registrationButton.findElement(By.xpath("//input[@value='Зарегистрироваться']")).click();  // Непосредственно нажатие на кнопку регистрация


    }


    @Test (testName = "Autorisation")
    public void autorisation (){
        driver.get("https://vmasshtabe.ru/");

        WebElement enter = driver.findElement(By.xpath("//ul[@class='user-menu']/li/a[@ href='https://vmasshtabe.ru/login']"));
        enter.findElement(By.xpath("//ul[@class='user-menu']/li/a[@ href='https://vmasshtabe.ru/login']")).click(); //Нажатие кнопки входа в личный кабинет

        driver.findElement(By.xpath("//input[@id='login' and @name='login']")).sendKeys("Aliaksandr_fomin@list.ru");//Заполнение логина
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sweet1985dreams");//Заполение password

        WebElement clickEnter = driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn_black']"));
        clickEnter.findElement(By.xpath("//input[@type='submit' and @class='btn btn_black']")).click(); // Нажатие кнопли войти



    }




    @AfterMethod
    public void tearDown(){
        // driver.quit();

    }


}


//$x("//input[@id='email']")
//$x("//input[@id='password']")
//$x("//input[@id='password2']")
//$x("//input[@value='Зарегистрироваться']")
//$x("//div[@class='ajax-form__notice false']")
//$x("//ul[@class='user-menu']/li/a[@ href='https://vmasshtabe.ru/login']")
//$x("//input[@id='login' and @name='login']")
//$x("//input[@id='password']")
//$x("//input[@type='submit' and @class='btn btn_black']")
//$x("//form[@class='search']")
//$x("//form[@class='search']/i