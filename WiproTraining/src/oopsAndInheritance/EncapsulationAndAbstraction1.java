package oopsAndInheritance;

class Author
{
	private String name;
	private String email;
	private char gender;
	public Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public char getGender() 
	{
		return gender;
	}
	public void setGender(char gender) 
	{
		this.gender = gender;
	}
	public String toString() 
	{
	      return "Author Name :" + name + "\ne-Mail :" + email + "\nGender :" + gender;
	}
}
class Book
{
	String bookName;
	Author author;
	double price;
	int qtyInStock;
	protected Book(String bookName, Author author, double price, int qtyInStock) 
	{
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	protected String getBookName() 
	{
		return bookName;
	}
	protected void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}
	protected double getPrice() 
	{
		return price;
	}
	protected void setPrice(double price) 
	{
		this.price = price;
	}
	protected int getQtyInStock() 
	{
		return qtyInStock;
	}
	protected void setQtyInStock(int qtyInStock) 
	{
		this.qtyInStock = qtyInStock;
	}
	public Author getAuthor() 
	{
		return author;
	}
	public String toString() 
	{
	      return "Book Name :"+ bookName + "\nWritten By\n" + author;
	}
}
public class EncapsulationAndAbstraction1 
{
	public static void main(String[] args) 
	{
		Author auth = new Author("Manjot","navicu25@gmail.com", 'M');
		Book b = new Book("Folium", auth, 157.2, 3500);
		System.out.println(b);
	}
}
