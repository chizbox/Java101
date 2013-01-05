package com.youtube.bucky;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionSort {

	public static void main(String[] args) {
		
		String[] crap = {"apples","lemons","geese","bacon","youtube"};
		List<String> l1 = Arrays.asList(crap);
		
		Collections.sort(l1);
		System.out.printf("%s\n",l1);
		
		Collections.sort(l1, Collections.reverseOrder());
		System.out.printf("%s\n",l1);
		
		
		//create an array and convert to list
		//Collections.copy(listCopy,l);
		//Collections.fill(l,'X');
		//Collections.frequency
		//Collections.disjoint, search if anything is in common
		
	}

	private static void output(List<Character> thelist){
		
		for(Character thing:thelist){
			System.out.printf("%s ", thing);
		}
			
	}
	
}
