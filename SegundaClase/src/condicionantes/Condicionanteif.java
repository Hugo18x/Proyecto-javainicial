package condicionantes;

public class Condicionanteif {

	
	public static void main(String[] args) {
		System.out.println("Hola Usuario");
		int valor =-18;
		
		if(valor <0) {
               	// bloque de condicion si se cumple
                // la condicion			
		System.out.println("valor es negativo");
		
		} else if (valor >0) {
			System.out.println("valor es positivo");
		} else {
			System.out.println("valor es cero");
		}
		System.out.println("el valor es: " + valor + " <- ese fue valor");
	}	
		
}
