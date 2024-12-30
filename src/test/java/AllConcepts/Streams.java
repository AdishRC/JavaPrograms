package AllConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams {

	//	@Test
	public void regular() {

		// Count the number of names starting with alphabet A in list
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;

		for (int i=0; i<names.size(); i++)
		{
			String actual = names.get(i);
			if (actual.startsWith("A"))
			{
				count++;
			}
		}

		System.out.println(count);

	}

	//===================================Stream Filter========================================================================	
	//@Test
	public void streamFilter() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		// there is no life for intermediate op if there is no terminal op 
		// terminal op will execute only if enter op (filter) return true
		// we can create stream
		// how to use filter in stream API
		Long c= names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);

		Long d=	Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);

		//find name which is character lenght greater than 4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}


	//@Test
	public void map() {
		//print names which have last letter as "a" with uppercase
		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));

		// print names which have first letter as a with uppercase and sorted
		List<String> names= Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Rama");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		//============================== Merging 2 different list ===================================================
		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("Men");
		name1.add("Don");
		name1.add("Women");
		
		Stream<String> newstream= Stream.concat(names.stream(), name1.stream());
		boolean flag= newstream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		//newstream.sorted().forEach(s->System.out.println(s));
	}

	@Test
	public void streamCollect() {
		List<String> ls = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer>values = Arrays.asList(1,4,6,8,4,1,9);
		// print unique number in te array list
		values.stream().distinct().forEach(s->System.out.println(s));
		
		// sort the array 3 index
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}
}

