package com.programs.dynamic;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "al";
		char[] carr = str.toCharArray();
		int c = 0;
		char key;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int j = 0; j < carr.length; j++) {

			key = carr[j];
			System.out.println("key=" + key + ", value=" + map.get(key));
			if (map.containsKey(key)) {
				c = map.get(key);
				c++;
				map.put(key, c);
			} else {
				map.put(key, 1);
			}
		}
		System.out.println(map);

		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				System.out.println(str.charAt(i));
				break;

			}
		}

	}

}
