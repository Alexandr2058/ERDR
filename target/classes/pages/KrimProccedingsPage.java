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

        actionsWithOurElements.chooseNewWindow(".//*[@id='a_22']");
//        String parent = webDriver.getWindowHandle();
//        logger.info("Parent window is " + parent);
//        webDriver.findElement(By.xpath(".//*[@id='a_22']")).click();
//        Set<String> allWindows = webDriver.getWindowHandles();
//        int count = allWindows.size();
//        logger.info("Total window " + count);
//        for (String child:allWindows) {
//            if (!parent.equalsIgnoreCase(child)) {
//                webDriver.switchTo().window(child);
////                webDriver.findElement(By.id("btn_27")).click();btn_1_16
//            }
//        }

    }//opening a window to create a new criminal proceeding
}
