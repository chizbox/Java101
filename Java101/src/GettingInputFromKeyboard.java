import java.util.Scanner;


public class GettingInputFromKeyboard {
	
	public static void main(String [] args){
		System.out.println("Inputs: ");
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		System.out.println("You have Entered: " + num1);
	}
}
