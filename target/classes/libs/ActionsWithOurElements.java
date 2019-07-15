package libs;



import org.apache.log4j.Logger;
//import org.apache.xpath.operations.String;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class ActionsWithOurElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    WebDriverWait wait10, wait15;

    public ActionsWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait10 = new WebDriverWait(webDriver, 100);
        wait15 = new WebDriverWait(webDriver, 15);
    }

    public void enterTextIntoElement(WebElement element, String text) {
        try {
            wait10.until(ExpectedConditions.elementToBeClickable(element));
            element.clear();
            element.sendKeys(text);
            logger.info(text + " was input into element");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    private void printErrorAndStopTest(Exception e) {
        logger.error("Cannon work with element" + e);
        Assert.fail("Cannon work with element" + e);
    }

    public void clickOnElement(WebElement element) {
        try {
            wait10.until(ExpectedConditions.elementToBeClickable(element));
            Thread.sleep(1000);
            element.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public boolean isElementPresent(WebElement webElement) {
        try {
            boolean isDisplayed = webElement.isDisplayed();
            logger.info("Element is displayed -> " + isDisplayed);
            return isDisplayed;
        } catch (Exception e) {
            logger.info("Element is displayed -> false");
            return false;
        }
    }

    public void selectValueInDD(WebElement element, String value) {
        try {
            Select select = new Select(element);
            select.selectByValue(value);
            logger.info(value + " was selected in DD");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void selectDataInDD(String data) throws InterruptedException {
        try {
            wait10.until(ExpectedConditions.elementToBeClickable(By.xpath(data)));
            Thread.sleep(1000);
            webDriver.findElement(By.xpath(data)).click();
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void setStatusToCheckBox(WebElement element, String neededState) {
        if ("check".equals(neededState) || "uncheck".equals(neededState)) {
            try {
                if (element.isSelected() && "check".equals(neededState)) {
                    logger.info("Already check");
                } else if (!element.isSelected() && "check".equals(neededState)) {
                    element.click();
                    logger.info("check box checked");
                } else if (element.isSelected() && "uncheck".equals(neededState)) {
                    element.click();
                    logger.info("check box deselected");
                } else if (!element.isSelected() && "uncheck".equals(neededState)) {
                    logger.info("checkbox is already unchecked");
                }
            } catch (Exception e) {
                printErrorAndStopTest(e);
            }
        } else {
            logger.error("State should be 'check' or 'uncheck'");
            Assert.fail("State should be 'check' or 'uncheck'");
        }
    }

    public void chooseNewWindow(String locator) {
        String parent = webDriver.getWindowHandle();
        logger.info("Parent window is " + parent);
        webDriver.findElement(By.xpath(locator)).click();
        Set<String> allWindows = webDriver.getWindowHandles();
        int count = allWindows.size();
        logger.info("Total window " + count);
        for (String child : allWindows) {
            if (!parent.equalsIgnoreCase(child)) {
                webDriver.switchTo().window(child);
//                webDriver.findElement(By.id("btn_27")).click();btn_1_16
            }
        }
    }

    public void enterDate() {
        DateFormat dateFormat2 = new SimpleDateFormat("d");
        Date date2 = new Date();
        String today = dateFormat2.format(date2);
        //find the calendar
        WebElement dateWidget = webDriver.findElement(By.id("calendarDiv_411"));//calendarDiv_411
        List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

//        comparing the text of cell with today date and clicking it.
        for (WebElement cell : columns) {
            if (cell.getText().equals(today)) {
                cell.click();
                break;
            }
        }
    }

    public void sendKey (WebElement element) {
        try {
            element.sendKeys(Keys.DOWN);
            logger.info("element was up");
        }catch (Exception e) {
            printErrorAndStopTest(e);
        }

    }

    public void scroll() {

//        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
//        jse.executeScript("window.scrollBy(0,innerHeight)");

        try {
            Runtime.getRuntime().exec("C:\\Users\\achepik\\Desktop\\scroll.exe");//for chrome open1.exe
            logger.info("AutoIT Script Started");
        }catch (Exception e) {
            logger.error("AutoIt Unvalid");
                e.printStackTrace();
        }
    }

    public void windowSearch (String locator) {
        String currentWindow = webDriver.getWindowHandle();
        for(String winHandle : webDriver.getWindowHandles()){
            if(!winHandle.equals(currentWindow)){
                webDriver.switchTo().window(winHandle);
                System.out.println("current window " + currentWindow);
                System.out.println("window " + winHandle);
                try {
                    webDriver.findElement(By.xpath(locator));
                    System.out.println("catch");
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static final int nameOfTheIndividual = 6;
    public static String getRandomName() {
        String s = "абвгдежзиклмнопрстуфхцчшщєюя";
        StringBuffer phoneNumber = new StringBuffer();
        for (int i = 0; i < nameOfTheIndividual; i++) {
            phoneNumber.append(s.charAt(new Random().nextInt(s.length())));
        }
        return phoneNumber.toString();
    }

    public boolean equalsTime() {
        try {
            DateFormat dateFormat3 = new SimpleDateFormat("dd.MM.YYYY HH:MM");
        System.out.println(dateFormat3);
            Date date3 = new Date();
        System.out.println(date3);
            String today = dateFormat3.format(date3);
        System.out.println(today);
            //find the calendar
            WebElement dateWidget = webDriver.findElement(By.id("tr_0_38"));
            List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
            System.out.println(columns);


//        comparing the text of cell with today date and clicking it.
            for (WebElement cell : columns) {
                if (cell.getText().equals(today)) {
                    logger.info("" + cell.getText());
                    break;
                }
            } return true;
        }catch (Exception e) {
            logger.info("Offenses is not added");
         return false;
//        }
    }
}

    public void dOM(String windowH) {
        Set<String> windows = webDriver.getWindowHandles();
        String parent = null;
        String child = null;
        Iterator<String> it = windows.iterator();
        while(it.hasNext()) {
            parent = (String) it.next();
            child = (String) it.next();
        }
//        webDriver.switchTo().window(child);
//        driver.findElement(By.xpath("//div[@id='x-auto-32__x-auto-32_x-auto-137']/img[2]")).click();Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[@id='x-auto-32__x-auto-32_x-auto-141']/span[2]")).click();Thread.sleep(1000);
//        driver.findElement(By.cssSelector("div.x-grid3-cell-inner.x-grid3-col-runStatus")).click();Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[@id='x-auto-36']")).click();Thread.sleep(1000);
//        driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();Thread.sleep(1000);
//
//        driver.findElement(By.id("mainForm:addinterface")).click();
//        driver.close();
        // till this part working fine.
        webDriver.switchTo().window(parent); // Here failing to focus on parent window and stopped to perform actions on parent window.
        webDriver.findElement(By.id(windowH)).click();
//        System.out.println("Get URL"+ webDriver.getCurrentUrl());
//        System.out.println("Get Window Title"+ webDriver.getWindowHandle());
//        System.out.println("Get URL"+ webDriver.getPageSource());

    }

    public void windowSearchs(String windowH) {

        Set<String> windows = webDriver.getWindowHandles();
        String parent = null;
        String child = null;
        Iterator<String> it = windows.iterator();
        while(it.hasNext()) {
            parent = (String) it.next();
            child = (String) it.next();
        }
        webDriver.switchTo().window(child);
        try {
            webDriver.findElement(By.id(windowH)).click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }
    }

    public void windowSearchThre(String windowT) {

        Set<String> windows = webDriver.getWindowHandles();
        String parent = null;
        String childOne = null;
        String childTwo =null;
        Iterator<String> it = windows.iterator();
        while(it.hasNext()) {
            parent = (String) it.next();
            childOne = (String) it.next();
            childTwo = (String) it.next();
        }
        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childOne)) {
                webDriver.switchTo().window(childOne);
            }
        }

        try {
            webDriver.findElement(By.id(windowT)).click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }

        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childTwo)) {
                webDriver.switchTo().window(childTwo);
            }
        }
        try {
            webDriver.findElement(By.id(windowT)).click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }
    }

    public void downEnter() {
        try {
            Thread.sleep(2000);
            webDriver.findElement(By.id("zenModalDiv")).sendKeys(Keys.DOWN, Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
