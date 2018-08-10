# Hash Table Implementation
Hash Table data structure implemented using ArrayList.

### List of Methods. [ put(), get(), isEmpty() and size() ] 

 - put(key, value)
 	Add `key` and `value` into Hash Table. The below example to put operation\n
 	```
 	HashTable<String, String> hashTable = new HashTable<String, String>();
	hashTable.put("k1","One");
	hashTable.put("k1","Two");
	```
 - get(key)
	Get the Object from HashTable based on key.\n
	```
	HashTable<String, String> hashTable = new HashTable<String, String>();
	hashTable.put("k1","One");
	//Get Object
	hashTable.get("k1");
	```
- isEmpty()
  Check Hash Table is empty or not. It returns boolean value true or false.\n
  ```
   HashTable<String, String> hashTable = new HashTable<String, String>();
   hashTable.isEmpty();
   ```	  
- size()
  This method return the size. The default size is zero.\n
 ```
  HashTable<String, String> hashTable = new HashTable<String, String>();
  hashTable.size();
 ```	
	  
## Java files
- [HashTable.java](HasTable.java)
- [HashTableTest](HashTableTest.java) 

# Find the possible largest sum in NxN Matrix
Calculated largest sum in NxN matrix using Kadane's Algorithm[Kadane's_algorithm)(https://en.wikipedia.org/wiki/Maximum_subarray_problem#Kadane's_algorithm)

## Java files
- [FindLargestSum.java](FindLargestSum.java)
- [FindLargestSumTest](FindLargestSumTest.java)
	