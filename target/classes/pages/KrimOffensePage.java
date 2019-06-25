package pages;

import libs.ActionsWithOurElements;
import libs.Utils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.io.OutputStream;

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

   @FindBy (xpath = ".//*[@id='image_377']")
    private WebElement qual;

   @FindBy (id = "item_1_375")
    private String q;

   @FindBy (id = "item_3_85")
    private WebElement osoba;

   @FindBy (id = "item_1_100")
    private WebElement envOffence;

   @FindBy (id = "image_377")
    private WebElement buttonQual;

   @FindBy (id = "btn_85")
    private WebElement button85;

   @FindBy (id = "zen17")
    private WebElement scroll;

   @FindBy (id = "zenlbl_69")
    private WebElement element;

   @FindBy (id = "zenlbl_100")
    private WebElement okno;

   @FindBy (id="btn_104")
    private WebElement tort;

   @FindBy (id="item_2_104")
    private WebElement chooseTort;

   @FindBy (id = "item_2_102")
    private WebElement offATO;

   @FindBy (id = "btn_2_16")
    private WebElement featurePP;

   @FindBy (id = "control_44")
    private WebElement dateOfReceiptField;

   @FindBy (xpath = ".//*[@id='tpHead_14']")
    private String qualificationOfaCrime;

   @FindBy (id = "filter1_column1_14")
    private WebElement numQual;

   @FindBy (xpath = ".//*[@title='Вибрати виділений запис']")
    private WebElement choose;

   @FindBy (xpath = ".//*[@id='image_377']")
    private WebElement buttonOfQual;

   @FindBy (id = "image_383")
    private WebElement buttonArea;

   @FindBy (id = "th_code_17")
    private String territoryOfOffense;

    @FindBy (id = "group_382")
    private String window;

    @FindBy (xpath = "/html/body/div[4]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div/table/tbody[2]/tr[9]/td[3]/a/div")
    private WebElement city;

    @FindBy (xpath = "/html/body/div[4]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td/div/table/tbody[2]/tr[9]/td[5]/a/div")
    private WebElement district;

    @FindBy (id = "control_364")
    private WebElement saveProv;

    @FindBy (id = "itemSave")
    private String buttonS;

    @FindBy (id = "popup_ok")
    private WebElement Ok;

    @FindBy (id = "table")
    private String table;

    @FindBy (id = "popup_container")
    private String dialog;

    public KrimOffensePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectKRODRInDD () {
        try {
            Thread.sleep(1000);
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
        logger.info("number of a statement was added");
    }

    public void enterDate() {

        actionsWithOurElements.clickOnElement(dateOfReceipt);
        try {
            actionsWithOurElements.enterDate();
            logger.info("Date of receipt of the application was added");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }//Date of receipt of the application

    public void enterLastName() {
        try {
            Thread.sleep(1000);
            actionsWithOurElements.enterTextIntoElement(lastName, "иванов");
            logger.info("last name was added");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void enterName() {
        actionsWithOurElements.enterTextIntoElement(name, ActionsWithOurElements.getRandomName());
        logger.info("name was added");
    }

    public void patronymic() {
        actionsWithOurElements.enterTextIntoElement(patronymic, "иванович");
        logger.info("patronymic was added");
    }

    public void selectGender() {

        try {
            Thread.sleep(2000);
            webDriver.findElement(By.id("btn_63")).click();
            actionsWithOurElements.clickOnElement(gender);
            logger.info("gender was selected");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void selectDataOfBirth() {
        actionsWithOurElements.enterTextIntoElement(birthDay, "01.05.1980");
        logger.info("Data of birth was selected");

    }

    public void enterAdress() {
        actionsWithOurElements.enterTextIntoElement(adress, "Празька");
        logger.info("adress was added");
    }

    public void offense() {
        actionsWithOurElements.enterTextIntoElement(dataOffense, "01.05.2019 01:00:00");
        logger.info("offense was entered");
    }

    public void personWhoCriminal()  {

        actionsWithOurElements.scroll();

        try {
            Thread.sleep(3000);
            webDriver.findElement(By.id("btn_85")).click();
            logger.info("button was clicked");
            actionsWithOurElements.clickOnElement(osoba);
            logger.info("person was selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterStory() {
        actionsWithOurElements.enterTextIntoElement(story, "фабула " + Utils.getDateAndTime("HH:mm"));
        logger.info("story was entered");
    }

    public void qualificationCrime() {
        actionsWithOurElements.clickOnElement(buttonOfQual);
        actionsWithOurElements.windowSearch(qualificationOfaCrime);
        try {
            Thread.sleep(3000);
            actionsWithOurElements.enterTextIntoElement(numQual, "СТ.124");
            webDriver.findElement(By.id("filter1_column1_14")).sendKeys(Keys.ENTER);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(choose);
        actionsWithOurElements.windowSearch(window);
    }

    public void chooseArea() {
//        actionsWithOurElements.chooseNewWindow(window);
        actionsWithOurElements.clickOnElement(buttonArea);
        actionsWithOurElements.windowSearch(territoryOfOffense);
        actionsWithOurElements.clickOnElement(city);
        actionsWithOurElements.clickOnElement(district);
        logger.info("area was added");
        actionsWithOurElements.windowSearch(window);
    }

    public void environmentalOffenses() {

        try {
            Thread.sleep(5000);
            actionsWithOurElements.clickOnElement(okno);
            webDriver.findElement(By.xpath(".//*[@id='btn_100']")).click();
            actionsWithOurElements.clickOnElement(envOffence);
            logger.info("offenses was added");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void offenseATO() {
        try {
            webDriver.findElement(By.xpath(".//*[@id='btn_102']")).click();
            actionsWithOurElements.clickOnElement(offATO);
            logger.info("offence ATO was selected");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void tortureOfPersons() {
        try {
            actionsWithOurElements.clickOnElement(tort);
            actionsWithOurElements.clickOnElement(chooseTort);
            logger.info("type torture of person was selected");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void switchToTabFeaturePP() {
       try {
           Thread.sleep(1000);
           actionsWithOurElements.clickOnElement(featurePP);
           logger.info("tab was opened");
       }catch (Exception e) {
           e.printStackTrace();
       }
    }

    public void save() {



        actionsWithOurElements.clickOnElement(saveProv);
//        try {
//            Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\end.exe");//for chrome open1.exe
//            logger.info("AutoIT Script Started");
//        }catch (Exception e) {
//            logger.error("AutoIt Unvalid");
////                e.printStackTrace();
//        }

//        actionsWithOurElements.windowSearch(dialog);
        try {
//            Thread.sleep(1000);
            actionsWithOurElements.clickOnElement(Ok);
            logger.info("khftjfh");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        actionsWithOurElements.chooseNewWindow(table);
    }
}


