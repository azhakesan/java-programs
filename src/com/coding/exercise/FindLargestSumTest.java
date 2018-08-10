package com.coding.exercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindLargestSumTest {
	FindLargestSum findLargestSum = null;

	@Before
	public void setUp() throws Exception {
		findLargestSum = new FindLargestSum();
	}

	@Test
	public void test() {
		int[][] ar = new int[][] { 
						{ 4, 8, 100, -1000 }, 
						{ 70, -10, 2000, 70 }, 
						{ -5, -21, -6, 8 },
						{ 10000, -20, 15, 21 }
			};
		System.out.println("Max possible sum =" + findLargestSum.findMaxSum(ar));
	}

	@After
	public void tearDown() throws Exception {
		findLargestSum = null;
	}

}
