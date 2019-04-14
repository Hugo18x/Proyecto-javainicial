package Modelo;

public class Entrenador {
	
private Boxeador[] listaBoxeador;
private EntrenadoresEnum  nombre;
private int cont =0;
public CategoriaEnum getCategoria;

public Entrenador(EntrenadoresEnum nombre) {
this.listaBoxeador = new Boxeador[5];
this.nombre=nombre;
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
		
}