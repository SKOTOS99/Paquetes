package com.modificadores.acceso.modificadores_acceso.model.jardin;

import com.modificadores.acceso.modificadores_acceso.model.casa.Persona;

public class GeneraJardin {

	public static void main(String[] args) {
		
		Persona padre = new Persona();
		padre.setNombre("Juan");
		padre.setApellido("Mendez");
		padre.setEdad(30);
		padre.setSexo('M');
		
		Mascota perro = new Mascota();
		perro.especie = "can";
		perro.edad = 4;
		perro.nombre = "paco";
		
		System.out.println(perro.jugar(padre));
	}

}
