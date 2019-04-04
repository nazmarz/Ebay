package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ApplicationPageBase {

    @FindBy(linkText = "Electronics")
    private WebElement electronics;

    @FindBy(linkText = "Computers, Tablets & More")
    private WebElement electronicsDropDown;

    @FindBy(xpath = "//span[contains(text(),'Computers, Tablets & More')]")
    private WebElement verifyComputersPage;

    public void selectElectonics(){
        moveToElementWithSubMenu(electronics,electronicsDropDown,"electronics","Computers, Tablets & More");
    }

    public WebElement getComputersPage(){
        return verifyComputersPage;
    }

}




















