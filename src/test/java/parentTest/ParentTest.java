package parentTest;

import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    protected LoginPage loginPage;
    protected TemplatePage templatePage;
    protected KrimProccedingsPage krimProccedingsPage;
    protected KrimOffensePage krimOffensePage;
    protected ActionsWithOurElements actionsWithOurElements;
    protected CharacteristicsOfCriminalOffense characteristicsOfCriminalOffense;
    protected UnregisteredCriminalOffenses unregisteredCriminalOffenses;
    protected Victims victims;

    @Before
    public void setUp() {

        File file = new File("./src/drivers/geckodriver.exe");//chromedriver.exe
        System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());//chrome.driver

         webDriver = new FirefoxDriver();//ChromeDriver()

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            webDriver.get("https://erdr.gp.gov.ua/erdr/erdr.web.system.LoginPage.cls?AutoLogout=1");
            logger.info("Login page was opened");
            try {
                Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\openMazilla.exe");//for chrome open1.exe
                logger.info("AutoIT Script Started");
            }catch (Exception e) {
                logger.error("AutoIt Unvalid");
//                e.printStackTrace();
            }
        }catch (Exception e) {
            logger.error("Can not  open Login Page " + e);
            Assert.fail("Can not  open Login Page " + e);
        }


        loginPage = new LoginPage(webDriver);
        templatePage = new TemplatePage(webDriver);
        krimProccedingsPage = new KrimProccedingsPage(webDriver);
        krimOffensePage = new KrimOffensePage(webDriver);
        actionsWithOurElements = new ActionsWithOurElements(webDriver);
        characteristicsOfCriminalOffense = new  CharacteristicsOfCriminalOffense(webDriver);
        unregisteredCriminalOffenses = new UnregisteredCriminalOffenses(webDriver);
        victims = new Victims(webDriver);
    }

    @After
    public void tearDown () {
        webDriver.quit();
        try {
            Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\close.exe");
           logger.info ("AutoIT Script close");
        }catch (Exception e) {
            logger.error("AutoIt Unvalid");
//                e.printStackTrace();
        }
    }

    protected void checkExpectedResult (String message, boolean actualResult) {
        Assert.assertEquals(message, actualResult, true);
    }
}
