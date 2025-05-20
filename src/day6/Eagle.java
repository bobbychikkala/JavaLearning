package day6;

public class Eagle extends Animal implements Flyable {


	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(getClassName()+ " can fly");
	}


	private String getClassName() {
		return this.getClass().getSimpleName();
	}


	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println(getClassName()+" Makes sound");


	}



	}


