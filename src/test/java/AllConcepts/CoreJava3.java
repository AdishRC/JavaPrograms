package AllConcepts;

public class CoreJava3 {

	public static void main(String[] args) {

		

		//String is an object that represents the sequence of characters

		//String literal

		String s1 = "Adish Chaudhari";



		

		//using new memory allocate operator

		String s5 = new String ("Welcome");

		String s6 = new String ("Welcome");

		

		String s = "Adish Ramesh Chaudhari";

		String [] splittedstring = s.split(" ");

		System.out.println(splittedstring[0]);

		System.out.println(splittedstring[1]);	

		System.out.println(splittedstring[2]);

		System.out.println("*************");

		

		for (int i=0; i<s.length(); i++)

		{

			System.out.println(s.charAt(i));

		}

		

		for (int i= s.length()-1; i>=0 ; i--)

		{

			System.out.println(s.charAt(i));

		}



	}



}

    
