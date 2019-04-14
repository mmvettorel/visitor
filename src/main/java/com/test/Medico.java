package com.test;

public class Medico extends Persona {
	
	public Medico(int id, String nombre, int dni, EspecialidadMedica especialidad) {
		super(id, nombre, dni);
		this.especialidad = especialidad;
	}

	private EspecialidadMedica especialidad;

	public EspecialidadMedica getEspecialidad() {
		return especialidad;
	}

	@Override
	public String toString() {
//		return "Medico [especialidad=" + especialidad + ", toString()=" + super.toString() + "]";
		return "Medico: " + super.toString() + ", especialidad=" + especialidad;
	}
	
	
}
