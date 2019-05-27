package kP;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
//import java.util.Set;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class kP {

    @FindBy(id = "input_27")
    private WebElement element;

    @FindBy(linkText = "Керівникодргпу Г.П.")
    private String value;

    @Test
    public void addData() throws InterruptedException {

        File file = new File("./src/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());

        WebDriver webDriver = new FirefoxDriver();
        WebDriverWait wait20, wait10;
        wait20 = new WebDriverWait(webDriver, 100);
        wait10 = new WebDriverWait(webDriver, 1000);

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://erdr.gp.gov.ua/erdr/erdr.web.system.LoginPage.cls?AutoLogout=1");
//        webDriver.findElement(By.xpath(".//*[@type='button']" )).click();

        System.out.println("Site was opened");

        try {
            System.out.println("AutoIT Script Sttarted");
            Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\openMazilla.exe");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        Thread.sleep(30000);
        wait20.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='a_5']")));
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(".//*[@id='a_5']")).click(); //button krim provadj
        webDriver.findElement(By.xpath(".//*[@id='a_22']")).click();// registration pravoporushennya

        String parent = webDriver.getWindowHandle();
        System.out.println("Parent window is " + parent);
        webDriver.findElement(By.xpath(".//*[@id='a_22']")).click();
        Set<String> allWindows = webDriver.getWindowHandles();
        int count = allWindows.size();
        System.out.println("Total window " + count);
        for (String child : allWindows) {
            if (!parent.equalsIgnoreCase(child)) {
                webDriver.switchTo().window(child);
//                ;btn_1_16
            }
        }


        wait10.until(ExpectedConditions.elementToBeClickable (By.xpath(".//*[@id='icon_44']")));

        webDriver.findElement(By.id("icon_44")).click();

        String parent2 = webDriver.getWindowHandle();
        System.out.println("Parent window is " + parent2);
        webDriver.findElement(By.xpath(".//*[@id='zen411']")).click();
        Set<String> allWindows2 = webDriver.getWindowHandles();
        int count2 = allWindows2.size();
        System.out.println("Total window " + count2);
        for (String child : allWindows) {
            if (!parent.equalsIgnoreCase(child)) {
                webDriver.switchTo().window(child);
            }
        }


        webDriver.findElement(By.id("dtcomboCrimeClassification.ImageTlb")).click();

        String parent3 = webDriver.getWindowHandle();
        System.out.println("Parent window is " + parent3);
        webDriver.findElement(By.xpath(".//*[@id='group_7']")).click();
        Set<String> allWindows3 = webDriver.getWindowHandles();
        int count3 = allWindows3.size();
        System.out.println("Total window " + count3);
        for (String child : allWindows) {
            if (!parent.equalsIgnoreCase(child)) {
                webDriver.switchTo().window(child);
            }
        }

        Thread.sleep(1000);
        wait10.until(ExpectedConditions.elementToBeClickable(By.id("filter1_column1_14")));


try {
    webDriver.findElement(By.id("filter1_column1_14")).sendKeys("СТ.368-2 Ч.1");
}catch (Exception e) {
    e.printStackTrace();
}

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
        }

    }