package test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.ComputersPage;
import page.objects.HardDrivePage;
import page.objects.HomePage;

public class HardDrivePageTest extends HardDrivePage {

    HomePage objOfHomePage;
    ComputersPage objOfComputersPage;
    HardDrivePage objOfHardDrivePage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfComputersPage = PageFactory.initElements(driver, ComputersPage.class);
        objOfHardDrivePage = PageFactory.initElements(driver, HardDrivePage.class);
    }

    @Test
    public void selectComputerDrivesTest() {
        objOfHomePage.selectElectonics();
        objOfComputersPage.selectComputerDrives();
        objOfHardDrivePage.setFilter();
        Assert.assertTrue(objOfHardDrivePage.getVerifyFilter().isDisplayed());
    }
}