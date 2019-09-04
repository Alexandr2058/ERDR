package kP;

import io.appium.java_client.windows.WindowsDriver;
import org.junit.Test;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

//import java.util.Set;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class kP {

    @FindBy(id = "input_27")
    private WebElement element;

    @FindBy(linkText = "Керівникодргпу Г.П.")
    private String value;

    @FindBy (id = "zenlbl_104")
    private WebElement element1;

    @Test
    public void addData() throws InterruptedException {

        WindowsDriver ECPSession = null;
//        WindowsDriver ECPSession1 = null;
        WebElement PSDAPP = null;
        WindowsDriver Sesion = null;
        String PSDAPPTopLevelWindowHandle = null;

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
//            DesiredCapabilities appCapabb = new DesiredCapabilities();
//            appCapabb.setCapability("Personal DS service", "NativeWindowHandle");
//            ECPSession1 = new WindowsDriver(new URL("http://127.0.0.1:4723"), appCapabb);
//            PSDAPP = ECPSession1.findElementByName("Personal DS service");
//            PSDAPPTopLevelWindowHandle = PSDAPP.getAttribute("NativeWindowHandle");//NativeWindowHandle
//            System.out.println(PSDAPPTopLevelWindowHandle);
//            int foo = Integer.parseInt(myString);
//            PSDAPPTopLevelWindowHandle = Integer.toString(Integer.parseInt());
//            System.out.println(foo);


            DesiredCapabilities appCapab = new DesiredCapabilities();
            appCapab.setCapability("appTopLevelWindow",  "0xB0700" );
//            System.out.println(appCapab);
            Sesion = new WindowsDriver(new URL("http://127.0.0.1:4723") , appCapab);
            System.out.println(Sesion);
            Sesion.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        }catch(Exception e){
            e.printStackTrace();
        } finally {
        }

        Sesion.findElementByName("English").click();
        Sesion.findElementByName("English").sendKeys(Keys.TAB, "C:\\Users\\achepik\\Desktop\\Keys\\Keys 2019\\GPU\\slid_GPU.pfx");
        Sesion.findElementByName("English").sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "12345678");
        Sesion.findElementByName("Ok").click();
    }
//        WebDriver webDriver = new FirefoxDriver();
//        WebDriverWait wait20, wait10;
//        wait20 = new WebDriverWait(webDriver, 100);
//        wait10 = new WebDriverWait(webDriver, 1000);

//        String parent = webDriver.getWindowHandle();
//        System.out.println("Parent window is " + parent);
//        webDriver.findElement(By.xpath(locator)).click();
//        Set<String> allWindows = webDriver.getWindowHandles();
//        int count = allWindows.size();
//        System.out.println("Total window " + count);
//        for (String child : allWindows) {
//            if (!parent.equalsIgnoreCase(child)) {
//                webDriver.switchTo().window(child);
////                webDriver.findElement(By.id("btn_27")).click();btn_1_16
//            }
//        }


//        File file = new File("./src/drivers/geckodriver.exe");
//        System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
//



//        DesiredCapabilities appCapabilities = new DesiredCapabilities();
//        appCapabilities.SetCapability("app", "Root");
//        var DesktopSession = new WindowsDriver<WindowsElement>(new Uri("http://127.0.0.1:4723"), appCapabilities);
//        var PSDAPP = DesktopSession.FindElementByName("Personal DS service");
//        var PSDAPPTopLevelWindowHandle = PSDAPP.GetAttribute("NativeWindowHandle");
//        PSDAPPTopLevelWindowHandle = (int.Parse(PSDAPPTopLevelWindowHandle)).ToString("x");
//
//        DesiredCapabilities appCapab = new DesiredCapabilities();
//        appCapab.SetCapability("appTopLevelWindow", PSDAPPTopLevelWindowHandle);
//        var PDSSession = new WindowsDriver<WindowsElement>(new Uri(WinAppDriverUrl), appCapab);



//        webDriver.manage().window().maximize();
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        webDriver.get("https://erdr.gp.gov.ua/erdr/erdr.web.system.LoginPage.cls?AutoLogout=1");
////        webDriver.findElement(By.xpath(".//*[@type='button']" )).click();
//
//        System.out.println("Site was opened");

