package com.test;

public class Licenciado extends Persona {

	public Licenciado(int id, String nombre, int dni) {
		super(id, nombre, dni);
	}

	@Override
	public void accept(VisitorPersona visitor) {
		visitor.visit(this);
		
	}

}
