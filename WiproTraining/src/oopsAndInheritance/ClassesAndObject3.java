package oopsAndInheritance;
class Patient
{
	String name;
	double weight;
	double height;
	public Patient(String name, double weight, double height)
	{
		this.name = name;
		this.weight = weight; // weight in pounds
		this.height  = height; // height in inches
	}
	double BMI()
	{
		return (weight/(height * height)) * 703;
	}
}
public class ClassesAndObject3 // I give Patients class name as ClassesAndObject3 because of track of assignments
{
	public static void main(String[] args) 
	{
		Patient p1 = new Patient("Navi", 165.347, 74.4);
		System.out.println(p1.BMI());
	}
}
