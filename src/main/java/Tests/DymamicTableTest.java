package Tests;

import Tests.BaseTest;
import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DymamicTableTest extends BaseTest {



    @Test
    public void tableTest (){

        homePage.getTestDirectory(HomePage.Links.DYNAMIC_TABLE);

        String expectedCpu = dinamicTablePage.getTableValue();
        String tableValue = dinamicTablePage.getTableValue();


        Assert.assertNotEquals(expectedCpu,tableValue);

    }


}