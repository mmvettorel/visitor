package com.test;

public class FabricaCorreo {
	
	public String crearCorreo(Persona destinatario, String mensaje) {
		
		String correo;
		
		if (destinatario instanceof Medico) {
			correo = "Estimado Dr. " + destinatario.getNombre() + ": ";
		} else if (destinatario instanceof Ingeniero) {
			correo = "Estimado Ing. " + destinatario.getNombre() + ": ";
		} else if (destinatario instanceof Licenciado) {
			correo = "Estimado Lic. " + destinatario.getNombre() + ": " ;
		} else {
			throw new RuntimeException("Profesión de la persona desconocida: "+ destinatario.getClass().getSimpleName()); 
		}
		
		correo += mensaje; 
		
		return correo; 
	}
}
