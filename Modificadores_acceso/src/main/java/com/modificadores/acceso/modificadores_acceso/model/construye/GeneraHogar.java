package com.modificadores.acceso.modificadores_acceso.model.construye;

import com.modificadores.acceso.modificadores_acceso.model.casa.Persona;
import com.modificadores.acceso.modificadores_acceso.model.jardin.Mascota;

public class GeneraHogar {
	
	public static void main(String[] args) {
		
		Persona padre = new Persona();
		Persona madre = new Persona();
		Persona hijo = new Persona();
		
		padre.setNombre("Juan");
		padre.setApellido("Mendez");
		padre.setEdad(30);
		padre.setSexo('M');
		
		Mascota perro = new Mascota();
		System.out.println("El perro esta " + perro.dormir());
	
		
		
	}

}
