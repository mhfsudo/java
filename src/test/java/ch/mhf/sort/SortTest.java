package ch.mhf.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class SortTest 
{
	private ArrayList<int[]> arrays;
	
	
	@Before
	public void init()
	{
		arrays = new ArrayList<>();
		arrays.add(new int[] { });
		arrays.add(new int[] {1});
		arrays.add(new int[] {2, 1});
		arrays.add(new int[] {1, 1, 2, 2, 3});
		arrays.add(new int[] {1, 1, 2, 2, 1});
		arrays.add(new int[] {2, 1});
		arrays.add(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
		arrays.add(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
		arrays.add(new int[] {10, 3, 5, 3, 6, 3, 2, 8, 7, 2, 2});
		arrays.add(new int[10]);
	}
	
	
	private void testSort(Consumer<int[]> sorter)
	{
		for (int[] array : arrays)
		{
			int[] arrS = array.clone();
			Arrays.sort(arrS);
			sorter.accept(array);
			assertEquals(toList(arrS), toList(array));
		}
	}
	
	private static List<Integer> toList(int[] array)
	{
		return IntStream.of(array).boxed().collect(Collectors.toList());
	}

	
	
	@Test
	public void testInsertSort()
	{
		testSort(IntroSort::sort);
	}
	
	@Test
	public void testQuickSort()
	{
		testSort(QuickSort::sort);
	}
	
	@Test
	public void testQuickSortPlus()
	{
		int oldThr = QuickSort.THRESHOLD;
		try
		{
			QuickSort.THRESHOLD = 4;
			testSort(QuickSort::sortPlus);
		}
		finally
		{
			QuickSort.THRESHOLD = oldThr;
		}
	}
	
	/**
	 * Tests für log2 Methode
	 */
	@Test
	public void testLog2()
	{
		assertSame(0, IntroSort.log2(1));
		assertSame(1, IntroSort.log2(2));
		assertSame(1, IntroSort.log2(3));
		assertSame(2, IntroSort.log2(4));
		assertSame(2, IntroSort.log2(5));
		assertSame(2, IntroSort.log2(7));
		assertSame(3, IntroSort.log2(8));
		assertSame(3, IntroSort.log2(9));
		assertSame(0, IntroSort.log2(0));
	}
	
	@Test
	public void testMergeSort()
	{
		testSort(MergeSort::sort);
	}

	@Test
	public void testIntroSort()
	{
		testSort(IntroSort::sort);
	}

}
