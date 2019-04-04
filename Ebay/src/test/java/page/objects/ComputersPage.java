package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends ApplicationPageBase {

    @FindBy(xpath = "//span[contains(text(),'Computer Drives')]")
    private WebElement computerDrives;

    @FindBy(linkText = "Hard Drives (HDD, SSD & NAS)")
    private WebElement hardDrives;

    @FindBy(xpath = "//span[text()='Hard Drives (HDD, SSD & NAS)']")
    private WebElement verifyHardDrivesPage;

    public void selectComputerDrives(){
        click(computerDrives,"computerDrives");
        click(hardDrives,"hardDrives");
    }

    public WebElement getHardDrives(){
        return verifyHardDrivesPage;
    }
}
