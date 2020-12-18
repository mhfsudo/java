package ch.mhf.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnitTest
{
    private JUnit test;

    @BeforeEach
    public void init()
    {
        test = new JUnit("Hello Test");
    }

    @Test
    public void getName()
    {
        assertEquals("Hello Test", test.getName());
    }
}