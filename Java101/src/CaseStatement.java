
public class CaseStatement {


	public static void main(String[] args) {
		
		int num = 1;
		String month = "";
		
		switch(num){
			case 1: month = "January";
			break;
			case 2: month = "February";
			break;
			case 3: month = "March";
			break;
			default: month = "Invalid Month";
		}
		
		System.out.println("Your Month is: " + month);
		

	}

}
