
public class LoopStatement {
	
	/**
	 * @param args
	 */
	public static void main(String [] args){
		
		//for loop
		for(int i=1; i<11; i++){
			System.out.println("Count is: " + i);
		}
		
		//enhanced for
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		for (int item : numbers) {
			System.out.println("Count is: " + item);
		}
	
		
		//do..while loop
		int x= 10;
	    do{
	    	System.out.print("value of x : " + x );
	    	x++;
	    	System.out.print("\n");
	    }while( x < 20 );
		
	    //while loop
	    while( x < 20 ){
	         System.out.print("value of x : " + x );
	         x++;
	         System.out.print("\n");
	    }
	    
		
		
	}

}
