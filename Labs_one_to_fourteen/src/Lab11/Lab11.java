package Lab11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab11 {

	
	public static List<String> nameList (List<Person> persons)
	{
		List<String> names = new ArrayList<String>();
		for(Person p : persons)
		{
			names.add(p.getFirst());
		}
		return names;
	}
	
	public static Person iteratorFun (List<Person> persons)
	{
		int oldest = 0;
		Person oldestPerson = null;
		Iterator<Person> iterator = persons.iterator();
		while(iterator.hasNext())
		{			
			 Person p = iterator.next();
	            if (p.getAge() > oldest) {
	               oldest = p.getAge();
	               oldestPerson = p;
	            }
		}
		return oldestPerson;
	}
	
	public static void main (String [] args)
	{
	
			List<Person> persons = new ArrayList<Person>();
			persons.add(new Person("A", "Z", 20) );
			persons.add(new Person("B", "Y", 30));
			persons.add(new Person("C", "X", 40));
			persons.add(new Person("D", "W", 50));
			
			List<String> names = Lab11.nameList(persons);
			for(String name : names)
			System.out.println(name);
			
			Person oldest = Lab11.iteratorFun(persons);
			System.out.println(oldest.getAge());
	}
}
