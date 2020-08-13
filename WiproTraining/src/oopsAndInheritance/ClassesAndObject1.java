package oopsAndInheritance;

class Box
{
	// class attributes
	protected int width;
	int height;
	int depth;
	Box(int width, int height, int depth) // methods are behavior
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	int volume()
	{
		return width * height * depth ;
	}
}
public class ClassesAndObject1 
{
	public static void main(String[] args) 
	{
		// creating box class and create contructor and method. Method return volume of box
		Box b = new Box(4, 5, 6);
		System.out.println(b.width); // if width is private than it can not be access out side the class
		System.out.println(b.height);
		System.out.println(b.depth);
		System.out.println(b.volume());
	}
}
