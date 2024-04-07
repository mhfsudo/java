package ch.mhf.knight;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestKnightWalk
{

    @Test
    public void testWalk3_4()
    {
        testWalk(3,4, new KnightWalk.Field(0,0));
    }

    @Test
    public void testWalk6_6()
    {
        testWalk(6,6, new KnightWalk.Field(0,0));
    }

    @Test
    public void testWalk8_8()
    {
        testWalk(8,8, new KnightWalk.Field(0,0));
    }

    private void testWalk(int rows, int cols,
                          KnightWalk.Field start)
    {
        KnightWalk.Field[] walk = KnightWalk.walk(rows, cols, start);
        assertTrue(walk.length >= rows * cols, "Walk to short");
        assertTrue(walk.length <= rows * cols, "Walk to long");
        assertEquals(start, walk[0], "Wrong start field");
        HashSet<KnightWalk.Field> visitedFields = new HashSet<>();
        for (KnightWalk.Field field : walk)
        {
            assertTrue(field.col >= 0 && field.col < cols, "Illegal field");
            assertTrue(field.row >= 0 && field.row < rows, "Illegal Field");
            visitedFields.add(field);
        }
        assertEquals(walk.length, visitedFields.size(),
		     "There are fields that are visited more than once");
        for (int i = 1; i < walk.length; i++)
        {
            assertTrue(checkMove(walk[i-1], walk[i]), "Illegal Move");
        }
    }

    private static boolean checkMove(KnightWalk.Field field1, KnightWalk.Field field2)
    {
        int deltaRow = Math.abs(field1.row -field2.row);
        int deltaCol = Math.abs(field1.col -field2.col);
        return deltaRow == 1 && deltaCol == 2 ||
                deltaRow == 2 && deltaCol == 1;
    }

}

