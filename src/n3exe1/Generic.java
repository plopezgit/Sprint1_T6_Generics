package n3exe1;

public class Generic {

	public <T extends Phone> void generic1 (T t) {
		t.call(657474632);
	}
	
	public <T extends Smartphone> String generic2 (T t) {
		t.call(657474632);
		return t.takeAPicture("sunset");
	}
}
