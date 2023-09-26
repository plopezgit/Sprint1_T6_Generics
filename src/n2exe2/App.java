package n2exe2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		/*ArrayList<String> adressStack = new ArrayList<>();
		adressStack.add("18005");*/
		
		/*ArrayList<Integer> adressStack = new ArrayList<>();
		adressStack.add(18005);*/
		
		ArrayList<Person> adressStack = new ArrayList<>();
		adressStack.add(new Person("name2", "surname2", 12));
		adressStack.add(new Person("name3", "surname3", 14));

		GenericMethods identityStack = new GenericMethods();
		identityStack.print(adressStack, new Person("name", "surname", 9));
		
	}

}
