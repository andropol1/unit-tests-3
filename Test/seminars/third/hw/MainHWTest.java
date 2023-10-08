package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {
    @Test
    void evenNumberTest() {
        int evenNumber = 4;
        boolean expectedResult = true;
        assertEquals(expectedResult, MainHW.evenOddNumber(evenNumber), "Данное число не является четным!");
    }

    @Test
    void oddNumberTest() {
        int oddNumber = 3;
        boolean expectedResult = false;
        assertEquals(expectedResult, MainHW.evenOddNumber(oddNumber), "Данное число является нечетным!");
    }

    @Test
    void numberInIntervalTest(){
        int testNumber = 26;
        boolean expectedResult = true;
        assertEquals(expectedResult, MainHW.numberInInterval(testNumber), "Данное число не попадает в интервал!");

    }
}