//        try {
//            System.out.println("AutoIT Script Sttarted");
//            Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\openMazilla.exe");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        Thread.sleep(30000);
//        wait20.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='a_5']")));
//        Thread.sleep(1000);
//        webDriver.findElement(By.xpath(".//*[@id='a_5']")).click(); //button krim provadj
//        webDriver.findElement(By.xpath(".//*[@id='a_21']")).click();// registration pravoporushennya
//
//        String parent = webDriver.getWindowHandle();
//        System.out.println("Parent window is " + parent);
//        webDriver.findElement(By.xpath(".//*[@id='a_21']")).click();
//        Set<String> allWindows = webDriver.getWindowHandles();
//        int count = allWindows.size();
//        System.out.println("Total window " + count);
//        for (String child : allWindows) {
//            if (!parent.equalsIgnoreCase(child)) {
//                webDriver.switchTo().window(child);
////                ;btn_1_16
//            }
//        }

//        try {
//            Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\scroll.exe");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        Thread.sleep(3000);
//        webDriver.findElement(By.xpath(".//*[@id='image_377']")).click();
//        System.out.println("click on a button");



//        String parent2 = webDriver.getWindowHandle();
//        System.out.println("Parent window is " + parent2);
//        webDriver.findElement(By.xpath("//*[@id='zenLayoutTableCell_14']")).click();
//        Set<String> allWindows2 = webDriver.getWindowHandles();
//        int count2 = allWindows2.size();
//        System.out.println("Total window " + count2);
//        for (String child : allWindows) {
//            if (!parent.equalsIgnoreCase(child)) {
//                webDriver.switchTo().window(child);
//            }
//        }

//        Actions actions = new Actions(webDriver);
//        WebElement element = webDriver.findElement(By.xpath("//*[@id='zenLayoutTableCell_14']"));
//        actions.moveToElement(element).build().perform();



//        String currentWindow = webDriver.getWindowHandle();
//        for(String winHandle : webDriver.getWindowHandles()){
//            if(!winHandle.equals(currentWindow)){
//                webDriver.switchTo().window(winHandle);
//                System.out.println("current window " + currentWindow);
//                System.out.println("window " + winHandle);
//                try {
//                    webDriver.findElement(By.xpath(".//*[@id='tpHead_14']"));
//                    System.out.println("catch");
//                }catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }

//        webDriver.findElement(By.id("filter1_column1_14")).sendKeys("СТ.368-2 Ч.3");
//        webDriver.findElement(By.id("filter1_column1_14")).sendKeys(Keys.ENTER);
////        WebElement st = webDriver.findElement(By.xpath(".//*[text()='СТ.368-2 Ч.3']"));
////        new Actions(webDriver).doubleClick(st).build().perform();
//
//
//        webDriver.findElement(By.xpath(".//*[@title='Вибрати виділений запис']")).click();
//
//        String currentWindow1 = webDriver.getWindowHandle();
//        for(String winHandle : webDriver.getWindowHandles()){
//            if(!winHandle.equals(currentWindow1)){
//                webDriver.switchTo().window(winHandle);
//                System.out.println("current window " + currentWindow1);
//                System.out.println("window " + winHandle);
//                try {
//                    webDriver.findElement(By.xpath(".//*[@id='group_6']"));
//                    System.out.println("catch");
//                }catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//
//        webDriver.findElement(By.id("zenLayoutTableCell_383")).click();
//        webDriver.findElement(By.xpath(".//*[text()='СТ.368-2 Ч.3']")).click();

//        Thread.sleep(1000);
//        Actions action = new Actions(webDriver);
//        WebElement link = webDriver.findElement(By.xpath(".//*[text()='СТ.368-2 Ч.3']"));
//        action.doubleClick(link).perform();
//        Thread.sleep(3000);
//        action.moveToElement(webDriver.findElement(By.xpath(".//*[@id='selector_0_14']"))).doubleClick().build().perform();


