package krimProvPage;

import org.junit.Test;
import parentTest.ParentTest;

public class KrimProvPage extends ParentTest {

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
        krimOffensePage.enterAdress();
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
        krimOffensePage.enterAdress();
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
        victims.chooseCountryOfCitizenship("Україна","3");
        victims.officialPosition("018 учитель", "3", "3");
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
        krimOffensePage.enterAdress();
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
        victims.chooseCountryOfCitizenship("Україна", "4");
        victims.officialPosition("018 учитель", "4", "3");
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
        krimOffensePage.enterAdress();
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
        krimOffensePage.enterAdress();
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
        krimOffensePage.enterAdress();
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
    }// criminal proceedings of past years

    @Test
    public void editingKrimProv () {
        templatePage.krimProvTab();
        krimProccedingsPage.goToUnregisteredOffenses();
        krimProccedingsPage.chooseOffense("Проект");
    } // Editing an offense in a stage "Project"
}
