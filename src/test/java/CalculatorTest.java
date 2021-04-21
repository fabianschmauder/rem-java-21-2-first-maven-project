import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void addShouldReturnSumOfValues(){
        //GIVEN
        int value1 = 3;
        int value2 = 5;

        //WHEN
        int sum = Calculator.add(value1, value2);

        //THEN
        assertEquals(8, sum);
    }

}
