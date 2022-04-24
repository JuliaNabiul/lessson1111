package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    private WebDriver driver;

    protected final int driverWaitTime = 15;

    public Base(final WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;

    }

    public WebDriver getDriver() {
        return driver;
    }

    public void click(final WebElement element) {
        waitVisibilityElement(element);
        element.click();
    }

    public void setText(final WebElement element, final String text) {
        waitVisibilityElement(element);
        element.sendKeys(text);
    }

    public String getText(final WebElement element) {
        waitVisibilityElement(element);
        return element.getText();
    }

//    public boolean isElementExists(final WebElement element){
//        driver.findElement(By.xpath(element));
//    }

    public Boolean waitVisibilityElement(final WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, driverWaitTime);

        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false;
    }

    public Boolean waitVisibilityElement(final WebElement element, final int sec) {
        WebDriverWait wait = new WebDriverWait(driver, sec);

        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false;
    }
}
