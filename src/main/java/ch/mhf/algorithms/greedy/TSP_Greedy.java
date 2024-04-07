package ch.mhf.greedy;

import java.util.ArrayList;

public class TSP_Greedy
{
    /**
     * Ermittelt einen womöglich billigen Weg mit greedy-Ansatz.
     * Jeder Knoten muss genau einmal besucht werden.
     *
     * @param matrix Die Adjazenzmatrix
     * @param start  Der Startknoten
     * @return Der Weg als Array von Knoten
     * @throws IllegalArgumentException Wenn Input nicht korrekt ist
     */
    static int[] findPath(int[][] matrix, int start)
    {
        checkInput(matrix, start);

        int smalestValue = 0;
        int smalestIndex = 0;
        int rowIndex = 0;
        int valIndex = 0;
        ArrayList<Integer> alredyUsed = new ArrayList<Integer>();
        alredyUsed.add(start); //Der erste besuchte knoten ist start

        rowIndex = start;
        while (!(rowIndex < 0 || rowIndex > matrix.length - 1)) // wenn das array über- oder unterläuft -> abbrechen
        { // loope über Knoten

            smalestValue = 0;
            smalestIndex = 0;
            valIndex = start;
            while (!(valIndex < 0 || valIndex > matrix[rowIndex].length - 1)) // loope über kanten von einem Knoten
            {
                //wenn nicht auf den eigenen Knoten gezeigt wird und
                //dieser Knoten noch nicht verwendet wurde.
                if (rowIndex != valIndex && !alredyUsed.contains(valIndex))
                {
                    // wenn der erste Durchlauf oder der aktuelle Kantenwert kleiner als der bisher gefundene Kantenwert.
                    if (smalestValue == 0 || matrix[rowIndex][valIndex] < smalestValue)
                    {
                        //speichere den aktuell kleinsten gefundenen Wert und Index von dem Knoten
                        smalestValue = matrix[rowIndex][valIndex];
                        smalestIndex = valIndex;
                    }
                }

                // entscheide ob herauf- oder heruntergezählt wird bei den Kanten
                if (start < (matrix.length - 1))
                    valIndex++;
                else
                    valIndex--;
            }
            // speichere die kleinste unbenutzte Kante des Knoten
            if (!alredyUsed.contains(smalestIndex))
                alredyUsed.add(smalestIndex);


            // entscheide ob herauf- oder heruntergezählt wird bei den Knoten
            if (start < (matrix.length - 1))
                rowIndex++;
            else
                rowIndex--;

        }


        return alredyUsed.stream().mapToInt(i -> i).toArray();
    }

    /**
     * Test, ob Input korrekt ist:
     * + Die Adjazenzmatrix muss quadratisch sein
     * + Die Matrizenelemente müssen >= 0 sein
     * + Der Startwert muss eine zulässige Knotennummer sein
     *
     * @throws IllegalArgumentException Wenn die obigen Bedingungen nicht erfüllt sind
     */
    static void checkInput(int[][] matrix, int start)
            throws IllegalArgumentException
    {
        for (int[] row : matrix)
        {
            if (row.length != matrix.length)
            {
                throw new IllegalArgumentException(
                        "Matrix is not as square matrix");
            }
            for (int val : row)
            {
                if (val < 0)
                {
                    throw new IllegalArgumentException(
                            "Negative elements in the matrix are not allowed");
                }
            }
        }
        if (start < 0 || start >= matrix.length)
        {
            throw new IllegalArgumentException(
                    "The start index is illegal");
        }
    }


}
