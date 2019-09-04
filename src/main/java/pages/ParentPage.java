package pages;

import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.windows.WindowsDriver;


public class ParentPage {
    WebDriver webDriver;
    ActionsWithOurElements actionsWithOurElements;
    Logger logger = Logger.getLogger(getClass());


    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        actionsWithOurElements = new ActionsWithOurElements(webDriver);

    }
}
