package n3exe1;

public class App {

	public static void main(String[] args) {
		
		Generic generic = new Generic();
		
		System.out.println(generic.phoneTest1(new Smartphone("sunset", "657474632")));
		
		generic.phoneTest2(new Smartphone("sunset", "657474632"));
	
		/*
		 * En el main() de la clase Principal, pasa un objeto de la clase Smartphone 
		 * a los dos métodos genéricos de la clase Generica. (OK)
		 * 
		 * ¿El método limitado por la interfaz Telefon, 
		 * de la clase Generica, puede llamar al método hacerFotos()? - SI, intanciando un objecto que la implemente
		 */
		
	}
}
