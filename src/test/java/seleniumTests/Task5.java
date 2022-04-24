package seleniumTests;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.google.InitPageObject;
import pageObject.google.SearchResultPageObject;
import pageObject.javaPage.JavaPage;

public class Task5 extends BaseTest{

    @Test
    public void startTest() {
        getDriver().get("https://www.google.ru/");
        getDriver().manage().window().maximize();

        InitPageObject in = new InitPageObject(getDriver());
        in.setSearchText("Java");
        in.clickSubmitSearch();
        SearchResultPageObject sr = new SearchResultPageObject(getDriver());
        Assertion as = new Assertion();
        sr.clickJavaPage();

        JavaPage wp = new JavaPage(getDriver());
        as.assertTrue(wp.isHelpButtonIsExist());


    }
}
