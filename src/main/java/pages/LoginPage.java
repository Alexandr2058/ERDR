package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage{

    public LoginPage(WebDriver webDriver) {super(webDriver);}

    @FindBy(xpath = ".//*[@id='btn_1_21']")
    private WebElement avatar;

    public  void  openPage() {
        try {
            webDriver.get("https://erdr.gp.gov.ua/erdr/erdr.web.system.LoginPage.cls?AutoLogout=1");
            logger.info("Login page was opened");
            try {
                Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\open1.exe");
                logger.info("AutoIT Script Started");
            }catch (Exception e) {
                logger.error("AutoIt Unvalid");
//                e.printStackTrace();
            }
        }catch (Exception e) {
            logger.error("Can not  open Login Page " + e);
            Assert.fail("Can not  open Login Page " + e);
        }
    }

    public boolean isAvatarPresent() {
       return actionsWithOurElements.isElementPresent(avatar);
    }
}
