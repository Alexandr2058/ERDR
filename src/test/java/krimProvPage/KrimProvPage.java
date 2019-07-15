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
        unregisteredCriminalOffenses.goToDom("group_25");


        checkExpectedResult("Avatar is present", unregisteredCriminalOffenses.isAvatarPresent());

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
        victims.chooseCountryOfCitizenship();
        victims.officialPosition();
        krimOffensePage.save();
        unregisteredCriminalOffenses.goToDom("group_25");
    }
}
