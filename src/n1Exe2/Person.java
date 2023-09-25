package n1Exe2;

public class Person {
	
	private String personName;
	private  String personSurName;
	private int personAge;
	
	public Person(String personName, String personSurName, int personAge) {
		this.personName = personName;
		this.personSurName = personSurName;
		this.personAge = personAge;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonSurName() {
		return personSurName;
	}

	public void setPersonSurName(String personSurName) {
		this.personSurName = personSurName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	@Override
	public String toString() {
		return "Person [Name=" + personName + ", Surname=" + personSurName + ", Age=" + personAge
				+ "]";
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
	 */

}
