package Modelo;

public class Entrenador {
	
private Boxeador[] listaBoxeador;
private EntrenadoresEnum  nombre;
private int cont =0;
public CategoriaEnum getCategoria;
private CategoriaEnum categoria1;
private CategoriaEnum categoria2;
private Boxeador[] listaRechazados;

public Entrenador(EntrenadoresEnum nombre, CategoriaEnum categoria1, CategoriaEnum categoria2) {
this.listaBoxeador = new Boxeador[5];
this.listaRechazados = new Boxeador [20];
this.nombre = nombre;
this.categoria1 = categoria1;
this.categoria2 = categoria2;
}
public EntrenadoresEnum getNombre() {
	
	return nombre;
}

public void setNombre(EntrenadoresEnum nombre) {
	this.nombre = nombre;
}

public Boxeador[] getListaBoxeador() {
	return listaBoxeador;
}


   
public void atiendoBox(Boxeador boxeador) {
if(cont <5) {
this.listaBoxeador[cont]= boxeador;
System.out.println("Su categoria es");
cont++;
} else {

System.out.println("El entrenador llego al maximo de boxeadores");

}

}
public void asignoEntrenador(Boxeador boxeador) {
	
	
}
		
}