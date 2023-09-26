package n1Exe2;

public class App {

	public static void main(String[] args) {
		GenericMethods identityStack = new GenericMethods();
		identityStack.print(new Person("name", "surname", 9), "adress", 26587);
		
		GenericMethods friendsPhoto = new GenericMethods();
		friendsPhoto.print("Flocky", "Brutus", "Petra");
		
		GenericMethods beingDigital = new GenericMethods();
		beingDigital.print(100111, 100010, 110001);
	}

}
