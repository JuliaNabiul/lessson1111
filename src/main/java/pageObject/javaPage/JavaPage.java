package pageObject.javaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class JavaPage extends Base {

    public JavaPage(WebDriver driver) {
        super(driver);
    }


    //@FindBy(xpath = ".//a[@title='Править преамбулу'][1]")
    @FindBy(xpath = ".//a[contains(.,'Справка')]")
    private WebElement helpButton;

    /**
     *
     * Проверяем, что кнопка "Справка" существует на странице
     */

    public boolean isHelpButtonIsExist() {
        return waitVisibilityElement(helpButton);
    }
}
