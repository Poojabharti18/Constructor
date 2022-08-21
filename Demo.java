package constructor;

public class Demo {
	int x;
	Demo() //default constructor
	{
		x=13;
		System.out.println(x);
	}
	Demo (int temp) //Parameter constructor
	{
		x=temp;
		System.out.println(x);
	}
 
}
