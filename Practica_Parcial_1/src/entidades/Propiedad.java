package entidades;

public abstract class Propiedad {
	
	private int id;
	private String direccion;
	private int m2;
	private double ImporteBase;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public double getImporteBase() {
		return ImporteBase;
	}
	public void setImporteBase(double importeBase) {
		ImporteBase = importeBase;
	}
	
	public double getAlquilerMensual()
	{ 
		return this.getImporteBase();
	}
	
	

	
	
}
