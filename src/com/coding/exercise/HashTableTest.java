/**
 * 
 */
package com.coding.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HashTableTest {
	HashTable<String, String> strHashMap = null;
	HashTable<Integer, Integer> intHashMap = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		strHashMap = new HashTable<String, String>();
		intHashMap = new HashTable<Integer, Integer>();
	}

	/**
	 * Test method for {@link com.coding.exercise.HashTable#size()}.
	 */
	@Test
	public void testSize() {
		assertEquals(0, strHashMap.size());
	}

	/**
	 * Test method for {@link com.coding.exercise.HashTable#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		assertEquals(true, strHashMap.isEmpty());
	}

	/**
	 * Test method for
	 * {@link com.coding.exercise.HashTable#put(java.lang.Object, java.lang.Object)}.
	 */
	@Test
	public void testPut() {
		strHashMap.put("Key1", "One");
		strHashMap.put("Key2", "Two");
	}

	@Test
	public void testPutInt() {
		intHashMap.put(10, 1000);
		intHashMap.put(20, 2000);
	}

	/**
	 * Test method for {@link com.coding.exercise.HashTable#get(java.lang.Object)}.
	 */
	@Test
	public void testGet() {
		assertEquals("One", strHashMap.get("Key1"));
	}

	@Test
	public void testGetInt() {
		assertEquals(0, 2000, intHashMap.get(20));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		strHashMap = null;
		intHashMap = null;
	}
}
