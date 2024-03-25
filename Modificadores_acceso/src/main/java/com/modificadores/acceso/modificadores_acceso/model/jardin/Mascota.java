package com.modificadores.acceso.modificadores_acceso.model.jardin;

import com.modificadores.acceso.modificadores_acceso.model.casa.Persona;



public class Mascota {
	
	protected String nombre;
	protected String especie;
	protected int edad;
	
	
	String jugar(Persona persona) {
		return persona.lanzarPelota();
		
	}
	
	public String dormir() {
		return "dormido";
	}
	
}
