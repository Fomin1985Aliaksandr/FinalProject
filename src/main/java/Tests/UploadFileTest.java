package Tests;

import Tests.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.List;

public class UploadFileTest extends BaseTest {


    @Test
    public void upploadTestByclassic(){
        homePage.getTestDirectory(HomePage.Links.UPLOAD);
        uploadPages.uploadByClass();
        System.out.println("Успех");
    }

    @Test
    public void upploadSelenide (){

        List<String> expexted = List.of("upload.txt");



        homePage.getTestDirectory(HomePage.Links.UPLOAD);
        uploadPages.uploadSelenide();



        System.out.println("Успех");

        Assert.assertTrue(uploadPages.isFileUppload(expexted));

    }


}