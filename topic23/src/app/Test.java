package app;

public class Test {

	public static void main(String[] args) {
		
		Person person1 = new Person("Rolando", "Fender");
		Person person2 = new Person("Rolando", "Fender");
		Person person3 = new Person(person1);
		
		if(person1 == person2) 
			System.out.println("They are the same person");
		else
			System.out.println("They are not the same people");
		
		if(person1.equals(person2)) 
			System.out.println("They are the same person");
		else
			System.out.println("They are not the same people");
		
		if(person1.equals(person3)) 
			System.out.println("They are the same person");
		else
			System.out.println("They are not the same people");
		
		System.out.println(person1);
		System.out.println(person2.toString());
		System.out.println(person3);
	}

}
