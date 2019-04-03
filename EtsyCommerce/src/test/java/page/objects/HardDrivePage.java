package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HardDrivePage extends ApplicationPageBase {
    @FindBy(xpath = "//span[text()='USB 3.0']")
    private WebElement usb;

    @FindBy(xpath = "//span[text()='1TB']")
    private WebElement tb;

    @FindBy(xpath = "//span[contains(text(),'USB 3.0 Interface 1TB')]")
    private WebElement verifyFilter;

    public void setFilter(){
        click(usb,"USB 3.0");
        click(tb,"1TB");
    }

    public WebElement getVerifyFilter(){
        return verifyFilter;
    }
}
