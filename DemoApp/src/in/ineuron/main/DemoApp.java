package in.ineuron.main;

public class DemoApp {

	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40};
		for(int elem : a) 
		{
			System.out.print(elem+" ");
		}
		System.out.println();
		String name="dhoni";
		int count=name.toUpperCase().length();
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println("The lenght of the String is :: "+count);
		
	}

}
