import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void readNumber1() {
        int number =30;
        String expected = "ba mươi";
        String result = FizzBuzz.ReadNumber(number);
        assertEquals(expected,result);
    }
    @Test
    void readNumber2() {
        int number =10;
        String expected = "muời";
        String result = FizzBuzz.ReadNumber(number);
        assertEquals(expected,result);
    }
    @Test
    void readNumber3() {
        int number =21;
        String expected = "hai mươi mot";
        String result = FizzBuzz.ReadNumber(number);
        assertEquals(expected,result);
    }
}