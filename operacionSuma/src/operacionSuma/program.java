package operacionSuma;

public class program {
	public static void main(String[] args) {
		sumaEnteros sum = new sumaEnteros(-3, 7);
		mostrar(sum);
		
		

	}
	public static void mostrar (sumaEnteros suma) {
		System.out.println(suma.sumar());
	}

}
