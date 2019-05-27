package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Page which opened after login page. It has 3 tabs.

public class TemplatePage extends ParentPage {
    public TemplatePage(WebDriver webDriver) {
        super(webDriver);

    }

    public void krimProvTab() {
        WebDriverWait wait100;
        wait100 = new WebDriverWait(webDriver, 100);
        try {
            wait100.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='a_5']")));
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            webDriver.findElement(By.xpath(".//*[@id='a_5']")).click();
        }catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element" + e);
        }
    }//Open criminal proceedings tab

    public void analStatTab() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            webDriver.findElement(By.xpath(".//*[@id='a_6']")).click();
        }catch (Exception e) {
            System.out.println("Can not work with element");
            Assert.fail("Can not work with element" + e);
        }
    }//Open analytic and statistik tab

    public void novynyTab() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            webDriver.findElement(By.xpath(".//*[@id='a_7']")).click();
        }catch (Exception e) {
            System.out.println("Can not work with element");
            Assert.fail("Can not work with element" + e);
        }
    }//Open news tab

}

