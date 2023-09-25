package n1Exe1;

public class App {

	public static void main(String[] args) {
		NoGenericMethods ngm = new NoGenericMethods(1, 2, 3);
		NoGenericMethods ngm2 = new NoGenericMethods(2, 3, 1);
		NoGenericMethods ngm3 = new NoGenericMethods(3, 1, 2);
		
		System.out.println("NoGenericMethods" + ngm + ngm2 + ngm3);

	}

}
