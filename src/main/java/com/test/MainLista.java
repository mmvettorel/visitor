package com.test;

public class MainLista {

	public static void main(String[] args) {
		
		Medico med1 = new Medico(1, "Roberto", 23453657, EspecialidadMedica.NUTRICIONISTA);
		Medico med2 = new Medico(2, "Graciela", 2657482, EspecialidadMedica.TRAUMATOLOGO);
		Medico med3 = new Medico(3, "Horacio", 9875432, EspecialidadMedica.CLINICO);
//		Medico med4 = new Medico(4, "Juan", 123457623, EspecialidadMedica.NUTRICIONISTA);
		
		Medico[] arrMed = new Medico[2];
		arrMed[0] = med1;
		arrMed[1] = med2;
		
//		Medico[] arrMed2 = new Medico[]{med3, med4};
		
		Contenedor contenedor = new Contenedor(med1, med2, med3);
		
		
		 for (Persona e : contenedor.getPersona()) {
			 System.out.println(e);
		 }
		
	}

}
