package com.test.anonymus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.imageio.ImageTypeSpecifier;

import com.test.EspecialidadMedica;

public class Main {
	
	public static void main(String[] args) {
		
		IPersona per1 = new Medico(1, "Juan", 12345678, EspecialidadMedica.CLINICO);
		IPersona per2 = new Medico(2, "Maria", 34213456, EspecialidadMedica.TRAUMATOLOGO);
		IPersona lic = new Licenciado(3, "Pedro", 9876543);
		
		IPersona per3 = new IPersona() {
			
			@Override
			public String getNombre() {
				return "Jose";
			}
			
			@Override
			public int getId() {
				return 5;
			}
			
			@Override
			public int getDni() {
				return 324123456;
			}
			
			@Override
			public String toString() {
				
				return "Persona [nombre= Jose, dni= 324123456]";
			}
		};
		
		List<IPersona> perList = Arrays.asList(per1, per2, per3, lic);
		
		for (IPersona per : perList) {
			System.out.println(per);
		}
		
		 Stream<IPersona> stream = perList.stream();
		 
		 Predicate<IPersona> docGrandes = new Predicate<IPersona>() {
			 @Override
			public boolean test(IPersona persona) {
				return (persona.getDni() > 30_000_000);
			}
		};
		Predicate<IPersona> docGrandes2 = (IPersona persona) -> { 
			return (persona.getDni() > 30_000_000);
		};
		 
		 Stream<IPersona> streamFiltrado = stream.filter(docGrandes);
		 List<IPersona> listaFiltrada = streamFiltrado.collect(Collectors.toList());
		 
		 List<IPersona> listaFiltrada2 = perList.stream()
				 .filter(p -> p.getDni() > 30_000_000)
				 .collect(Collectors.toList());
		 
		 System.out.println("");

		for (IPersona per : listaFiltrada2) {
			System.out.println(per);
		}
		
		listaFiltrada2.stream().forEach(p -> System.out.println(p));
		
		System.out.println("");
		
		perList.stream().map(p -> p.getDni()).forEach(dni -> System.out.println(dni));
		
		List<Integer> listaDni = perList.stream().map(p -> { 
			int dni = p.getDni();
			System.out.println("procesando dni: " + dni);
			return dni;
		}).collect(Collectors.toList());
//		List<Integer> listaDni = perList.stream().map(IPersona::getDni).collect(Collectors.toList());
		
		System.out.println("");
		
		for (Integer param : listaDni) {
			System.out.println(param);
		}
	}
	
	public static class Licenciado implements IPersona {
		private int id;
		private String nombre;
		private int dni;
		
		public Licenciado(int id, String nombre, int dni) {

			this.id = id;
			this.nombre = nombre;
			this.dni = dni;
			
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

		@Override
		public String toString() {
			return "Licenciado [nombre=" + nombre + ", dni=" + dni + "]";
		}
		
		
	}

}
