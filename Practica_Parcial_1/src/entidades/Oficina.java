package entidades;
import java.util.ArrayList;
import java.util.LinkedList;

public class Oficina extends Propiedad {
	
	boolean PisoTecnico;
	
	LinkedList<Servicios> miServicios = new LinkedList<Servicios>();

	@Override
	public double getAlquilerMensual()
	{
		Double total = 0.0 ;
		for (Servicios serv : miServicios) {
			
			total = serv.getCostoMensual()  + total;
			
		}
		
		return super.getAlquilerMensual() + total;
	}
	


}

