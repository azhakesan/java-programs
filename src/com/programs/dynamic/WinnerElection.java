/**
 * 
 */
package com.programs.dynamic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 */
public class WinnerElection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String votes[] = { "john", "johnny", "jackie", "johnny", "john",
				"jackie", "jamie", "jamie", "john", "johnny", "jamie",
				"johnny", "john" };
		Map<String, Integer> count = new HashMap<String, Integer>();
		String winner = null;
		int voteCount = 0;
		for (int i = 0; i < votes.length; i++) {
			if (count.containsKey(votes[i])) {
				count.put(votes[i], count.get(votes[i]) + 1);
			} else {
				count.put(votes[i], 1);
			}
		}
		for (Map.Entry<String, Integer> e : count.entrySet()) {
			System.out.println(e.getKey() +" "+e.getValue());
			if (e.getValue()>voteCount) {
				voteCount = e.getValue();
				winner = e.getKey();
			}
		}
		System.out.println(winner);
		
		Map<String, Integer> sort= new TreeMap();
		sort.putAll(count);
		System.out.println("------------------------------");
		for (Map.Entry e :sort.entrySet()) {
			System.out.println(e.getKey() +" "+e.getValue());
		}
	}
}
