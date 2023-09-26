package n2Exe1;

import n2exe2.GenericMethods;
import n2exe2.Person;

public class App {

	public static void main(String[] args) {
		GenericMethods<String, Integer> identityStack = new GenericMethods<>();
		identityStack.print("adress", 26587, new Person("name", "surname", 9));
		
		GenericMethods<String, String> friendsPhoto = new GenericMethods<>();
		friendsPhoto.print("Flocky", "Brutus", new Person("Petra", "Petrica", 2));
		
		GenericMethods<Integer, Integer> beingDigital = new GenericMethods<>();
		beingDigital.print(100111, 100010, new Person("Nic", "Neg",  110001));
		
	}

}
