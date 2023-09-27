package xtra.rawTypeTest;

public class App {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		GenericMethods rawIdentityStack = new GenericMethods();
		rawIdentityStack.print("name");

	}

}
