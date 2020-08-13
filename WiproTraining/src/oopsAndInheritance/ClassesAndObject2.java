package oopsAndInheritance;

class Calculator
{
	static int powerInt(int num1, int num2)
	{
		return (int)Math.pow(num1, num2);
	}
	static double powerInt(double num1, double num2)
	{
		return Math.pow(num1, num2);
	}
}
public class ClassesAndObject2 
{
	public static void main(String[] args) 
	{
		// Creating Calculator class and create two static methods and return the powers num1^num2
		System.out.println(Calculator.powerInt(2, 6));;
		System.out.println(Calculator.powerInt(2, 0.5));
	}
}
