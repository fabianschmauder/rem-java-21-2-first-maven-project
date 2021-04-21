import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    @DisplayName("add should return sum of values")
    public void addShouldReturnSumOfValues() {
        //GIVEN
        int value1 = 3;
        int value2 = 5;

        //WHEN
        int sum = Calculator.add(value1, value2);

        //THEN
        assertEquals(8, sum);
    }

    @Test
    public void curfewShouldReturnCurfewWhenValueIsGreaterThan100() {
        //GIVEN
        int value = 101;

        //WHEN
        String curfew = Calculator.curfew(value);

        //THEN
        assertEquals("curfew", curfew);
    }

    @Test
    public void curfewShouldReturnNoCurfewWhenValueIsLowerThan100() {
        //GIVEN
        int value = 100;

        //WHEN
        String curfew = Calculator.curfew(value);

        //THEN
        assertEquals("no curfew", curfew);
    }

}
