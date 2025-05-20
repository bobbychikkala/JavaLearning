package day5;

public class UserCalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student sd = new Student();
		sd.markAttendence();
		sd.attendLecture();
		sd.submitProject();
		
		Teacher tc = new Teacher();
		tc.deliverLecture();
		tc.evaluateProject();
		tc.markAttendence();
	}

}
