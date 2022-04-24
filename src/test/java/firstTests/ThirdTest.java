package firstTests;

import javaSimple.ForConstructor;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTest extends BaseTest{

    String firstParam = "Кто виноват?";
    String secondParam = "NoBody";


    @Parameters({"IDont", "iKnow"})
    @Test
    public void startTest(String firstParam, String secondParam) {
        System.out.println("Первый параметр" + firstParam);
        System.out.println("Второй параметр" + secondParam);
        System.out.println("Но на самом деле" + this.firstParam + "" + this.secondParam );

        this.firstParam=firstParam;
        this.secondParam=secondParam;

    }

    @Test(priority=2)
    public void startTest() {
        System.out.println("Первый параметр" + firstParam);
        System.out.println("Второй параметр" + secondParam);
        System.out.println("Но на самом деле" + this.firstParam + "" + this.secondParam );

    }

    @Test(priority=1)
    public void startTestV2() {
        ForConstructor con = new ForConstructor();
        System.out.println("Первый параметр" + firstParam);
        System.out.println("Второй параметр" + secondParam);
        System.out.println("Но на самом деле" + con.constParam1 + " " + con.constParam2);

    }

}
