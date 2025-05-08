package Day2;

public class SwitchCase {

	public static void main(String[] args) 
	{
		String day = weekDay(7);
		System.out.println(day);
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
			return "Invalid number" ;
		
		}
		
		
	}
}
