package Modelo;

import java.util.Scanner;

public class Gimnasio {		
	public static void main(String[] args) {	
Scanner scan = new Scanner(System.in);
Boxeador boxeadores[] = new Boxeador[2]; 
System.out.println("Bienvenido al Gym de Boxeadores");
for(int i =0; i < 2; i ++) {
Boxeador box = new Boxeador();

System.out.println("---------------------");
System.out.println("Ingrese su nombre: ");
String nombre= scan.next();
box.setNombre(nombre);

System.out.println("---------------------");
System.out.println("Ingrese su peso: ");
int peso = scan.nextInt();
box.setPeso(peso);

System.out.println("---------------------");

boxeadores[i]= box;
System.out.println(nombre + " " + peso);
}
 

}
}

