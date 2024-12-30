package AllConcepts;

public class MethodsDemo {

	public static void main(String[] args) {

		

		MethodsDemo d  = new MethodsDemo();

		String name = d.getData();

		System.out.println(name);

		

		MethodsDemo2 d1 = new 	MethodsDemo2();

		d1.getUserData();

		

		getData2();

	}


	// Void ==== method does not returning
	// int / String ==== method returning int / String	


	public String getData()

	{

		System.out.println("Hello World");

		return "Aish Chaudhari";

	}


	public static String getData2()

	{

		System.out.println("I Love My India");

		return "Aish Chaudhari";

	}

}

