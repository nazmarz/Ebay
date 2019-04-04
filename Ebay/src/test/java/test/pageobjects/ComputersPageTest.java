package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.ComputersPage;
import page.objects.HomePage;

public class ComputersPageTest extends ComputersPage {

    HomePage objOfHomePage;
    ComputersPage objOfComputersPage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements (driver, HomePage.class);
        objOfComputersPage = PageFactory.initElements (driver, ComputersPage.class);
    }

    @Test
    public void selectComputerDrivesTest(){
        objOfHomePage.selectElectonics();
        objOfComputersPage.selectComputerDrives();
        Assert.assertTrue(objOfComputersPage.getHardDrives().isDisplayed());
    }

}
