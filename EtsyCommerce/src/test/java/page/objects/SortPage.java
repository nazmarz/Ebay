package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SortPage extends ApplicationPageBase {

    @FindBy(id = "w8-w0-w1_btn_label")
    private WebElement sort;

    @FindBy(xpath = "//span[text()='Price + Shipping: lowest first']")
    private WebElement sortByLowest;

    public void sortByLowestPrice(){

        Actions action = new Actions(driver);
        action.moveToElement(sort).moveToElement(sortByLowest).click().build().perform();

//        moveToElementWithSubMenu(sort,sortByLowest,"sort","sortByLowest");
//        click(sort,"sort");
//        click(sortByLowest,"sortByLowest");

    }
}
