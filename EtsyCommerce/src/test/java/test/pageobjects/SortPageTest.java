package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.ComputersPage;
import page.objects.HardDrivePage;
import page.objects.HomePage;
import page.objects.SortPage;

public class SortPageTest extends SortPage {
    HomePage objOfHomePage;
    ComputersPage objOfComputersPage;
    HardDrivePage objOfHardDrivePage;
    SortPage objOfSortPage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfComputersPage = PageFactory.initElements(driver, ComputersPage.class);
        objOfHardDrivePage = PageFactory.initElements(driver, HardDrivePage.class);
        objOfSortPage = PageFactory.initElements(driver, SortPage.class);
    }

    @Test
    public void selectComputerDrivesTest() {
        objOfHomePage.selectElectonics();
        objOfComputersPage.selectComputerDrives();
        objOfHardDrivePage.setFilter();
        objOfSortPage.sortByLowestPrice();
//        Assert.assertTrue(objOfHardDrivePage.getVerifyFilter().isDisplayed());
    }
}
