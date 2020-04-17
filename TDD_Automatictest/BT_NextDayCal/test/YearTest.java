import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void setNextYearnomal() {
        int day=1;
        int month=12;
        int year=2002;
        int expected = 2002;
        int result = NextDayCalculator.setNextYear(day,month,year);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void setNextYearDecember() {
        int day=31;
        int month=12;
        int year=2002;
        int expected = 2003;
        int result = NextDayCalculator.setNextYear(day,month,year);
        assertEquals(expected,result);
    }
}