package com.java101.bucky.oop;

public class AnimalMain {
	public static void main(String[] args){
		
		AnimalList alo = new AnimalList();
		Dog d = new Dog();
		Fish f = new Fish();
		alo.add(d);
		alo.add(f);
		
		//2nd example
		Animal[] theList = new Animal[2];
		
		theList[0] = d;
		theList[1] = f;
		
		for(Animal x: theList ){
			x.noise();
		}
	}
}
