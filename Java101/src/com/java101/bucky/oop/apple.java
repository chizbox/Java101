package com.java101.bucky.oop;

/*
 * Polymorphism Example
 */
public class apple {

	public void polyMorph_1(){
		food bucky[] = new food[2];
		bucky[0] = new potpie();
		bucky[1] = new tuna();
		
		for(int x = 0; x<2; ++x){
			bucky[x].eat();
		}
	}
	
	public static void polyMorph_2(){
		fatty bucky = new fatty();
		food fo = new tuna();
		food po = new potpie();
		
		bucky.digest(fo);
		bucky.digest(po);
	}
	
	public static void main(String[] args) {
		//polyMorph_1();
		polyMorph_2();
	}

}
