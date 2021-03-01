package pl.sda.zdjavapol75.podstawy.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonSDATest {
    private PersonSDA personSDA;

    @BeforeEach
    public void init() {
        personSDA = new PersonSDA();

    }

    @Test
    public void testPersonSDAGetter() {
        //given

        personSDA.setName("Andrzej");

        //when
        String name = personSDA.getName();

        //then
        assertNotNull(name);
        assertEquals("Andrzej", name);

    }

    @Test
    public void testPersonSDAFieldName_WhenNull() {
        //given

        //when
        String name = personSDA.getName();

        //then
        assertNull(name);
    }
}