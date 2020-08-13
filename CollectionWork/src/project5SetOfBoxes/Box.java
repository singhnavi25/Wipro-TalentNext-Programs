package project5SetOfBoxes;



public class Box implements Comparable<Box>
{
	private double length;
	private double width;
	private double height;
	public Box() {}

	public Box(double length, double width, double height) 
	{
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public double getLength() 
	{
		return length;
	}
	public void setLength(double length) 
	{
		this.length = length;
	}
	public double getWidth() 
	{
		return width;
	}
	public void setWidth(double width) 
	{
		this.width = width;
	}
	public double getHeight() 
	{
		return height;
	}
	public void setHeight(double height) 
	{
		this.height = height;
	}
	public double getVolume()
	{
		return this.height * this.length * this.width;
	}
	@Override
	public String toString() 
	{
		return String.format("length = " + length + ", width = " + width + 
				", height = " + height + ", Volume = %.2f", this.getVolume());
	}
	
	@Override
	public int compareTo(Box other) 
	{
		if (this.getVolume() > other.getVolume()) 
			return 1;
		else if(this.getVolume() < other.getVolume())
			return -1;
		return 0;
	}
	
	@Override
	public int hashCode()
	{
		return String.valueOf(this.getVolume()).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		return (obj instanceof Box) && ((Box)obj).getVolume() == this.getVolume();
	}
	
}
