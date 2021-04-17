package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComonPage {
    WebDriver driver;
    int wait = 30;

    public ComonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".user-name")
    WebElement prijava;
    @FindBy(css = "div[class=\"register-links-wrap\"] a[href*=\"register\"]")
    WebElement register;

    public void hoverPrijava(){
    Actions actions = new Actions(driver);
    actions.moveToElement(prijava).build().perform();
    register.click();




    }



}
