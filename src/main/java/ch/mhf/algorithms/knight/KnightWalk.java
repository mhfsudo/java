package ch.mhf.knight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KnightWalk
{
    private KnightWalk(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;

        endSize = rows * cols;
    }

    private final int rows;
    private final int cols;
    private static int endSize;
    private int numberOfMoves = 0;

    private List<Field> visitedCells = new ArrayList<>();
    private final int[][] possibleMoves = {{-2, -1}, {-2, 1}, {2, -1}, {2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}};


    /**
     * Returns a knight-walk on a chess-board with given number of rows an columns.
     * Every field of the chess-board must be visited exactly once.
     *
     * @param rows
     * @param cols
     * @param start The start field
     * @return Knight-walk as array of fields
     */
    public static Field[] walk(int rows, int cols, Field start)
    {
        KnightWalk nw = new KnightWalk(rows, cols);
        nw.walkRecursion(start);

        Field[] knightWalkArray = new Field[nw.visitedCells.size()];
        knightWalkArray = nw.visitedCells.toArray(knightWalkArray);

        System.out.println("the numbers of moves is: " + nw.numberOfMoves);
        System.out.println("The founded values are: " + Arrays.toString(knightWalkArray));

        return knightWalkArray;
    }

    private boolean walkRecursion(Field start)
    {
        // add starting cell to allredy visited
        visitedCells.add(start);
        numberOfMoves++;

        if (visitedCells.size() >= endSize)
        {
            return true;
        }

        // iterate over possible moves and try with them from start coordinate
        for (int[] move : possibleMoves)
        {
            Field tryFiled = new Field(start.row + move[0], start.col + move[1]);

            if (!visitedCells.contains(tryFiled) && areCoordinatesLegal(tryFiled))
            {

                if (walkRecursion(tryFiled))
                {
                    return true;
                }
            }
        }

        //backtracking
        visitedCells.remove(start);
        numberOfMoves--;
        return false;
    }

    private boolean areCoordinatesLegal(Field field)
    {
        boolean isLegal = true;

        isLegal &= field.row >= 0;
        isLegal &= field.row < rows;
        isLegal &= field.col >= 0;
        isLegal &= field.col < cols;

        return isLegal;
    }

    /**
     * Feld auf dem Schachbrett
     */
    public static class Field
    {
        final int row;
        final int col;

        public Field(int row, int col)
        {
            this.row = row;
            this.col = col;
        }

        @Override
        public String toString()
        {
            return String.format("{%d,%d}", this.row, this.col);
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Field field = (Field) o;

            if (row != field.row) return false;
            return col == field.col;
        }

        @Override
        public int hashCode()
        {
            int result = row;
            result = 31 * result + col;
            return result;
        }
    }
}
