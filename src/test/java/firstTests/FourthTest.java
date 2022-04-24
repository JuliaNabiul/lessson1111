package firstTests;



import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class FourthTest {

    @Test
    public void contain() {

        String number1 = "99999";
        String number2 = "9";

        System.out.println("Your first number contains the second number?");
        System.out.println("First number = " + number1 + " Second number = " +number2);
        Assertion a = new Assertion();

        a.assertTrue(number1.contains(number2));

        System.out.println("True");

    }

}
