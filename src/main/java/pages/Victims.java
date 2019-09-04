package pages;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Victims extends ParentPage {

    @FindBy (id = "control_249")
    private WebElement victArea;

    @FindBy (id = "control_298")
    private WebElement deadArea;

    @FindBy (id = "control_328")
    private WebElement countryOfSitBut;

    @FindBy (id = "input_20")
    private String countryArea;

    @FindBy (id = "image_22")
    private WebElement openTab;

    @FindBy (id = "input_20")
    private WebElement nameOfCounry;

    @FindBy (xpath =  ".//*[@title='Вибрати виділений запис']")
    private WebElement chooseAddMark;

    @FindBy (id = "control_10")
    private WebElement sum;

    @FindBy (id = "control_15")
    private WebElement save;

    @FindBy (id = "control_342")
    private WebElement officPos;

    @FindBy (id = "image_25")
    private String positBut;

    @FindBy (id = "input_23")
    private WebElement positArea;

    @FindBy (id = "control_11")
    private WebElement all;

    @FindBy (id ="control_13")
    private WebElement ofThemDied;

    @FindBy (id = "control_18")
    private WebElement saveBut;

    @FindBy (id = "control_355")
    private String wind;

    @FindBy (id = "filter1_column1_14")
    private WebElement codeOfCounry;

    @FindBy (id = "th_column1_14")
    private String windCod;

    @FindBy (id = "txtqty")
    private String sum1;

    @FindBy (id = "image_25")
    private WebElement butWork;

    @FindBy (id = "th_column1_14")
    private String codWork;

    @FindBy (id = "filter1_column1_14")
    private WebElement fieldWork;

    @FindBy (id = "control_11")
    private String all1;

    public Victims(WebDriver webDriver) {
        super(webDriver);
    }


    public void enterNumbOfVict(String numberOfVict) {
        actionsWithOurElements.enterTextIntoElement(victArea, numberOfVict);
    }

    public void enterNumbDead(String numbDead) {
        actionsWithOurElements.enterTextIntoElement(deadArea, numbDead);
    }

    public void chooseCountryOfCitizenship(String country, String number) {
        actionsWithOurElements.clickOnElement(countryOfSitBut);
        actionsWithOurElements.windowSearch(countryArea);
        actionsWithOurElements.clickOnElement(openTab);
        actionsWithOurElements.windowSearch(windCod);
        try {
            Thread.sleep(1000);
            actionsWithOurElements.enterTextIntoElement(codeOfCounry, country);
            webDriver.findElement(By.id("filter1_column1_14")).sendKeys(Keys.ENTER);
            actionsWithOurElements.clickOnElement(chooseAddMark);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        actionsWithOurElements.enterTextIntoElement(nameOfCounry, country);
//        actionsWithOurElements.downEnter();
        actionsWithOurElements.windowSearchThre(sum1);
        actionsWithOurElements.enterTextIntoElement(sum, number);
        actionsWithOurElements.clickOnElement(save);
    }

    public void officialPosition(String workSpace, String allVict, String victWhoDied) {
        actionsWithOurElements.windowSearchs(wind);
        actionsWithOurElements.clickOnElement(officPos);
        actionsWithOurElements.windowSearch(positBut);
        actionsWithOurElements.clickOnElement(butWork);
        actionsWithOurElements.windowSearch(codWork);
        try {
            Thread.sleep(1000);
            actionsWithOurElements.enterTextIntoElement(fieldWork, workSpace);
            webDriver.findElement(By.id("filter1_column1_14")).sendKeys(Keys.ENTER);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(chooseAddMark);
        actionsWithOurElements.windowSearchThre(all1);
//        try {
//            Thread.sleep(1000);
//            actionsWithOurElements.enterTextIntoElement(positArea, workSpace);
//            actionsWithOurElements.downEnter();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        actionsWithOurElements.enterTextIntoElement(all,allVict);
        actionsWithOurElements.enterTextIntoElement(ofThemDied, victWhoDied);
        actionsWithOurElements.clickOnElement(saveBut);
    }
}
