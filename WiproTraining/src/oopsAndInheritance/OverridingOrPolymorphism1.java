package oopsAndInheritance;

class Fruit
{
	String name;
	String taste;
	int size; // in cm
	Fruit()
	{
		this.name = this.taste = "unknown";
		this.size = 0;
	}
	Fruit(String name, String taste, int size)
	{
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
	void eat()
	{
		System.out.println(name + "\t" + taste);
	}
}
class Apple extends Fruit
{
	Apple()
	{
		super("Apple", "sweet", 8);
	}
	void eat()
	{
		super.eat();
	}
}
class Orange extends Fruit
{
	Orange()
	{
		super("Orange", "Sweet-tart", 7);
	}
	void eat()
	{
		super.eat();
	}
}
public class OverridingOrPolymorphism1 
{
	public static void main(String[] args) 
	{
		Apple ap = new Apple();
		ap.eat();
		Orange or = new Orange();
		or.eat();
	}
}
