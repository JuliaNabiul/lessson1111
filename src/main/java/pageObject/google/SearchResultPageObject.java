package pageObject.google;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class SearchResultPageObject extends Base {
    public SearchResultPageObject(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = ".//div[@class='main']//a[contains(.,'Картинки')]")
    private WebElement imagesTab;

    //@FindBy(xpath = ".//div[@class='main']//h3[contains(.,'Java - Википедия')]")
    @FindBy(xpath = ".//div[@class='main']//a[@href='https://www.java.com/ru/']")
    private WebElement javaPage;

    /**
     *
     * Проверяем, что кнопка Картинки существует на странице
     */

    @Step("Проверяем, что кнопка Картинки существует на странице")
    public boolean isImagesTabButtonIsExist() {
        return waitVisibilityElement(imagesTab);
    }

    /**
     *
     * Переходим на страницу Java
     */

    public void clickJavaPage() {
        click(javaPage);
    }
}
