package com.modificadores.acceso.modificadores_acceso.model.casa;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Persona {

	String nombre;
	String apellido;
	int edad;
	private char sexo;
	
	public String lanzarPelota() {
		return "lanza pelota";
	}
	
	
}
