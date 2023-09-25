package n1Exe2;

public class App {

	public static void main(String[] args) {
		GenericMethods<Person, String, Integer> identityStack = new GenericMethods<>();
		identityStack.print(new Person("name", "surname", 9), "adress", 26587);
		
		GenericMethods<String, String, String> friendsPhoto = new GenericMethods<>();
		friendsPhoto.print("Flocky", "Brutus", "Petra");
		
		GenericMethods<Integer, Integer, Integer> beingDigital = new GenericMethods<>();
		beingDigital.print(100111, 100010, 110001);
	}

}
