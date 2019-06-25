package kP;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class kRCrome {

    @FindBy(id = "input_27")
    private WebElement element;

    @FindBy(linkText = "Керівникодргпу Г.П.")
    private String value;

    @Test
    public void addData() throws InterruptedException {

        File file = new File("./src/drivers/chromedriver74.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        WebDriver webDriver = new ChromeDriver();

        WebDriverWait wait20, wait10;
        wait20 = new WebDriverWait(webDriver, 100);
        wait10 = new WebDriverWait(webDriver, 1000);

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://erdr.gp.gov.ua/erdr/erdr.web.system.LoginPage.cls?AutoLogout=1");


        System.out.println("Site was opened");


        try {
            System.out.println("AutoIT Script Sttarted");
            Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\open1.exe");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        Thread.sleep(30000);
        wait20.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='a_5']")));
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(".//*[@id='a_5']")).click(); //button krim provadj
        webDriver.findElement(By.xpath(".//*[@id='a_21']")).click();// registration pravoporushennya

        try {
            Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\scroll.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        webDriver.findElement(By.id("btn_100")).click();
//        webDriver.findElement(By.xpath(".//*[@id='filter1_column1_14'']")).sendKeys("456465");
        String parent = webDriver.getWindowHandle();
        System.out.println("Parent window is " + parent);
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(".//*[@id='btn_100']")).click();
        Set<String> allWindows = webDriver.getWindowHandles();
        int count = allWindows.size();
        System.out.println("Total window " + count);
        for (String child : allWindows) {
            if (!parent.equalsIgnoreCase(child)) {
                webDriver.switchTo().window(child);
            }
        }
        webDriver.findElement(By.id("image_377")).click();

//        webDriver.findElement(By.id("zenLayoutTableCell_377")).click();
//        webDriver.findElement(By.id("filter1_column1_14")).sendKeys("115");
//
//        webDriver.findElement(By.id("filter1_column1_14")).sendKeys(Keys.ENTER);

//        Thread.sleep(1000);
//        wait10.until(ExpectedConditions.elementToBeClickable (By.xpath(".//*[@id='icon_44']")));
//
//        webDriver.findElement(By.id("icon_44")).click();
//
//        String parent2 = webDriver.getWindowHandle();
//        System.out.println("Parent window is " + parent2);
//        webDriver.findElement(By.xpath(".//*[@id='zen411']")).click();
//        Set<String> allWindows2 = webDriver.getWindowHandles();
//        int count2 = allWindows2.size();
//        System.out.println("Total window " + count2);
//        for (String child : allWindows) {
//            if (!parent.equalsIgnoreCase(child)) {
//                webDriver.switchTo().window(child);
//            }
//        }
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
