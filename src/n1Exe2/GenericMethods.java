package n1Exe2;

public class GenericMethods {
	
	public <T, S, U> void print(T t, S s, U u) {
		System.out.println("args: " + t + s + u);
	}

	/*
	 * Crea una clase llamada Persona con los atributos nombre, apellido y edad. 
	 * Después crea una clase llamada GenericMethods cuyo método genérico acepte 
	 * tres argumentos de tipo genérico. Este método sólo debe imprimir 
	 * por pantalla los argumentos que ha recibido. En el main() de la clase principal, 
	 * llama al método genérico con diferentes tipos de parámetros.
	 * 		Ejemplo: un objeto de la clase Persona, un String y un tipo primitivo.
	 * 		De esta forma has comprobado que se le puede pasar cualquier tipo de 
	 * 		parámetro y en cualquier orden.
	 * 
	 * Notes:
	 * In a nutshell, generics enable types (classes and interfaces) to be parameters 
	 * when defining classes, interfaces and methods. 
	 * Much like the more familiar formal parameters used in method declarations, 
	 * type parameters provide a way for you to re-use the same code with different 
	 * inputs. 
	 * The difference is that the inputs to formal parameters are values, 
	 * while the inputs to type parameters are types.
	 * 
	 * many benefits includes: 
	 * 
	 * (1)Stronger type checks at compile time.
	 * A Java compiler applies strong type checking to generic code 
	 * and issues errors if the code violates type safety.
	 * Fixing compile-time errors is easier than fixing runtime errors, 
	 * which can be difficult to find
	 * (2)Elimination of casts. When re-written to use generics, 
	 * the code does not require casting
	 * (3)Enabling programmers to implement generic algorithms.
	 * By using generics, programmers can implement generic algorithms 
	 * that work on collections of different types, 
	 * can be customized, and are type safe and easier to read.
	 *
	 * Generic version of the Box class:
	 
		public class Box<T> {
    		// T stands for "Type"
    		private T t;

    	public void set(T t) { this.t = t; }
    	public T get() { return t; }
		}
		
		As you can see, all occurrences of Object are replaced by T. 
		A type variable can be any non-primitive type you specify: 
		any class type, 
		any interface type, 
		any array type, 
		or even another type variable.
		This same technique can be applied to create generic interfaces.
		
		The most commonly used type parameter names are:

		E - Element (used extensively by the Java Collections Framework)
		K - Key
		N - Number
		T - Type
		V - Value
		S,U,V etc. - 2nd, 3rd, 4th types
		
		Using generic methods. Just like type declarations, method declarations can be generic—that is, 
		parameterized by one or more type parameters.

		static <T> void print(T a, T b, Tc) {
    	System.out.println("args: " + a + b + c);
    	}
    	
	 * 
	 */
	
}
