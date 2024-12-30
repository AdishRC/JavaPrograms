package AllConcepts;

public class CoreJava {

public static void main(String[] args) throws InterruptedException {

		

		//Data Type

		int num = 5;

		double value = 3.4657;

		String word = "Adish Ramesh Chaudhari";

		char sentense = 'A';

		boolean type = false;		

	//	System.out.println("decimal value "+ value );

		

		//Arrays 1st method

		int[] arr  = new int[5];

		arr [0] = 1;

		arr [1] = 7;

		arr [2] = 18;

		arr [3] = 22;

		arr [4] = 42;	

	// System.out.println(arr [2] );

		

		//Arrays 2nd method

		int[] arr2 =  {4, 7, 12, 19, 24, 65, 88, 92, 102};		

	//	System.out.println(arr2 [3]);

		

		// for loop (arr.length - 6)

//		for (int i=0; i< arr.length; i++)

//		{

//			System.out.println(arr[i]);

//		}

		

		

//		for (int i=0; i<arr2.length; i++)

//		{

//			System.out.println(arr2 [i]);

//		}

		

		String[] name = {"Adish", "Ramesh", "Ranjana", "Chaudhari"};

		for (int i=0; i<name.length; i++)

		{

			System.out.println(name [i]);

			

		}

			

	}

	
}
