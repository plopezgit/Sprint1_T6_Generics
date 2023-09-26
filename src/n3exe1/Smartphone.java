package n3exe1;

public class Smartphone implements Phone {
	
	private String target;
	private String contactNumber;
	
	public Smartphone(String target, String contactNumber) {
		this.target = target;
		this.contactNumber = contactNumber;
	}

	public String takeAPicture () {
		return "taking a photo of " + target;  
	}
	
	@Override
	public String call() {
		return "calling to " + contactNumber;
	}

}
