package AllConcepts;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava2 {

	public static void main(String[] args) {

		int[]arr2 =  {1,24,9,6,20,28,36};

		for (int i=0; i<arr2.length; i++)
		{
		if (arr2[i] % 2 == 0)
		{
		System.out.println(arr2[i]);
		// break;
		}
		else
		{
		System.out.println(arr2[i] + " Not multiple by 2 value");
		}

		}

		//ArrayList
		//Crate object of the class - object.method
		//object (variable) for normal array used class length
		//object (variable) for ArraList used class size

		ArrayList<String> a = new ArrayList<String>();
		a.add("Adish");
		a.add("Ramesh");
		a.add("Rnajana");
		a.add("Chaudhari");
		// a.remove(2);

		System.out.println(a.get(1));
		System.out.println(a.get(2));


		// normal for loop
		for (int i=0; i<a.size();i++)
		{
		System.out.println(a.get(i));
		}
		System.out.println("*****************");

		//enhanced for loop
		for (String val :a)
		{
		System.out.println(val);
		}

		//item is present inArrayList
		System.out.println(a.contains("Adish"));

		//convert normal array to ArrayList
		String[] name = {"Adish", "Ramesh", "Ranjana", "Chaudhari"};
		List<String> nameArryList = Arrays.asList(name);
		System.out.println(nameArryList.contains("Nikita"));
		}

		}



