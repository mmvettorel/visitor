package com.test;

import org.omg.CORBA.PRIVATE_MEMBER;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
//	@Override
//	public boolean equals(Object per) {
//				
//		if ( !(per instanceof Persona)) {
//			return false;
//		}
//	
//		return (((Persona)per).getId() == id); 
//	}
//	
//	@Override
//	public int hashCode() {
//		Integer id = this.id;
//		
//		return id.hashCode();
//	}
	
	
}
