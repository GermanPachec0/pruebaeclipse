package entidades;

public class DomicilioParticular extends Propiedad {
	boolean usoComercialPermitido;
	int habitaciones;
	
	@Override
	public double getAlquilerMensual()
	{
		int porc = habitaciones * 5;
		return super.getAlquilerMensual() + ((super.getAlquilerMensual()*porc)/100); 
	}
	

}
