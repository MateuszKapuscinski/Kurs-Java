package pl.sda.zdjavapol75.działanie.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd () {
        //given
        double a = 2.0;
        double b = 2.0;
        double expected = 4;
        Calculator calculator = new Calculator();

        //when
        double result = calculator.add(a,b);

        //then
        assertEquals(expected,result);
    }

    @Test
    public void testOdejmij () {
        //given
        double a = 2.0;
        double b = 2.0;
        double expected = 0;
        Calculator calculator = new Calculator();

        //when
        double result = calculator.odejmij(a,b);

        //then
        assertEquals(expected,result);
    }
    @Test
    public void testPodziel () {
        //given
        double a = 2.0;
        double b = 2.0;
        double expected = 1;
        Calculator calculator = new Calculator();

        //when
        double result = calculator.podziel(a,b);

        //then
        assertEquals(expected,result);
    }
    @Test
    public void testsumowanieElementowTablicy () {
        //given
        double[] a = {2.0, 2.0};
        double expected = 4.0;
        Calculator calculator = new Calculator();

        //when
        double result = calculator.sumowanieElementowTablicy(a);

        //then
        assertEquals(expected,result);
    }
}