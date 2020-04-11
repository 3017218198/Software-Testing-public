//package mujavaDemo;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

//import mujavaDemo.BubbleSort;

public class BubbleSortTest {
//	private BubbleSort c;

//	@Before
//	public void setUp() throws Exception {
////		c = new BubbleSort();
//	}

	@Test
	public void test() {
		int a[] = { 1, 6, 2, 2, 5 };
		int a1[] = { 1, 2, 2, 5, 6 };
		assertArrayEquals(a1, BubbleSort.BubbleSort(a));
	}

}
