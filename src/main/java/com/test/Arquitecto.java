package com.test;

public class Arquitecto extends Persona{

	public Arquitecto(int id, String nombre, int dni) {
		super(id, nombre, dni);
	}

	@Override
	public void accept(VisitorPersona visitor) {
		visitor.visit(this);	
	}
	
}
