
public class StringManip {
	
	public static void main(String [] args){
		
		String anotherPalindrome = "Niagara. O roar again!"; 
		//char aChar = anotherPalindrome.charAt(9);
		char aChar = anotherPalindrome.charAt(20);
		System.out.println(aChar);
		
		String anotherPalindrome2 = "Niagara. O roar again!";
		String roar = anotherPalindrome2.substring(16,21);
		System.out.println(roar);
		
		System.out.println(anotherPalindrome2.length());
	}
}
