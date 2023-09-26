package n2Exe1;

public class App {

	public static void main(String[] args) {
		GenericMethods identityStack = new GenericMethods();
		identityStack.print("adress", 26587, new Person("name", "surname", 9));
		
		GenericMethods friendsPhoto = new GenericMethods();
		friendsPhoto.print("Flocky", "Brutus", new Person("Petra", "Petrica", 2));
		
		GenericMethods beingDigital = new GenericMethods();
		beingDigital.print(100111, 100010, new Person("Nic", "Neg",  110001));
		
	}

}
