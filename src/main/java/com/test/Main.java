package com.test;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		
		Medico med1 = new Medico(1, "Juani", 14563789, EspecialidadMedica.TRAUMATOLOGO);
		Ingeniero ing1 = new Ingeniero(2, "Luis", 12897056, TipoIngenierira.ELECTRONICO);
		Licenciado lic1 = new Licenciado(3, "Roberto", 9876432);
		Arquitecto arq1 = new Arquitecto(4, "Isabel", 16745389);
		
		String mensaje = "Lamentamos informarle que ha sido despedido.";
		FabricaCorreoVisitor visitor = new FabricaCorreoVisitor(mensaje);
		
		Collection<Persona> listaPers = new ArrayList<>();
		listaPers.add(med1);
		listaPers.add(lic1);
		listaPers.add(ing1);
		listaPers.add(arq1);
		
		for (Persona destinatario : listaPers) {
			visitor.setCorreo("Anuncio: ");
			destinatario.accept(visitor);
			System.out.println(visitor.getCorreo());
		}
		
	}

}
