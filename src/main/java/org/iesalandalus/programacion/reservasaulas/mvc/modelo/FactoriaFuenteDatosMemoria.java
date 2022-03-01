package org.iesalandalus.programacion.reservasaulas.mvc.modelo;

import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.IAulas;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.IProfesores;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.IReservas;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.memoria.Aulas;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.memoria.IFuenteDatos;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.memoria.Profesores;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.memoria.Reservas;

public class FactoriaFuenteDatosMemoria implements IFuenteDatos {
	//Constructor vacío
	public FactoriaFuenteDatosMemoria() {
	}
	
	@Override
	public IAulas crearAulas() {
		IAulas aulas=new Aulas();
		return aulas;
	}
	
	@Override
	public IProfesores crearProfesores() {
		IProfesores profesores=new Profesores();
		return profesores;
	}
	
	@Override
	public IReservas crearReservas() {
		IReservas reservas=new Reservas();
		return reservas;
	}
}
