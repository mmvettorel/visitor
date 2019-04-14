package com.test;

public class Ingeniero extends Persona{
	
	public Ingeniero(int id, String nombre, int dni, TipoIngenierira tipo) {
		super(id, nombre, dni);
		this.tipo = tipo;
	}

	private TipoIngenierira tipo;

	public TipoIngenierira getTipo() {
		return tipo;
	}

	@Override
	public void accept(VisitorPersona visitor) {
		visitor.visit(this);
		
	}
	
}
