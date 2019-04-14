package Modelo;
 import Modelo.Boxeador;
 import Modelo.Entrenador;
 import Modelo.EntrenadoresEnum;
import Modelo.Categoria;
import Modelo.CategoriaEnum; 
public class Gymcontrolador {
 private static final String Mosca = null;
private static final String Gallo = null;
private Entrenador[] listaEntrenadores;

public Gymcontrolador() {
this.listaEntrenadores = new Entrenador[4];
this.listaEntrenadores[0] = new Entrenador (EntrenadoresEnum.Lucas);
this.listaEntrenadores[1] = new Entrenador (EntrenadoresEnum.Pepito);
this.listaEntrenadores[2] = new Entrenador (EntrenadoresEnum.Walter);
this.listaEntrenadores[3] = new Entrenador (EntrenadoresEnum.Jose);

}
}