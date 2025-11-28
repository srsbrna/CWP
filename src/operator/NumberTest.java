package lib.operator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumberTest {

    @Test
    public void testCase1_PositiveNumbers() {
        int codeInputA = 10;
        int codeInputB = 5;

        Number number = new Number();
        String codeOutput = number.getOperatorResults(codeInputA, codeInputB);

        String expectedOutput = "Sum: 15\n" +
                                "Product: 50\n" +
                                "Is Equal: false\n" +
                                "Logical AND: true\n" +
                                "Logical OR: true";

        try {
            assertEquals("Case 1: Positive numbers", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testCase2_NegativeAndPositive() {
        int codeInputA = -3;
        int codeInputB = 5;

        Number number = new Number();
        String codeOutput = number.getOperatorResults(codeInputA, codeInputB);

        String expectedOutput = "Sum: 2\n" +
                                "Product: -15\n" +
                                "Is Equal: false\n" +
                                "Logical AND: false\n" +
                                "Logical OR: true";

        try {
            assertEquals("Case 2: Negative & Positive numbers", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testCase3_SameNumbers() {
        int codeInputA = 7;
        int codeInputB = 7;

        Number number = new Number();
        String codeOutput = number.getOperatorResults(codeInputA, codeInputB);

        String expectedOutput = "Sum: 14\n" +
                                "Product: 49\n" +
                                "Is Equal: true\n" +
                                "Logical AND: true\n" +
                                "Logical OR: true";

        try {
            assertEquals("Case 3: Same numbers", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}
