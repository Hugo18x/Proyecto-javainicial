package Modelo;

public class Clasificador {

public static CategoriaEnum getCategoria (double peso) {
 
	if( peso > 48.988 && peso <52.163) {
	return  CategoriaEnum.Mosca;
	} else if( peso >=52.163 && peso < 55.338) {
	return CategoriaEnum.Gallo;
	} else if (peso >= 55.338 && peso < 57.152) {
	return CategoriaEnum.Pluma;
	} else if (peso >= 57.152 && peso < 61.237) {
     return CategoriaEnum.Ligero;
	} else if(peso >= 61.237 && peso < 66.678) {
		return CategoriaEnum.Welter;
    } else if (peso >= 66.678 && peso < 72.562)	{
    	return CategoriaEnum.Mediano;
    } else if (peso >= 72.562 && peso <91){
     return CategoriaEnum.Mediopesado;
    } else if (peso >= 91) {
   return CategoriaEnum.Pesado;
	}	
	return CategoriaEnum.Rechazado;

	}

}	