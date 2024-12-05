import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    void TwoPlusTwoShouldEqualFour(){
        assertEquals(4,cal.add(2,2));
    }

    @Test
    void TwoPlusThreeShouldEqualFive(){
        assertEquals(5,cal.add(2,3));
    }

    @Test
    void FourTimesFiveShouldEqualTwenty(){
        assertEquals(20,cal.multiply(4,5));
    }


    // as to why you have chosen that test!
    @Test
    void FourMinusThreeShouldEqualOne(){
        assertEquals(1,cal.subtract(4,3));
    }
}