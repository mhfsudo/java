package ch.mhf.junit;

import ch.mhf.junit.JUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnitTest
{

    @Test
    void getName()
    {
        JUnit test = new JUnit("Hello Test");
        assertEquals("Hello Test", test.getName());
    }
}