package pl.sda.zdjavapol75.podstawy.test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    public void testIsOdd(int number){
        assertTrue(Numbers.isOdd(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {6,12,10})
    public void testIsParzystaAndPodzielnaPrzez3 (int number) {
        //given
        Numbers numbers = new Numbers();

        // when
        boolean result = numbers.isParzystaAndPodzielnaPrzez3(number);
        //then
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(ints = {5,11,19})
    public void testissParzystaAndPodzielnaPrzez3 (int number) {
        //given
        Numbers numbers = new Numbers();

        // when
        boolean result = numbers.isParzystaAndPodzielnaPrzez3(number);
        //then
        assertFalse(result);

    }
}