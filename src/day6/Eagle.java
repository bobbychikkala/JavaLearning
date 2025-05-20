package day6;

public class Eagle extends Animal implements Flyable {

	
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println(getClassName()+" Makes sound");
		
		
	}


	private String getClassName() {
		return this.getClass().getSimpleName();
	}

	
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(getClassName()+ " can fly");
	}
	
	
	
	}


