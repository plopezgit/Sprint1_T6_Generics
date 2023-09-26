package n3exe1;

public class Generic {

	public <T extends Phone> String generic1 (T t) {
		return t.call();
	}
	
	public <T extends Smartphone> void generic2 (T t) {
		System.out.println(t.call());
		System.out.println(t.takeAPicture());
	}
}
