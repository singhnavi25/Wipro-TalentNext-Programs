package oopsAndInheritance;
class Animal
{
	void eat()
	{
		System.out.println("Animal eat grass or meat");
	}
	void sleep()
	{
		System.out.println("Animal sleep 15 hours a day");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("Bird ear worms");
	}
	void sleep()
	{
		System.out.println("Bird sleep");
	}
	void fly()
	{
		System.out.println("Birds fly on so much height");
	}
}
public class Inheritance1 
{
	public static void main(String[] args) 
	{
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}
}
