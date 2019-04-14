package com.test;

public enum TipoIngenierira {
	
	SISTEMAS(1),
	MECANICO(2),
	ELECTRONICO(3),
	;
	
	private final int id;

	private TipoIngenierira(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
}
