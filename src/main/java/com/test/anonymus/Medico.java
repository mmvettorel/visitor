package com.test.anonymus;

import com.test.EspecialidadMedica;

public class Medico implements IPersona {

	private int id;
	private String nombre;
	private int dni;
	private EspecialidadMedica especialidad;

	public Medico(int id, String nombre, int dni, EspecialidadMedica especialidad) {

		this.id = id;
		this.nombre = nombre;
		this.dni = dni;
		this.especialidad = especialidad;
	}

	@Override
	public int getId() {

		return id;
	}

	@Override
	public String getNombre() {

		return nombre;
	}

	@Override
	public int getDni() {

		return dni;
	}

	public EspecialidadMedica getEspecialidad() {
		return especialidad;
	}

	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", dni=" + dni + ", especialidad=" + especialidad + "]";
	}
	
}
