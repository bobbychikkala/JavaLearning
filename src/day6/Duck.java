package day6;

public class Duck extends Animal  implements Flyable,Swimmable {

	@Override
	public void fly() {
		System.out.println("Ducks can fly");

	}

	@Override
	public void makesound() {
		System.out.println("Duck makes sound");

	}

	@Override
	public void swim() {
		System.out.println("Ducks can swim");// TODO Auto-generated method stub

	}

}
