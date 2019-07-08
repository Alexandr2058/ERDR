package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UnregisteredCriminalOffenses  extends ParentPage{

    @FindBy (id = "a_23")
    private String unregPage;

    public UnregisteredCriminalOffenses(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarPresent() {
//        webDriver.findElement(By.id("tr_0_38"));
        actionsWithOurElements.windowSearch(unregPage);
        return actionsWithOurElements.equalsTime();
    }
}
