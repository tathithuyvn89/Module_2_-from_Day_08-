import static org.junit.jupiter.api.Assertions.*;

class ReadNumberTest {

    @org.junit.jupiter.api.Test
    void readNumber1() {
        int number =5;
        String epected = "nam";
        String result = FizzBuzz.ReadNumberToTen(number);
        assertEquals(epected,result);
    }
    @org.junit.jupiter.api.Test
    void readNumber2() {
        int number =10;
        String epected = "muoi";
        String result = FizzBuzz.ReadNumberToTen(number);
        assertEquals(epected,result);
    }
    @org.junit.jupiter.api.Test
    void readNumber3() {
        int number =7;
        String epected = "bay";
        String result = FizzBuzz.ReadNumberToTen(number);
        assertEquals(epected,result);
    }
}