//        WebElement st = webDriver.findElement(By.xpath(".//*[text()='СТ.368-2 Ч.3']"));
//        System.out.println("find it");
//        st.sendKeys(Keys.ENTER);

//        WebElement table = webDriver.findElement(By.xpath(".//*[@id='tbl']"));
//
//// Now get all the TR elements from the table
//        List<WebElement> allRows = table.findElements(By.tagName("tr"));
//// And iterate over them, getting the cells
//        for (WebElement row : allRows) {
//            List<WebElement> cells = row.findElements(By.tagName("td"));
//            for (WebElement cell : cells) {
//                System.out.println("content >>   " + cell.getText());
//            }
        }


//        ArrayList<String> myArrayList = new ArrayList<String>();
//        for (int i = 0; i < myArrayList.size(); i++)
//            System.out.println(myArrayList.get(i));

//            try {
//            Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\clickOn.exe");
//        }catch (IOException e) {
//            e.printStackTrace();
//        }

//        LocalDateTime currentTimeUtc = LocalDateTime.now(Clock.systemUTC()).minusMinutes(30);
//
//
//
//
//        webDriver.findElement(By.id("dtcomboCrimeClassification.ImageTlb")).click();
//
//        String parent3 = webDriver.getWindowHandle();
//        System.out.println("Parent window is " + parent3);
//        webDriver.findElement(By.xpath(".//*[@id='group_7']")).click();
//        Set<String> allWindows3 = webDriver.getWindowHandles();
//        int count3 = allWindows3.size();
//        System.out.println("Total window " + count3);
//        for (String child : allWindows) {
//            if (!parent.equalsIgnoreCase(child)) {
//                webDriver.switchTo().window(child);
//            }
//        }
//
//        Thread.sleep(1000);
//        wait10.until(ExpectedConditions.elementToBeClickable(By.id("filter1_column1_14")));
//
//
//try {
//    webDriver.findElement(By.id("filter1_column1_14")).sendKeys("СТ.368-2 Ч.1");
//}catch (Exception e) {
//    e.printStackTrace();



//}

//        webDriver.findElement(By.id("control_19")).click();
//        Actions action = new Actions(webDriver);
//        action.doubleClick(webDriver.findElement(By.id("tr_0_14"))).perform();
//        webDriver.findElement(By.className("СТ.368-2 Ч.1")).click();

//
//        String parent4 = webDriver.getWindowHandle();
//        System.out.println("Parent window is " + parent4);
//        webDriver.findElement(By.xpath(".//*[@id='group_51']")).click();
//        Set<String> allWindows4 = webDriver.getWindowHandles();
//        int count4 = allWindows4.size();
//        System.out.println("Total window " + count4);
//        for (String child : allWindows) {
//            if (!parent.equalsIgnoreCase(child)) {
//                webDriver.switchTo().window(child);
//            }
//        }

//        webDriver.findElement(By.xpath(".//*[@id='txtSurname']")).sendKeys("uuid");
//
//        webDriver.findElement(By.id("btn_85")).click();
////        Actions actions = new Actions(webDriver);
////        actions.moveToElement((WebElement) By.tagName("чоловік")).click();
//
//        String parent4 = webDriver.getWindowHandle();
//        System.out.println("Parent window is " + parent4);
////        webDriver.findElement(By.id("item_3_85")).click();
//        webDriver.findElement(By.xpath(".//*[@id='item_3_85']")).click();
//        Set<String> allWindows4 = webDriver.getWindowHandles();
//        int count4 = allWindows4.size();
//        System.out.println("Total window " + count4);
//        for (String child : allWindows) {
//            if (!parent.equalsIgnoreCase(child)) {
//                webDriver.switchTo().window(child);
//            }
//        }
//        webDriver.findElement(By.id("item_0_63")).click();


//невалидній
//        String uuid = UUID.randomUUID().toString();
//        try {
//            webDriver.findElement(By.xpath(".//*[@id='txtSurname']")).sendKeys(uuid);
//        } catch (Exception e) {
//            System.out.println("no link");
//        }
//






            //        webDriver.close();
//        }

//    }