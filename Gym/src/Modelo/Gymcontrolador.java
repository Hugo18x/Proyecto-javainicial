package Modelo;
 import Modelo.Entrenador;
 import Modelo.EntrenadoresEnum; 
public class Gymcontrolador {
private Entrenador[] listaEntrenadores;

public Gymcontrolador() {
this.listaEntrenadores = new Entrenador[4];
this.listaEntrenadores[0] = new Entrenador (EntrenadoresEnum.Lucas, CategoriaEnum.Mosca, CategoriaEnum.Gallo);
this.listaEntrenadores[1] = new Entrenador (EntrenadoresEnum.Pepito, CategoriaEnum.Pluma, CategoriaEnum.Ligero);
this.listaEntrenadores[2] = new Entrenador (EntrenadoresEnum.Walter, CategoriaEnum.Welter, CategoriaEnum.Mediano);
this.listaEntrenadores[3] = new Entrenador (EntrenadoresEnum.Jose, CategoriaEnum.Mediopesado, CategoriaEnum.Pesado);

}
 

}
