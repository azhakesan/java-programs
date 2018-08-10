/**
 * 
 */
package com.coding.exercise;

import java.util.ArrayList;

/**
 * Hash Table implementation
 *
 * @param <K>
 * @param <V>
 */
public class HashTable<K, V> {

	/**
	 * Hash Entry inner class contains key, value and next pointer
	 *
	 * @param <K>
	 * @param <V>
	 */
	public static class HashEntry<K, V> {
		K key;
		V value;
		HashEntry<K, V> next;

		/**
		 * 
		 * @param key
		 * @param value
		 */
		public HashEntry(K key, V value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}

	/**
	 * buckets array is used to store array of chains
	 */
	private ArrayList<HashEntry<K, V>> buckets;

	// Current capacity of array list
	private int numBuckets;

	// Current size of array list
	private int size;

	/**
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * Initializes capacity, size and empty chains
	 */
	public HashTable() {
		buckets = new ArrayList<>();
		numBuckets = 16;
		size = 0;
		// Create empty chains
		for (int i = 0; i < numBuckets; i++) {
			buckets.add(null);
		}
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	private int getBucketIndex(K key) {
		int hashCode = key.hashCode();
		int index = hashCode % numBuckets;
		return index;
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	synchronized public V get(K key) {
		// Find head of chain for given key
		int bucketIndex = getBucketIndex(key);
		HashEntry<K, V> head = buckets.get(bucketIndex);

		// Search key in chain
		while (head != null) {
			if (head.key.equals(key))
				return head.value;
			head = head.next;
		}

		// If key not found
		return null;
	}

	/**
	 * Adds a key value pair to hash
	 * 
	 * @param key
	 * @param value
	 */
	synchronized public void put(K key, V value) {
		// Find head of chain for given key
		int bucketIndex = getBucketIndex(key);
		HashEntry<K, V> head = buckets.get(bucketIndex);

		// Check if key is already exist
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}

		// Insert key in chain
		size++;
		head = buckets.get(bucketIndex);
		HashEntry<K, V> newNode = new HashEntry<K, V>(key, value);
		newNode.next = head;
		buckets.set(bucketIndex, newNode);

		/**
		 * If load factor goes beyond threshold, then double hash table size
		 */
		if ((1.0 * size) / numBuckets >= 0.7) {
			ArrayList<HashEntry<K, V>> temp = buckets;
			buckets = new ArrayList<>();
			numBuckets = 2 * numBuckets;
			size = 0;
			for (int i = 0; i < numBuckets; i++)
				buckets.add(null);
			for (HashEntry<K, V> headNode : temp) {
				while (headNode != null) {
					put(headNode.key, headNode.value);
					headNode = headNode.next;
				}
			}
		}
	}

}
