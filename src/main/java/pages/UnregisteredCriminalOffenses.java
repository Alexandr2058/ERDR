package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;

public class UnregisteredCriminalOffenses  extends ParentPage{

    @FindBy (id = "a_23")
    private String unregPage;

    public UnregisteredCriminalOffenses(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void goToDom(String pageId) {

        Set<String> windows = webDriver.getWindowHandles();
        String parent = null;
        String child = null;
        Iterator<String> it = windows.iterator();
        while(it.hasNext()) {
            parent = (String) it.next();
//            child = (String) it.next();
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
        webDriver.findElement(By.id(pageId)).click();
//        System.out.println("Get URL"+ webDriver.getCurrentUrl());
//        System.out.println("Get Window Title"+ webDriver.getWindowHandle());
//        System.out.println("Get URL"+ webDriver.getPageSource());

    }
}
