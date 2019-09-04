package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardCriminalProceedings extends ParentPage {

    @FindBy (id = "btn_2_18")
    private WebElement tabCrimOff;

    @FindBy (id = "btn_1_18")
    private String basicInformation;

    @FindBy (id = "control_663")
    private WebElement doupleBut;

    public CardCriminalProceedings(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void goToCriminalOffensesTab() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(basicInformation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(tabCrimOff);
    }

    @Step
    public void performDuplicateFunction() {
        actionsWithOurElements.chooseOffense("tr_0_84", "У провадженні");
        try {
            Thread.sleep(1000);
            actionsWithOurElements.windowSearch(basicInformation);
            actionsWithOurElements.clickOnElement(doupleBut);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
