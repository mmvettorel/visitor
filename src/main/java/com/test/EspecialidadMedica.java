package com.test;

public enum EspecialidadMedica {
	
	CLINICO(1),
	TRAUMATOLOGO(2),
	ENDOCRINOLOGO(3),
	NUTRICIONISTA(4),
	;
	
	private final int id;
	
	public int getId() {
		return id;
	}
	
	private EspecialidadMedica(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return name().substring(0, 1) + name().substring(1, name().length()).toLowerCase();
	}
	
}
