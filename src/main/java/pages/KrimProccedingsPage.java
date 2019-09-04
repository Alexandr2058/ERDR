package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Set;
//Page "kriminalni provagennya". i should do "reestr krim prov", "nereestrovany KP", "arhyv KP".

public class KrimProccedingsPage extends ParentPage{

    @FindBy (id = "a_23")
    private WebElement unregisteredOfenses;

    @FindBy (id = "a_21")
    private WebElement regKP;

    @FindBy (id = "a_21")
    private String regKPs;

    @FindBy (id = "a_23")
    private WebElement unregisteredOfensesS;

    @FindBy (id = "a_22")
    private WebElement listKP;

    public KrimProccedingsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void openNewRegKP() {

        actionsWithOurElements.chooseNewWindow(".//*[@id='a_21']");//opening a window to create a new criminal proceeding
    }

    @Step
    public void goToUnregisteredOffenses() {
        actionsWithOurElements.clickOnElement(unregisteredOfenses);
    }

    @Step
    public void chooseOffense(String locator, String status) {
        WebElement offenses = webDriver.findElement(By.id(locator));
        List<WebElement> columns = offenses.findElements(By.tagName("td"));
        for (WebElement cell : columns)
            if (cell.getText().equals(status)) {
        Actions actions = new Actions(webDriver);
        actions.doubleClick(cell).perform();
        break;
        }
        logger.info("Offense was choosed");
    }

    @Step
    public void openNewRegKPD() {
        try {
            Thread.sleep(1000);
            webDriver.findElement(By.id("a_21"));
            System.out.println("нашел регистрация кп");
//            actionsWithOurElements.dOM(regKPs);
            actionsWithOurElements.clickOnElement(regKP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openUnregKP() {
        try {
            Thread.sleep(1000);
            actionsWithOurElements.clickOnElement(unregisteredOfensesS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void goToRegisterCriminalProceedings() {
        actionsWithOurElements.clickOnElement(listKP);
    }
}

