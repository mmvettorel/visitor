package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Medico med1 = new Medico(1, "Juani", 14563789, EspecialidadMedica.TRAUMATOLOGO);
		Ingeniero ing1 = new Ingeniero(2, "Luis", 12897056, TipoIngenierira.ELECTRONICO);
		Licenciado lic1 = new Licenciado(3, "Roberto", 9876432);
		Arquitecto arq1 = new Arquitecto(4, "Isabel", 16745389);
				
		String mensaje = "Lamentamos informarle que ha sido despedido.";
		FabricaCorreoVisitor visitor = new FabricaCorreoVisitor(mensaje);
		
		Map<Persona, String> mapa = new HashMap<>();
		
		Collection<Persona> listaPers = new ArrayList<>();
		listaPers.add(med1);
		listaPers.add(lic1);
		listaPers.add(ing1);
		listaPers.add(arq1);
		
		for (Persona destinatario : listaPers) {
			visitor.setCorreo("Anuncio: ");
			destinatario.accept(visitor);
			System.out.println(visitor.getCorreo());
			
			mapa.put(destinatario, destinatario.getNombre());
		}
		
		/* **************************************************************** */
		Licenciado lic = new Licenciado(3, "Roberto", 9876432);
	
		String nombre = mapa.get(lic);
		
		System.out.println(nombre);
		
		String o = mapa.get(4).toString();
		
	}

}
