package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CharacteristicsOfCriminalOffense extends ParentPage{

    @FindBy (id = "image_401")
    private WebElement place;

    @FindBy (id = "th_column2_14")
    private String area;

    @FindBy (id = "filter1_column2_14")
    private WebElement areaName;

    @FindBy (xpath = ".//*[@class='tpAction']")
    private WebElement chooseArea;

    @FindBy (id = "spacer_358")
    private String windowPlace;

    @FindBy (id = "input_399")
    private WebElement city;

    @FindBy (id = "filter1_code_14")
    private WebElement code;

    @FindBy (id = "control_224")
    private WebElement butMark;

    @FindBy (id = "th_code_14")
    private String windowMark;

    @FindBy (xpath = ".//*[@title='Вибрати виділений запис']")
    private WebElement chooseAddMark;

    @FindBy (id = "zen107")
    private String windowH;

    @FindBy (id = "control_236")
    private WebElement buttonSN;

    @FindBy (id = "control_364")
    private String butSave;

    @FindBy (id = "image_407")
    private WebElement buttonEA;

    @FindBy (id = "filter1_name_12")
    private String areaNameA;

    @FindBy (xpath = "/html/body/div[4]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div/table/tbody[2]/tr[1]/td[3]/a/div")
    private WebElement activName;

    @FindBy (xpath = "/html/body/div[4]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div/table/tbody[2]/tr[1]/td[3]/a/div")
    private WebElement activName2;

    @FindBy (xpath = "/html/body/div[4]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div/table/tbody[2]/tr[1]/td[3]/a/div")
    private WebElement activName3;

    @FindBy (xpath = "/html/body/div[4]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div/table/tbody[2]/tr[1]/td[5]/a/div")
    private WebElement activName4;

    public CharacteristicsOfCriminalOffense(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void placeOfCommissionPfOffense() {

        try {
            actionsWithOurElements.enterTextIntoElement(city, "05 місто");
            Thread.sleep(1000);
            webDriver.findElement(By.id("input_399")).sendKeys(Keys.DOWN, Keys.ENTER);
            logger.info("Місце вчинення правоорушення внесено");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void additionalQualificationMarkings(String article) {
        actionsWithOurElements.clickOnElement(butMark);
        actionsWithOurElements.windowSearch(windowMark);
        try {
            Thread.sleep(3000);
            actionsWithOurElements.enterTextIntoElement(code, article);
            webDriver.findElement(By.id("filter1_code_14")).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(chooseAddMark);
        actionsWithOurElements.windowSearchs(windowH);
    }

    @Step
    public void specialNotes(String codeSN) {
        actionsWithOurElements.clickOnElement(buttonSN);
        actionsWithOurElements.windowSearch(windowMark);
        try {
            Thread.sleep(3000);
            actionsWithOurElements.enterTextIntoElement(code, codeSN);
            webDriver.findElement(By.id("filter1_code_14")).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(chooseAddMark);
        actionsWithOurElements.windowSearchs(butSave);
    }

    @Step
    public void typeEconomicActivity() {
        actionsWithOurElements.clickOnElement(buttonEA);
        actionsWithOurElements.windowSearchThre(areaNameA);
        actionsWithOurElements.clickOnElement(activName);
        actionsWithOurElements.clickOnElement(activName2);
        actionsWithOurElements.clickOnElement(activName3);
        actionsWithOurElements.clickOnElement(activName4);
        actionsWithOurElements.windowSearchs(butSave);
    }
}
