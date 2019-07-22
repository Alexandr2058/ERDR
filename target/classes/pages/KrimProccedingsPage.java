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
    public void chooseOffense(String status) {
//        WebElement offenses = webDriver.findElement(By.id("tpBody_38"));
//        List<WebElement> columns = offenses.findElements(By.tagName("td"));
//        for (WebElement cell : columns) {
//            if (cell.getText().equals(status)) {
//                System.out.println(cell);
//                cell.click();
//                System.out.println(cell);
//                Actions actions = new Actions(webDriver);
//                actions.doubleClick(cell).build();
//                actions.perform();
////                try {
////                    Thread.sleep(50);
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
//                if(cell.isDisplayed()){
//                    cell.click();
//                    try {
//                        Thread.sleep(150);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    cell.click();
//                System.out.println(cell);

//                break;
//            }
//        }
        Actions actions = new Actions(webDriver);
        WebElement elementLocator = webDriver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[3]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[2]"));
        actions.doubleClick(elementLocator).perform();
        if(elementLocator.isDisplayed()){
            elementLocator.click();
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            elementLocator.click();
        System.out.println(elementLocator);
    }
}}

