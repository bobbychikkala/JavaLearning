package Day2;

public class SwitchCase {

	public static void main(String[] args) 
	{
		String day = weekDay(7);
		System.out.println(day);
		System.out.println(monthName(9));
	}
	
	static String weekDay(int dayNumber) 

	{
		
		switch(dayNumber) 
		{
		case 1 :
			return "Sunday";
		case 2 :
			return "Monday";
		case 3 :
			return "Tuesday";
		case 4 :
			
			return "Wednesday";
		case 5 :
			return "Thursday";
		case 6 :
			return "Friday";
		case 7 :
			return "Saturday";
		default:
			System.out.println("Invalid number");
			return "Invalid number";
		
		}
		
		
	}


static String monthName(int MonthNumber) 

{
	
	switch(MonthNumber) 
	{
	case 1 :
		return "January";
	case 2 :
		return "Febuary";
	case 3 :
		return "March";
	case 4 :	
		return "April";
	case 5 :
		return "May";
	case 6 :
		return "June";
	case 7 :
		return "July";
	case 8 :	
		return "August";
	case 9 :
		return "September";
	case 10 :
		return "October";
	case 11 :
		return "November";
	case 12 :
		return "December";
	default:
		System.out.println("Invalid number");
		return "Invalid number" ;
	
	}
	
	
}
}
