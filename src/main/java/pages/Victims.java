package pages;

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

    @FindBy (id = "filter1_column1_14")
    private String codeOfCounry;

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

    public Victims(WebDriver webDriver) {
        super(webDriver);
    }


    public void enterNumbOfVict(String numberOfVict) {
        actionsWithOurElements.enterTextIntoElement(victArea, numberOfVict);
    }

    public void enterNumbDead(String numbDead) {
        actionsWithOurElements.enterTextIntoElement(deadArea, numbDead);
    }

    public void chooseCountryOfCitizenship() {
        actionsWithOurElements.clickOnElement(countryOfSitBut);
        actionsWithOurElements.windowSearch(countryArea);
//        actionsWithOurElements.clickOnElement(openTab);
//        actionsWithOurElements.windowSearch(codeOfCounry);
        actionsWithOurElements.enterTextIntoElement(nameOfCounry, "Україна");
        actionsWithOurElements.downEnter();
//        actionsWithOurElements.windowSearchThre(countryArea);
        actionsWithOurElements.enterTextIntoElement(sum, "3");
        actionsWithOurElements.clickOnElement(save);
    }

    public void officialPosition() {
        actionsWithOurElements.windowSearchs(wind);
        actionsWithOurElements.clickOnElement(officPos);
        actionsWithOurElements.windowSearch(positBut);
        actionsWithOurElements.enterTextIntoElement(positArea, "018 учитель");
        actionsWithOurElements.downEnter();
        actionsWithOurElements.enterTextIntoElement(all,"3");
        actionsWithOurElements.enterTextIntoElement(ofThemDied, "3");
        actionsWithOurElements.clickOnElement(saveBut);
    }
}