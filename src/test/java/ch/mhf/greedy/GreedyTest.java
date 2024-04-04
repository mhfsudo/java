package ch.mhf.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GreedyTest
{
    @Test
    public void singleNodeTest()
    {
        assertArrayEquals(new int[] {0}, TSP_Greedy.findPath(new int[][] { {0} }, 0));
    }
    
    @Test
    public void twoNodesTest()
    {
        int[][] matrix = { { 0, 3  },
                           { 3, 0 } };
        int[] path = { 1, 0 };

        assertArrayEquals(path, TSP_Greedy.findPath(matrix, 1));
    }
    
    @Test
    public void ascendingPathTest()
    {
        int[][] matrix = { { 0, 1, 2, 3, 4  },
                           { 1, 0, 5, 6, 7  },
                           { 2, 5, 0, 8, 9  },
                           { 3, 6, 8, 0, 10 },
                           { 4, 7, 9, 10, 0 } };

        int[] path = {0, 1, 2, 3, 4};
        
        assertArrayEquals(path, TSP_Greedy.findPath(matrix, 0));
    }
    
    @Test
    public void descendingPathTest()
    {
        int[][] matrix = { { 0, 10, 9, 7, 4 },
                           { 10, 0, 8, 6, 3 },
                           { 9,  8, 0, 5, 2 },
                           { 7,  6, 5, 0, 1 },
                           { 4,  3, 2, 1, 0 } };

        int[] path = {4, 3, 2, 1, 0};
        
        assertArrayEquals(path, TSP_Greedy.findPath(matrix, 4));
    }

}

