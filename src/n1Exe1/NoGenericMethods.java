package n1Exe1;

public class NoGenericMethods {
	
	Integer int1;
	Integer int2;
	Integer int3;
	
	public NoGenericMethods(Integer int1, Integer int2, Integer int3) {
		this.int1 = int1;
		this.int2 = int2;
		this.int3 = int3;
	}

	public Integer getInt1() {
		return int1;
	}

	public void setInt1(Integer int1) {
		this.int1 = int1;
	}

	public Integer getInt2() {
		return int2;
	}

	public void setInt2(Integer int2) {
		this.int2 = int2;
	}

	public Integer getInt3() {
		return int3;
	}

	public void setInt3(Integer int3) {
		this.int3 = int3;
	}

	@Override
	public String toString() {
		return "[int1=" + int1 + ", int2=" + int2 + ", int3=" + int3 + "]";
	}
	
	/*
	 * Crea una clase llamada NoGenericMethods que almacene tres objetos del mismo tipo, 
	 * junto con los métodos para almacenar y extraer estos objetos 
	 * y un constructor para inicializar los tres. 
	 * Comprueba que los argumentos pueden ponerse en 
	 * cualquier posición en la llamada al constructor.
	 */
	
}
