import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void lastOfMonth1() {
        int year =600;
        int month=2;
        int repected = 28;
        int result = NextDayCalculator.lastOfMonth(month,year);
        assertEquals(repected,result);
    }
    @Test
    void lastOfMonth2() {
        int year =13;
        int month=2;
        int repected = 28;
        int result = NextDayCalculator.lastOfMonth(month,year);
        assertEquals(repected,result);
    }
    @Test
    void lastOfMonth3() {
        int year =300;
        int month=12;
        int repected = 31;
        int result = NextDayCalculator.lastOfMonth(month,year);
        assertEquals(repected,result);
    }
}