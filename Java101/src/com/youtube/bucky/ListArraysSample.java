package com.youtube.bucky;

import java.util.Arrays;
import java.util.LinkedList;

public class ListArraysSample {

	public static void main(String[] args) {
		String [] stuff ={"babies","watermelong","melons","fudge"};
		//pass the array as list
		LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));
		
		theList.add("pumpikinf");
		theList.addFirst("firstthing");
		
		//convert back to an array
		stuff = theList.toArray(new String[theList.size()]);
		
		for(String x: stuff){
			System.out.printf("%s ", x);
		}
	}

	
	
}
