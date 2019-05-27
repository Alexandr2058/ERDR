package pages;

import libs.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//kriminalne pravoporushennya page

public class KrimOffensePage extends ParentPage {

    @FindBy (id = "control_42")
    private WebElement statement;

    @FindBy (id = "control_52")
    private WebElement lastName;

    @FindBy (id = "icon_44")
    private WebElement dateOfReceipt;

    @FindBy (id = "control_54")
    private WebElement name;

    @FindBy (id = "control_56")
    private WebElement patronymic;

    @FindBy (id = "item_0_63")
    private WebElement gender;

    @FindBy (id = "icon_65")
    private WebElement calendar;

   @FindBy (id = "control_65")
    private WebElement birthDay;

   @FindBy (id = "control_67")
    private WebElement adress;

   @FindBy (id = "control_83")
    private WebElement dataOffense;

   @FindBy (id = "control_87")
    private WebElement story;

   @FindBy (id = "image_377")
    private WebElement qualCrime;

   @FindBy (id = "comboboxInputTimer")
    private WebElement qual;

   @FindBy (id = "item_1_375")
    private String q;

   @FindBy (id = "item_3_85")
    private String osoba;

   @FindBy (id = "input_381")
    private WebElement area;

   @FindBy (id = "item_1_100")
    private String envOffence;

    public KrimOffensePage(WebDriver webDriver) {
        super(webDriver);
    }
    public void selectKRODRInDD () {


        try {
            actionsWithOurElements.selectDataInDD(".//*[@id='btn_27']");
            actionsWithOurElements.selectDataInDD(".//*[@id='chbox_0_27']");
            logger.info("kerODR was selected");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selectKerOP() {

        try {
            webDriver.findElement(By.id("zenlbl_22")).click();
            actionsWithOurElements.selectDataInDD(".//*[@id='btn_29']");
            actionsWithOurElements.selectDataInDD(".//*[@id='chbox_0_29']");
            logger.info("kerOP was selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterNumStatement() {
        actionsWithOurElements.enterTextIntoElement(statement, "1" + Utils.getDateAndTime("HH:mm:ss"));
    }

    public void enterDate() {
        actionsWithOurElements.clickOnElement(dateOfReceipt);
        actionsWithOurElements.enterDate();
    }//Date of receipt of the application

    public void enterLastName() {
//        actionsWithOurElements.chooseNewWindow(locatorname);
        actionsWithOurElements.enterTextIntoElement(lastName, "иванов");
    }

    public void enterName() {
        actionsWithOurElements.enterTextIntoElement(name, "иван");
    }

    public void patronymic() {
        actionsWithOurElements.enterTextIntoElement(patronymic, "иванович");
    }

    public void selectGender() {
        try {
            webDriver.findElement(By.id("btn_63")).click();
            actionsWithOurElements.clickOnElement(gender);
            logger.info("gender was selected");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void selectDataOfBirth() {
        actionsWithOurElements.enterTextIntoElement(birthDay, "01.05.1980");

    }

    public void enterAdress() {
        actionsWithOurElements.enterTextIntoElement(adress, "Празька");
    }

    public void offense() {
        actionsWithOurElements.enterTextIntoElement(dataOffense, "01.05.2019 01:00:00");
    }

    public void personWhoCriminal() {

        try {
            webDriver.findElement(By.id("btn_85")).click();
            actionsWithOurElements.chooseNewWindow(osoba);
            logger.info("person was selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterStory() {
        actionsWithOurElements.enterTextIntoElement(story, "фабула " + Utils.getDateAndTime("HH:mm"));
    }

    public void qualificationCrime() {

         actionsWithOurElements.enterTextIntoElement(qual, "СТ.368-2 Ч.1");
         logger.info("qualification was enter");
    }

    public void chooseArea() {
        actionsWithOurElements.enterTextIntoElement(area, "Солом'янський район, м. Київ");

    }

    public void environmentalOffenses() {

        webDriver.findElement(By.xpath(".//*[@id='btn_100']")).click();

        try {
            actionsWithOurElements.chooseNewWindow(envOffence);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void offenseATO() {
        webDriver.findElement(By.xpath(".//*[@id='btn_102']")).click();
    }
}


