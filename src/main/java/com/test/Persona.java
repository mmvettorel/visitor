package com.test;

public abstract class Persona {
	
	private int id;
	private String nombre;
	private int dni;
	
	public Persona(int id, String nombre, int dni) {
		this.id = id;
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", dni=" + dni;
	}
	
	public abstract void accept(VisitorPersona visitor);
	
}
