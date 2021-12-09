package entidades;

public class Cochera extends Propiedad {
	int capacidadVehiculos;
	double cargoExtraPorVehiculo;
	
	
	@Override	
	public double getAlquilerMensual()
	{
		return super.getAlquilerMensual() + (this.capacidadVehiculos * this.cargoExtraPorVehiculo);
			
	}
	
	
}
