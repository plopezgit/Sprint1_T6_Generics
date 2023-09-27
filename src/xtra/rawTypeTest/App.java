package xtra.rawTypeTest;

public class App {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		GenericClass rawIdentityStack = new GenericClass();
		rawIdentityStack.print("name");
		
		/*The term "unchecked" means that the compiler 
		 * does not have enough type information to perform all type checks necessary 
		 * to ensure type safety. 
		 * 
		 * The @SuppressWarnings("unchecked") annotation suppresses unchecked warnings. 
		 * If you are unfamiliar with the @SuppressWarnings syntax, see Annotations.
		 * (S1T7) 
		 *
		 */

	}

}
