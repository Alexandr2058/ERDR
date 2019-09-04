package krimProvPage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentTest.ParentTest;

public class KrimProvPage extends ParentTest {

    @FindBy (id = "control_54")
    private String td;

    @FindBy (id = "control_367")
    private WebElement quit;
//
//    @FindBy (id = "group_1")
//    private String reg;

    @Test
    public void registrKrimProv() {
//        loginPage.openPage();//I use it in ParentTest(before), and we have method in loginPage.
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.124");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        krimOffensePage.save();
//        unregisteredCriminalOffenses.goToDom("group_25");
        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","Збережено"));

    }// crime-2001, the applicant is an individual, status - project

    @Test
    public void krimProvPoterMZag() {
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.115 Ч.2 П.1");
        krimOffensePage.pluralQualCrime();
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        characteristicsOfCriminalOffense.additionalQualificationMarkings("135");
        krimOffensePage.switchToTabVictim();
        victims.enterNumbOfVict("2");
        victims.enterNumbDead("3");
        victims.chooseCountryOfCitizenship("804","3");
        victims.officialPosition("018", "3", "3");
        krimOffensePage.save();
//        unregisteredCriminalOffenses.goToDom("group_25");

        checkExpectedResult("The dialog box is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Кількість потерпілих, які загинули не повинна перевищувати загальної кількості потерпілих"));
    }//number of victims less then number of victims who are dead

    @Test
    public  void krimProvPotBZag () {
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.115 Ч.2 П.1");
        krimOffensePage.pluralQualCrime();
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        characteristicsOfCriminalOffense.additionalQualificationMarkings("135");
        krimOffensePage.switchToTabVictim();
        victims.enterNumbOfVict("4");
        victims.enterNumbDead("3");
        victims.chooseCountryOfCitizenship("804", "4");
        victims.officialPosition("018", "4", "3");
        krimOffensePage.save();

        checkExpectedResult("The dialog box is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Збережено"));
    }//number of victims bigger then number of victims who are dead

    @Test
    public void krimProv1960 () {
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.crim1960();
        krimOffensePage.qualificationCrime("СТ.124");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        krimOffensePage.sendToReg();

        checkExpectedResult("Popup is present", actionsWithOurElements.compareWithDialogBox("popup_message","Правопорушення відправлено на реєстрацію"));
    }//qualification 1960, sending to registration

    @Test
    public void krimProv1960Mn () {
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.crim1960();
        krimOffensePage.qualificationCrime("СТ.93 п.");
        krimOffensePage.pluralQualCrime();
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        characteristicsOfCriminalOffense.additionalQualificationMarkings("137");
        krimOffensePage.sendToReg();

        checkExpectedResult("Popup is present", actionsWithOurElements.compareWithDialogBox("popup_message","Правопорушення відправлено на реєстрацію"));
    }//qualification 1960, qualification with multiple choice

    @Test
    public void krimProvMunRok () {
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.takeIntoAccount();
        krimOffensePage.numberOfCriminalCase();
        krimOffensePage.dateOfInitiationOfCriminalCase();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDatePast();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.124");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        krimOffensePage.saveWOk();
//        unregisteredCriminalOffenses.goToDom("group_25");
        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","Збережено"));
    }// criminal proceedings of past years

    @Test
    public void editingKrimProv () {
        templatePage.krimProvTab();
        krimProccedingsPage.goToUnregisteredOffenses();
        try {
            Thread.sleep(2000);
            krimProccedingsPage.chooseOffense("tpBody_38", "Проект");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        krimOffensePage.enterAdress("Печенежская");
//        krimOffensePage.save();

        checkExpectedResult("The offens was changed", actionsWithOurElements.compareChangedText("control_67", "Печенежская"));
    } // Editing an offense in a stage "Project"

// TODO переговорить с тарасом как делать чеки на каждое действие
// @Test
//    public void requiredFields () { }//check required fields

    @Test
    public  void detectedByService () {
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.124");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        krimOffensePage.detectByServ("15");
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        krimOffensePage.save();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","Кримінальне провадження розпочато за заявою/повідомленням фізичної/юридичної особи, що унеможливлює заповнення поля «Виявлено службою»"));
    } //заявник фізична особа, заповнити поле "Виявлено службою" будь-яким значенням

    @Test
    public void detByServlegal () {
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.selectLegPers();
        krimOffensePage.enterNameLegPers();
        krimOffensePage.enterCodeLP();
        krimOffensePage.enterLegAddress();
        krimOffensePage.actualAddress();
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.124");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        krimOffensePage.detectByServ("15");
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        krimOffensePage.sendToReg();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","Кримінальне провадження розпочато за заявою/повідомленням фізичної/юридичної особи, що унеможливлює заповнення поля «Виявлено службою»"));
    }//Заявник - юридична особа, заповнити поле "Виявлено службою" будь-яким значенням (відправка на реєстрацію)

    @Test
    public void anotherSource () {

        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.selectAnothSource();
        krimOffensePage.valueAnotherSource("6");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.124");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
//        krimOffensePage.detectByServ("15");
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        krimOffensePage.save();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","У разі обраного значення з кодом 6 у полі «Інше джерело», у полі «Виявлено службою» може бути обрано лише одне із наступних значень: 01, 02, 03, 05, 06, 40, 47, 91."));

    }// заявник Інше джерело - обране значення з кодом 6. Поле "Виявлено службою" - пусте

    @Test
    public void KPWithSpecialNotice () {

        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.takeIntoAccountID();//іноземних держжав
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.124");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.specialNotes("1");
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        krimOffensePage.save();
//        unregisteredCriminalOffenses.goToDom("group_25");
        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","Значення «1 -  рішення суду про повернення справи на додаткове розслідування» в полі «Особливі відмітки» може бути обране лише у разі значення «4 -  кримінальні правопорушення минулих років та у яких прийнято рішення», «5 - кримінальні правопорушення, які на день набрання чинності КПК 2012 р. перебувають у провадженні» або «2 – виділено» в полі «Врахувати»."));

    }//результат не пляшет

    @Test
    public void krimProv209KKU () {
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.209");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        characteristicsOfCriminalOffense.typeEconomicActivity();
        characteristicsOfCriminalOffense.specialNotes("2");
        krimOffensePage.save();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","Значення «2 - суспільно небезпечне протиправне діяння, що передувало легалізації (відмиванню) доходів» в полі «Особливі відмітки» можливо тільки у випадку наявності у провадженні правопорушення кваліфікованого за ст. 209 КК України 2001р."));

    }// кваліфікація правопорушення ст.209 ККУ 2001, в полі "Особливі відмітки" обрано значення з кодом  2

    @Test
    public void sendForReg () {
        templatePage.krimProvTab();
        krimProccedingsPage.goToUnregisteredOffenses();
        unregisteredCriminalOffenses.chooseKP();
        krimOffensePage.sendForRegistr();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Правопорушення відправлено на реєстрацію"));
    }//Відправлення правопорушення на реєстрацію

    @Test
    public void withdrawFromReg () {
        templatePage.krimProvTab();
        krimProccedingsPage.goToUnregisteredOffenses();
        try {
            Thread.sleep(2000);
            krimProccedingsPage.chooseOffense("tpBody_38","На реєстрації");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        krimOffensePage.withdrawFromReg();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Правопорушення відкликано з реєстрації"));

    }//Відкликати правопорушення з реєстрації

    WebDriver webDriver;

    @Test
    public void duplicateKrimProv () {
        templatePage.krimProvTab();
        krimProccedingsPage.openUnregKP();
//        actionsWithOurElements.chooseOffense("tpBody_38","Проект");
        try {
            Thread.sleep(2000);
            krimProccedingsPage.chooseOffense("tpBody_38","Проект");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        actionsWithOurElements.getNameDoup();

//        actionsWithOurElements.(reg);
        try {
//            Thread.sleep(5000);
            actionsWithOurElements.chooseNewWindow(td);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String  nameDouple =webDriver.findElement(By.id("control_54")).getAttribute("value");
        System.out.println(nameDouple);

        actionsWithOurElements.clickOnElement(quit);
//        krimProccedingsPage.openNewRegKP();
//        krimOffensePage.selectKRODRInDD();
//        krimOffensePage.selectKerOP();
//        krimOffensePage.enterNumStatement();
//        krimOffensePage.enterDate();
//        krimOffensePage.enterLastName();
//        krimOffensePage.enterNameDoup(nameDouple);
//        krimOffensePage.patronymic();
//        krimOffensePage.selectGender();
//        krimOffensePage.selectDataOfBirth();
//        krimOffensePage.enterAdress("Празька");
//        krimOffensePage.offense();
//        krimOffensePage.personWhoCriminal();
//        krimOffensePage.enterStory();
//        krimOffensePage.qualificationCrime("СТ.124");
//        krimOffensePage.chooseArea();
//        krimOffensePage.environmentalOffenses();
//        krimOffensePage.offenseATO();
//        krimOffensePage.tortureOfPersons();
//        krimOffensePage.switchToTabFeaturePP();
//        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
//        krimOffensePage.saveD();
//
////        templatePage.krimProvTab();
//
////        krimProccedingsPage.openNewRegKPD();
////        krimOffensePage.selectKRODRInDD();
////        krimOffensePage.selectKerOP();
////        krimOffensePage.enterNumStatement();
////        krimOffensePage.enterDate();
////        krimOffensePage.enterLastName();
////        krimOffensePage.enterNameDoup();
////        krimOffensePage.patronymic();
////        krimOffensePage.selectGender();
////        krimOffensePage.selectDataOfBirth();
////        krimOffensePage.enterAdress("Празька");
////        krimOffensePage.offense();
////        krimOffensePage.personWhoCriminal();
////        krimOffensePage.enterStory();
////        krimOffensePage.qualificationCrime("СТ.124");
////        krimOffensePage.chooseArea();
////        krimOffensePage.environmentalOffenses();
////        krimOffensePage.offenseATO();
////        krimOffensePage.tortureOfPersons();
////        krimOffensePage.switchToTabFeaturePP();
////        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
////        krimOffensePage.save();
//
//
////        unregisteredCriminalOffenses.goToDom("group_25");
//        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","Збережено"));
//
//
    }// гавно

    @Test
    public void douplKS1 () {
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        registerCriminalProceedings.chooseKP("tpBody_237", "У провадженні");
        cardCriminalProceedings.goToCriminalOffensesTab();
        cardCriminalProceedings.performDuplicateFunction();
        System.out.println("");

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Функція не доступна. Провадження містить лише одне правопорушення із статусом «У провадженні» та/або «Повернуто судом»"));
    }//функція Дублікат Для КС в якому 1 КП

    //TODO в кп 2 провадження потом разобраться
//    @Test
//    public void douplKS2Pr() {
//        templatePage.krimProvTab();
//        krimProccedingsPage.goToRegisterCriminalProceedings();
//        registerCriminalProceedings.chooseKPParams("tpBody_237", "У провадженні", "2");
//
//        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message", ""));
//    }//Дублікат Для КС в якому 2 КП (КП 1 = У провадженні; КП 2 = Повернуто судом) Функцію вконуємо для КП 1 до нього доданий правонарушник з основною карткою

    @Test
    public void filtrByNumber () {
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        registerCriminalProceedings.chooseNumbKP();
        registerCriminalProceedings.searchKP();


        checkExpectedResult("Avatar is present", actionsWithOurElements.compareResultFiltr());//нужно глянуть, терзают смутные сомнения
    }//!!!

}
