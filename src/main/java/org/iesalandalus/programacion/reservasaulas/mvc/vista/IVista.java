package org.iesalandalus.programacion.reservasaulas.mvc.vista;

import org.iesalandalus.programacion.reservasaulas.mvc.controlador.Controlador;

public interface IVista {

	//Método que setea el controlador una vez se instancie
	void setControlador(Controlador controlador);

	//Método comenzar, que muestra el menú, nos da a elegir una opción, pasa dicha opción por el método getOpcionSegunOrdinal para validar que el ordenal
	//sea correcto, lo transforma en una Opcion y luego la ejecuta. Todo ello se repetirá mientras la Opcion elegida no sea SALIR
	void comenzar();

	//Método que llama al método terminar del controlador y da un mensaje de despedida
	void salir();

}