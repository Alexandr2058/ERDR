package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterCriminalProceedings  extends ParentPage{

    @FindBy (id = "caption_32")
    private WebElement filtr;

    @FindBy (id = "control_38")
    private WebElement numArea;

    @FindBy (id = "control_223")
    private WebElement applyFiltr;

    public RegisterCriminalProceedings(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void chooseKP(String locator, String status) {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.chooseOffense(locator,status);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void chooseKPParams(String locator, String status, String number) {
        webDriver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[3]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[3]/td/div/button")).click();
        webDriver.findElement(By.xpath(".//input[@type='checkbox' and @value='crimeCnt'] ")).click();
        try {
            Thread.sleep(2000);
            actionsWithOurElements.chooseOffParams(locator, status, number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public String chooseNumbKP() {
        String numb = webDriver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[3]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[3]/td/div/table/tbody[2]/tr[4]/td[2]")).getText();
        System.out.println(numb);
        return numb;
    }

    @Step
    public void searchKP(){
        String numb = webDriver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[3]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[3]/td/div/table/tbody[2]/tr[4]/td[2]")).getText();
        actionsWithOurElements.clickOnElement(filtr);
        actionsWithOurElements.enterTextIntoElement(numArea, numb);
        actionsWithOurElements.clickOnElement(applyFiltr);
    }

//    @Step
//    public void searchKPFiltrArea(String args[]) {
////        actionsWithOurElements.clickOnElement(filtr);
//
//    }
}
