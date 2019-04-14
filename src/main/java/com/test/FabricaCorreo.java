package com.test;

public class FabricaCorreo {
	
	public String crearCorreo(Persona destinatario, String mensaje) {
		
		String correo;
		
		if (destinatario instanceof Medico) {
			correo = "Estimado Dr. " + ((Medico) destinatario).getEspecialidad() + " " + destinatario.getNombre() + ": ";
		} else if (destinatario instanceof Ingeniero) {
			correo = "Estimado Ing. " + ((Ingeniero) destinatario).getTipo() + " " + destinatario.getNombre() + ": ";
		} else if (destinatario instanceof Licenciado) {
			correo = "Estimado Lic. " + destinatario.getNombre() + ": " ;
		} else {
			throw new RuntimeException("Profesión de la persona desconocida: "+ destinatario.getClass().getSimpleName()); 
		}
		
		correo += mensaje; 
		
		return correo; 
	}
}
