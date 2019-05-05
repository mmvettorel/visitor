package com.test;

import java.util.Arrays;
import java.util.List;

public class Contenedor {
	
	private List<? extends Persona> listaPer;
	
	public Contenedor(Medico... medicos) {
		List<Medico> medList = Arrays.asList(medicos);
		listaPer = medList;
	}
	
	public Contenedor(String mensaje, Licenciado... licenciados) {
		System.out.println(mensaje);
		List<Licenciado> licList = Arrays.asList(licenciados);
		listaPer = licList;
	}

	public List<? extends Persona> getPersona() {
		return listaPer;
	}

}
