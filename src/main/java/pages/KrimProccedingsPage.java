package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;
//Page "kriminalni provagennya". i should do "reestr krim prov", "nereestrovany KP", "arhyv KP".

public class KrimProccedingsPage extends ParentPage{
    public KrimProccedingsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openNewRegKP() {

        actionsWithOurElements.chooseNewWindow(".//*[@id='a_21']");//opening a window to create a new criminal proceeding
    }
}

