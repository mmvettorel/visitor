package com.test;

public interface VisitorPersona {
	
	public void visit(Medico med);
	
	public void visit(Ingeniero ing);
	
	public void visit(Licenciado lic);
}
