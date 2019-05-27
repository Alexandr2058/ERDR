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
        krimOffensePage.qualificationCrime();
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();



//        checkExpectedResult("Avatar is not present", loginPage.isAvatarPresent());

    }// crime-2001, the applicant is an individual, status - project
}
