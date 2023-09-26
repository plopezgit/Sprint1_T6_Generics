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
		return "Person [Name: " + personName + ", Surname: " + personSurName + ", Age: " + personAge
				+ "]";
	}

}
