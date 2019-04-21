package com.test;

public class FabricaCorreoVisitor implements VisitorPersona {
	
	private String mensaje, correo;
	
	public FabricaCorreoVisitor(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo; 
	}
	
	@Override
	public void visit(Medico med) {
		
		correo += "Estimado Dr. " + med.getEspecialidad() + " " + med.getNombre() + ": ";
		correo += mensaje;
	}

	@Override
	public void visit(Ingeniero ing) {
		correo += "Estimado Ing. " + ing.getTipo() + " " + ing.getNombre() + ": ";
		correo += mensaje;
	}

	@Override
	public void visit(Licenciado lic) {
		correo += "Estimado Lic. " + lic.getNombre() + ": ";
		correo += mensaje;
	}

	@Override
	public void visit(Arquitecto arq) {
		correo += "Estimado Arq. " + arq.getNombre() + ": ";
		correo += mensaje;
	}
	
	
}
