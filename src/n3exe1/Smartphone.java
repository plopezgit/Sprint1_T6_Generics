package n3exe1;

public class Smartphone implements Phone {

	public String takeAPicture (String target) {
		return "taking a photo of " + target;  
	}
	
	@Override
	public String call(int number) {
		return "calling to " + number;
	}

}
