package genrics;

public class GenricClass<T> 
{
	private T t;

	public void add(T t) 
	{
		this.t = t;
	}

	public T get() 
	{
		return t;
	}

	public static void main(String[] args) 
	{
		GenricClass<Integer> integerBox = new GenricClass<Integer>();
		GenricClass<String> stringBox = new GenricClass<String>();

		integerBox.add(new Integer(10));
		stringBox.add(new String("Hello World"));

		System.out.printf("Integer Value :%d\n\n", integerBox.get());
		System.out.printf("String Value :%s\n", stringBox.get());
	}
}
