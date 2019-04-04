package application.page.base;

import base.BrowserDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import reporting.TestLogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public  class ApplicationPageBase extends BrowserDriver {

        String pageUrl;

        public static boolean isEnableStatus(WebDriver driver, WebElement web) {
            boolean en = web.isEnabled();
            return en;
        }

        public static void sendKeys(WebElement webElement, String webElementName, String keys){
            webElement.clear();
            TestLogger.log("Sending " + keys + " to " + webElementName);
            webElement.sendKeys(keys);
            TestLogger.log("Keys Sent to " + webElementName);
        }

        public static String getText(WebElement webElement, String webElementName){
            TestLogger.log("Getting Text from " + webElementName);
            String actualText =  webElement.getText();
            TestLogger.log("Actual text: " + actualText);
            return actualText;
        }

        public static void click(WebElement webElement, String webElementName){
            TestLogger.log("Click " + webElementName );
            webElement.click();
            TestLogger.log("Clicked " + webElementName);
        }

        public static Properties loadProperties() throws IOException {
            Properties prop = new Properties();
            File filepath = new File(System.getProperty("user.dir") +  "/src/test/resources/secret.properties");
            InputStream ism = new FileInputStream(filepath.getAbsoluteFile());
            prop.load(ism);
            ism.close();
            return prop;
        }

        public static void moveToElement(WebElement webElement, String webElementName){
            TestLogger.log("Click " + webElementName );
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).click().build().perform();
            TestLogger.log("Clicked " + webElementName);
        }

        public static void moveToElementWithSubMenu(WebElement webElement, WebElement webElement2, String webElementName, String webElement2Name){
            TestLogger.log("Click on " + webElementName + ", then click on " + webElement2Name);
            Actions action = new Actions(driver);
            action.moveToElement(webElement).moveToElement(webElement2).click().build().perform();
            TestLogger.log("Clicked on " + webElementName + ", then clicked on " + webElement2Name);
        }

        public static void select (WebElement webElement, String webElementName, String value, String valueName ){
            TestLogger.log("Click " + webElementName);
            Select select = new Select(webElement);
            TestLogger.log(("Clicked " + webElementName));
            select.selectByValue(value);
            TestLogger.log("Selected " + valueName);
        }

        public static void waitToClick(WebElement webElement){
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(webElement));
        }

        public static void switchWindowHandle() {
            Set<String> handles = driver.getWindowHandles();
            String currentHandle = driver.getWindowHandle();
            for (String handle : handles) {
                if (!handle.equals(currentHandle)) {
                    driver.switchTo().window(handle);
                }
            }
        }

//        iframe is webElement@Find
//        driver.switchTo().frame(iframe);

}


