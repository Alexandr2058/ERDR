package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CharacteristicsOfCriminalOffense extends ParentPage{

    @FindBy (id = "image_401")
    private WebElement place;

    @FindBy (id = "th_column2_14")
    private String area;

    @FindBy (id = "filter1_column2_14")
    private WebElement areaName;

    @FindBy (xpath = ".//*[@class='tpAction']")
    private WebElement chooseArea;

    @FindBy (id = "spacer_358")
    private String windowPlace;

    @FindBy (id = "input_399")
    private WebElement city;

    public CharacteristicsOfCriminalOffense(WebDriver webDriver) {
        super(webDriver);
    }

    public void placeOfCommissionPfOffense() {

        try {
            actionsWithOurElements.enterTextIntoElement(city, "05 місто");
            Thread.sleep(1000);
            webDriver.findElement(By.id("zenModalDiv")).sendKeys(Keys.DOWN, Keys.ENTER);
            logger.info("ok");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
