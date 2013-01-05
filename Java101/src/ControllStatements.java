
public class ControllStatements {
	public static void main (String args[]){
		//If
		int num = 5;
		if(num <3){
			System.out.println("Under 3");
		}
		else if(num ==3){
			System.out.println("Equals 3");
		}
		else{
			System.out.println("Over 3");
		}
		
		//Switch Statement
		int month = 10;
	    String monthString;
	    switch (month) {
	    	case 1:  monthString = "January";
	    		break;
	        case 2:  monthString = "February";
	        	break;
	        case 3:  monthString = "March";
	            break;
	        case 4:  monthString = "April";
	            break;
	        case 5:  monthString = "May";
	            break;
	        case 6:  monthString = "June";
	            break;
	        case 7:  monthString = "July";
	            break;
	        case 8:  monthString = "August";
	            break;
	        case 9:  monthString = "September";
	            break;
	        case 10: monthString = "October";
	            break;
	        case 11: monthString = "November";
	            break;
	        case 12: monthString = "December";
	            break;
	        default: monthString = "Invalid month";
	            break;
	    }
	    
	    System.out.println("the month is: " + monthString);
	    
	    
	    //Switch Statement 
	    String quarter; 
	    switch(month){
	    	case 1: case 2: case 3: 
	    		quarter = "First Quarter"; 
	    		break;
	    	
	    	case 4: case 5: case 6: 
	    		quarter = "Second Quarter";
	    		break;
	    		
	    	case 7: case 8: case 9:
	    		quarter = "Third Quarter";
	    		break;
	    	
	    	case 10: case 11: case 12: 
	    		quarter = "Fourth Quarter";
	    		break;
	    	default: quarter = "Invalid Quarter";
	    }

	    System.out.println("Current Quarter is: " + quarter);
	}    
}
