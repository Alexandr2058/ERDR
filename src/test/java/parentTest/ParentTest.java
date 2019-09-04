package parentTest;

import io.appium.java_client.windows.WindowsDriver;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import pages.*;

import java.io.File;
import java.net.URL;
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
    protected LoginECP loginECP;
    protected CardCriminalProceedings cardCriminalProceedings;
    protected RegisterCriminalProceedings registerCriminalProceedings;


    @FindBy (id = "control_17")
    private String download;

    @Before
    public void setUp() {

        File file = new File("./src/drivers/geckodriver.exe");//chromedriver.exe
        System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());//chrome.driver

        WindowsDriver ECPSession = null;
//        WindowsDriver ECPSession1 = null;
        WebElement PSDAPP = null;
        WindowsDriver Sesion = null;
        WindowsDriver Sesion1 = null;
        String PSDAPPTopLevelWindowHandle = null;

         webDriver = new FirefoxDriver();//ChromeDriver()

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            webDriver.get("https://erdr.gp.gov.ua/erdr/erdr.web.system.LoginPage.cls?AutoLogout=1");
            logger.info("Login page was opened");
            webDriver.findElement(By.id("control_28")).click();
            System.out.println("");
//TODO            Здесь непонятная магия с запуском ецп, прекондишин: запущен виндапдрайвер и ецп. В 78 строке менять value  согласно инспектору (ручками)

            try {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("app", "Root");
                ECPSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
                ECPSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

                PSDAPP = ECPSession.findElementByName("Personal DS service");
                PSDAPPTopLevelWindowHandle = PSDAPP.getAttribute("NativeWindowHandle");
                String myString = PSDAPPTopLevelWindowHandle;
                int foo = Integer.parseInt(myString);
//
                DesiredCapabilities appCapab = new DesiredCapabilities();
                appCapab.setCapability("appTopLevelWindow",  "0x609D6" );
//            System.out.println(appCapab);
                Sesion = new WindowsDriver(new URL("http://127.0.0.1:4723") , appCapab);
                System.out.println(Sesion);
                Sesion.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            }catch(Exception e){
                e.printStackTrace();
            } finally {
            }

            Sesion.findElementByName("English").click();
            Sesion.findElementByName("English").sendKeys(Keys.CONTROL+"a", Keys.DELETE );
            Sesion.findElementByName("English").sendKeys(Keys.TAB, "C:\\Users\\achepik\\Desktop\\Keys\\Keys 2019\\GPU\\slid_GPU.pfx");
            Sesion.findElementByName("English").sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "12345678");
            Sesion.findElementByName("Ok").click();
            Sesion.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }catch (Exception e) {
            logger.error("Can not  open Login Page " + e);
            Assert.fail("Can not  open Login Page " + e);
        }
//TODO          Конец непонятной магии с ЕЦП

            webDriver.findElement(By.id("control_17")).click();
//            try {
//                DesiredCapabilities capabilities = new DesiredCapabilities();
//                capabilities.setCapability("app", "Root");
//                ECPSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
//                ECPSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//
//                PSDAPP = ECPSession.findElementByName("Personal DS service");
//                PSDAPPTopLevelWindowHandle = PSDAPP.getAttribute("NativeWindowHandle");
//                String myString = PSDAPPTopLevelWindowHandle;
//                int foo = Integer.parseInt(myString);
////
//                DesiredCapabilities appCapab = new DesiredCapabilities();
//                appCapab.setCapability("appTopLevelWindow",  "0xA90750" );//нужно разобраться с методом коорій подставляет текущий номер и тогда пойдет
////            System.out.println(appCapab);
//                Sesion1 = new WindowsDriver(new URL("http://127.0.0.1:4723") , appCapab);
//                System.out.println(Sesion1);
//                Sesion1.findElementByName("Ok").click();
//                Sesion1.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//            }catch(Exception e){
//                e.printStackTrace();
//            } finally {
//            }


        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(By.id("control_24")).click();


//            webDriver.findElement(By.id("control_28")).click();
//            try {
//                Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\openMazilla.exe");//for chrome open1.exe
//                logger.info("AutoIT Script Started");
//            }catch (Exception e) {
//                logger.error("AutoIt Unvalid");
////                e.printStackTrace();
//            }




        loginPage = new LoginPage(webDriver);
        templatePage = new TemplatePage(webDriver);
        krimProccedingsPage = new KrimProccedingsPage(webDriver);
        krimOffensePage = new KrimOffensePage(webDriver);
        actionsWithOurElements = new ActionsWithOurElements(webDriver);
        characteristicsOfCriminalOffense = new  CharacteristicsOfCriminalOffense(webDriver);
        unregisteredCriminalOffenses = new UnregisteredCriminalOffenses(webDriver);
        victims = new Victims(webDriver);
        loginECP = new LoginECP(webDriver);
        registerCriminalProceedings = new RegisterCriminalProceedings(webDriver);
        cardCriminalProceedings = new CardCriminalProceedings(webDriver);

    }

    @After
    public void tearDown () {
//        webDriver.quit();
//        try {
//            Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\close.exe");
//           logger.info ("AutoIT Script close");
//        }catch (Exception e) {
//            logger.error("AutoIt Unvalid");
////                e.printStackTrace();
//        }
    }

    @Step
    protected void checkExpectedResult (String message, boolean actualResult) {
        Assert.assertEquals(message, actualResult, true);
    }

    @Rule
    public TestWatcher watchman = new TestWatcher() {
//        String fileName;
//        @Override
//        protected void failed(Throwable e, Description description) {
//            screenshot();
//        }

        @Attachment(value = "Page screenshot", type = "image/png")
        public byte[] saveScreenshot(byte[] screenShot) {
            return screenShot;
        }
        public void screenshot() {
            if (webDriver == null) {
                logger.info("Driver for screenshot not found");
                return;
            }
            saveScreenshot(((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES));
        }
        @Override
        protected void finished(Description description) {
            logger.info(String.format("Finished test: %s::%s", description.getClassName(), description.getMethodName()));
            try {
                webDriver.quit();
//                try {
//            Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\close.exe");
//           logger.info ("AutoIT Script close");
//        }catch (Exception e) {
//            logger.error("AutoIt Unvalid");
////                e.printStackTrace();
//        }
            } catch (Exception e) {
                logger.error(e);
            }
        }
    };
}
