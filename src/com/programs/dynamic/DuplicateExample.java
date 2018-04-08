package com.programs.dynamic;

import java.util.ArrayList;
import java.util.List;

public class DuplicateExample {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		String str ="Azhakesan";
		char toarr[] = str.toCharArray();
		for(int i=0;i<toarr.length;i++) {
			System.out.println(toarr[i]);
				}
		for (int i = 0; i < 10; i++) {
			intList.add(i);
		}
		intList.add(5);
		System.out.println(intList);

	}
}
