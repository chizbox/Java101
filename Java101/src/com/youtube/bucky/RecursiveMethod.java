package com.youtube.bucky;

public class RecursiveMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fact(5));
	}
	
	//Method Recurssion factorial Sample
	public static long fact(long n){
		if(n <= 1){
			return 1; //Base Case
		}else{
			return n * fact(n-1); //calls the recursive method
		}
	}

}
