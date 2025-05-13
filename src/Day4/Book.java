package Day4;

public class Book {
	
	String author ;
	double price ;
	
	
	//Parameter constructor
	public Book(String author,double price)
	{
		this.author = author ;
		this.price = price ;
	}
	
	public void display() {
		
		System.out.println(String.format("Author Name is %s",this.author));
		System.out.println(String.format("Price of the Book is %.2f", this.price));
	}

}
