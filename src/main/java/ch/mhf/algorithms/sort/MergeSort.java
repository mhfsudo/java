package ch.mhf.sort;

public class MergeSort 
{
	/**
	 * Sortiert ein Array durch Mischen
	 * @param array Das zu sortierende Array.
	 */
	public static void sort(int[] array)
	{
		if (array != null)
		{
			int length = array.length;
			if (length > 0)
				sort(array, 0, length - 1);
			else
				System.out.println("the array contains no items");
		} else
			System.out.println("the array contains no object");
	}
	
	/**
	 * Sortiert einen durch zwei Grenzen angebenen Teil eines Arrays durch Mischen.
	 * Arrayelemente ausserhalb der Grenzen werden nicht verschoben.
	 * @param array 
	 * @param start Index des ersten  Elementes des Teils, das Sortiert werden muss.
	 * @param end   Index des letzten Elementes des Teils, das sortiert werden muss.
	 */
	public static void sort(int[] array, int start, int end)
	{
		if (start < end)
		{
			int mid = (start + end) / 2;
			sort(array, start, mid);
			sort(array, mid + 1, end);
			merge(array, start, mid, end);
		}
	}

	public static void merge(int[] array, int start, int mid, int end)
	{
		int n1 = mid - start + 1;
		int n2 = end - mid;
		int[] startCache = new int[n1];
		int[] endCache = new int[n2];
		for (int i = 0; i < n1; ++i)
			startCache[i] = array[start + i];
		for (int j = 0; j < n2; ++j)
			endCache[j] = array[mid + 1 + j];
		int i = 0;
		int j = 0;
		int k = start;
		while (i < n1 && j < n2)
		{
			if (startCache[i] <= endCache[j])
			{
				array[k] = startCache[i];
				i++;
			}
			else
			{
				array[k] = endCache[j];
				j++;
			}
			k++;
		}
		while (i < n1)
		{
			array[k] = startCache[i];
			i++;
			k++;
		}
		while (j < n2)
		{
			array[k] = endCache[j];
			j++;
			k++;
		}
	}
}
